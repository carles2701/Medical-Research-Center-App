package com.carles2701.MedicalResearchCenterApp.testOrder;

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
public class TestOrder {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate dateOfOrder;

    public TestOrder(Long id, LocalDate dateOfOrder) {
        this.id = id;
        this.dateOfOrder = dateOfOrder;
    }
}
