package com.carles2701.MedicalResearchCenterApp.patientAgreement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientAgreementController {

    private final PatientAgreementService patientAgreementService;

    @Autowired
    public PatientAgreementController(PatientAgreementService patientAgreementService) {
        this.patientAgreementService = patientAgreementService;
    }
}
