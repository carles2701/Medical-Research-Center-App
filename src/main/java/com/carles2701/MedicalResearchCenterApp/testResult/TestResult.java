package com.carles2701.MedicalResearchCenterApp.testResult;

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
public class TestResult {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate dateOfTest;

    @Column(nullable = false)
    private String result;

    @Column(nullable = false)
    private String description;

    public TestResult(Long id, LocalDate dateOfTest, String result, String description) {
        this.id = id;
        this.dateOfTest = dateOfTest;
        this.result = result;
        this.description = description;
    }
}
