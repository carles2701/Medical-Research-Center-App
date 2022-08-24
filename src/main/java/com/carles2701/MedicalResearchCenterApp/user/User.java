package com.carles2701.MedicalResearchCenterApp.user;

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
public class User {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    @Column(nullable = false)
    private String street;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private String age;

    @Column(nullable = false)
    private String houseNumber;

    @Column(nullable = false)
    private String phoneNumber;

    public User(String username,
                String password,
                String name,
                String surname,
                String street,
                String city,
                String country,
                String age,
                String houseNumber,
                String phoneNumber) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.street = street;
        this.city = city;
        this.country = country;
        this.age = age;
        this.houseNumber = houseNumber;
        this.phoneNumber = phoneNumber;
    }

}
