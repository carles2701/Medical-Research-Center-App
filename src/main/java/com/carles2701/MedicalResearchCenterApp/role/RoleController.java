package com.carles2701.MedicalResearchCenterApp.role;

import com.carles2701.MedicalResearchCenterApp.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoleController {

    private final RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public List<Role> getAllRoles(){
        return roleService.getAllRoles();
    }

    @PostMapping("/add")
    public Role saveRole(@RequestBody Role role) {
        return roleService.saveRole(role);
    }

    @GetMapping("/{id}")
    public Role getRoleById(@PathVariable("id") Long id) throws NotFoundException {
        return roleService.getRoleById(id);
    }

    @PutMapping("/{id}")
    public Role updateRole(@RequestBody Role role, @PathVariable("id") Long id) throws NotFoundException {
        return roleService.updateRole(id, role);
    }

    @DeleteMapping("/{id}")
    public void deleteRole(
            @PathVariable("id") Long id) {
        roleService.deleteRoleById(id);
    }
}
