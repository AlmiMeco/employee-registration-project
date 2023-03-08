package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private String firstName, lastName, email, password;

    private String address, address2, city, state;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDate;

    private int zipCode;


}
