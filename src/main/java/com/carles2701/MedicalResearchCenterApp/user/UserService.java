package com.carles2701.MedicalResearchCenterApp.user;

import com.carles2701.MedicalResearchCenterApp.exception.NotFoundException;
import com.carles2701.MedicalResearchCenterApp.role.Role;
import com.carles2701.MedicalResearchCenterApp.role.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Autowired
    public UserService(UserRepository userRepository,
                       RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    
    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(Long id) throws NotFoundException {
        return userRepository
                .findById(id)
                .orElseThrow(() -> new NotFoundException("User not found"));
    }


    public User updateUser(Long id, User user) {
        User updatedUser = new User();
        updatedUser.setUsername(user.getUsername());
        updatedUser.setPassword(user.getPassword());
        updatedUser.setName(user.getName());
        updatedUser.setSurname(user.getSurname());
        updatedUser.setAge(user.getAge());
        updatedUser.setPassword(user.getPassword());
        updatedUser.setHouseNumber(user.getUsername());
        updatedUser.setPhoneNumber(user.getPhoneNumber());
        updatedUser.setCity(user.getCity());
        updatedUser.setCountry(user.getCountry());

        return userRepository.save(updatedUser);
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }


    public void addRoleToUser(Long userId, Long roleId) throws NotFoundException {
        //Complete after mapping
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new NotFoundException("User not found"));
        Role role = roleRepository.findById(roleId)
                .orElseThrow(() -> new NotFoundException("Role not found"));
    }
}
