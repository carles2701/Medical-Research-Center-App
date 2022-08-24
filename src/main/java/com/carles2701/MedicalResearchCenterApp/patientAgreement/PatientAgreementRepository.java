package com.carles2701.MedicalResearchCenterApp.patientAgreement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientAgreementRepository extends JpaRepository<PatientAgreement, Long> {
}
