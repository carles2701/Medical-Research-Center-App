package com.carles2701.MedicalResearchCenterApp.userAgreement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAgreementController {

    private final UserAgreementService userAgreementService;

    @Autowired
    public UserAgreementController(UserAgreementService userAgreementService) {
        this.userAgreementService = userAgreementService;
    }
}
