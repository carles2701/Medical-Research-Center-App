package com.carles2701.MedicalResearchCenterApp.userAgreement;

import com.carles2701.MedicalResearchCenterApp.exception.NotFoundException;
import com.carles2701.MedicalResearchCenterApp.user.User;
import com.carles2701.MedicalResearchCenterApp.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class UserAgreementController {

    private final UserAgreementService userAgreementService;

    @Autowired
    public UserAgreementController(UserAgreementService userAgreementService) {
        this.userAgreementService = userAgreementService;
    }

    @GetMapping
    public List<UserAgreement> getAllUserAgreements(){
        return userAgreementService.getAllUserAgreements();
    }

    @PostMapping("/save")
    public User saveUserAgreement(@RequestBody UserAgreement userAgreement) {
        return userAgreementService.createUserAgreement(userAgreement);
    }

    @GetMapping("/{id}")
    public User getUserAgreementById(@PathVariable("id") Long id) throws NotFoundException {
        return userAgreementService.getUserAgreementById(id);
    }

    @PutMapping("/{id}")
    public User updateUserAgreement(@RequestBody UserAgreement userAgreement, @PathVariable("id") Long id) throws NotFoundException {
        return userAgreementService.updateUserAgreement(id, userAgreement);
    }

    @DeleteMapping("/{id}")
    public void deleteUserAgreement(
            @PathVariable("id") Long id) {
        userAgreementService.deleteUserAgreementById(id);
    }
}
