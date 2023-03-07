package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private String firstName, lastName, email, password;

    private String address, address2, city, state;

    private LocalDate birthDate;

    private int zipCode;


}
