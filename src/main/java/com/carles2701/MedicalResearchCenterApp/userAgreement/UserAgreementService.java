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
        return userAgreementRepository.findAll();
    }

    public UserAgreement createUserAgreement(UserAgreement userAgreement) {
        return userAgreementRepository.save(userAgreement);
    }

    public UserAgreement getUserAgreementById(Long id) throws NotFoundException {
        return userAgreementRepository
                .findById(id)
                .orElseThrow(() -> new NotFoundException("Agreement not found"));
    }

    public void deleteUserAgreementById(Long id) {
        userAgreementRepository.deleteById(id);
    }
}
