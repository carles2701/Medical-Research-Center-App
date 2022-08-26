package com.carles2701.MedicalResearchCenterApp.role;

import com.carles2701.MedicalResearchCenterApp.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    public Role getRoleById(Long id) throws NotFoundException {
        return roleRepository
                .findById(id)
                .orElseThrow(() -> new NotFoundException("Role not found"));
    }

    public Role updateRole(Long id, Role role) {
        Role updatedRole = new Role();
        updatedRole.setRoleName(role.getRoleName());

        return roleRepository.save(updatedRole);
    }

    public void deleteRoleById(Long id) {
        roleRepository.deleteById(id);
    }
}
