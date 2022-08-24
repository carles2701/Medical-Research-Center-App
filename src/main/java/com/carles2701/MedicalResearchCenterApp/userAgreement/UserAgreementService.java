package com.carles2701.MedicalResearchCenterApp.userAgreement;

import com.carles2701.MedicalResearchCenterApp.exception.NotFoundException;
import com.carles2701.MedicalResearchCenterApp.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAgreementService {

    private final UserAgreementRepository userAgreementRepository;

    @Autowired
    public UserAgreementService(UserAgreementRepository userAgreementRepository) {
        this.userAgreementRepository = userAgreementRepository;
    }

    public List<UserAgreement> getAllUserAgreements() {
    }

    public User createUserAgreement(UserAgreement userAgreement) {
    }

    public User getUserAgreementById(Long id)  throws NotFoundException {
    }

    public User updateUserAgreement(Long id, UserAgreement userAgreement) throws NotFoundException {
    }

    public void deleteUserAgreementById(Long id) {
    }
}
