package com.carles2701.MedicalResearchCenterApp.userAgreement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAgreementService {

    private final UserAgreementRepository userAgreementRepository;

    @Autowired
    public UserAgreementService(UserAgreementRepository userAgreementRepository) {
        this.userAgreementRepository = userAgreementRepository;
    }
}
