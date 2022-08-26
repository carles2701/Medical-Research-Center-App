package com.carles2701.MedicalResearchCenterApp.test;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Test {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String testTitle;

    @Column(nullable = false)
    private String typeOfTest;

    public Test(Long id, String testTitle, String typeOfTest) {
        this.id = id;
        this.testTitle = testTitle;
        this.typeOfTest = typeOfTest;
    }
}
