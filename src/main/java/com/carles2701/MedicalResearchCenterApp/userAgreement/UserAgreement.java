package com.carles2701.MedicalResearchCenterApp.userAgreement;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserAgreement {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate dateOfAgreement;

    public UserAgreement(LocalDate dateOfAgreement){
        this.dateOfAgreement = dateOfAgreement;
    }

}
