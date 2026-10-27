package com.skipgrey.skipgreycoursehub.DTO;

import com.skipgrey.skipgreycoursehub.enums.InstructorStatus;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record InstructorRequestDto(

        @NotBlank
        @Size(max = 100)
        String firstName,

        @NotBlank
        @Size(max = 100)
        String lastName,

        @NotBlank
        @Email
        @Size(max = 255)
        String email,

        @NotBlank
        @Size(max = 20)
        String phoneNumber,

        @NotBlank
        @Size(max = 150)
        String specialization,

        @NotBlank
        @Size(max = 255)
        String qualification,

        @NotNull
        LocalDate hireDate,

        @NotNull
        @Positive
        Double salary,

        @NotNull
        InstructorStatus status

) {}