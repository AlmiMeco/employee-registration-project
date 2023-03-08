package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

//    @NotNull   ||  (field != null)
//    @NotEmpty  ||  (field != "")
//    @NotBlank  ||  (field != "  ")


    private String firstName, lastName, email, password, address, city, state;

    private String address2;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDate;

    private int zipCode;


}
