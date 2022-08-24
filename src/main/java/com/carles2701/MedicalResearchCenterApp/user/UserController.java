package com.carles2701.MedicalResearchCenterApp.user;

import com.carles2701.MedicalResearchCenterApp.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/save")
    public User saveUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long id) throws NotFoundException {
        return userService.getUserById(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@RequestBody User user, @PathVariable("id") Long id) throws NotFoundException {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(
            @PathVariable("id") Long id) {
        userService.deleteUserById(id);
    }

    @PutMapping("/{userId}/role/{roleId}")
    public void addRoleToUser(@PathVariable("userId") Long userId, @PathVariable("roleId") Long roleId) throws NotFoundException {
        userService.addRoleToUser(userId, roleId);
    }



}
