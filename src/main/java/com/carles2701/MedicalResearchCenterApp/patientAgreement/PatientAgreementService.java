package com.carles2701.MedicalResearchCenterApp.patientAgreement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientAgreementService {

    private final PatientAgreementRepository patientAgreementRepository;

    @Autowired
    public PatientAgreementService(PatientAgreementRepository patientAgreementRepository) {
        this.patientAgreementRepository = patientAgreementRepository;
    }
}
