package com.skipgrey.skipgreycoursehub.DTO;

import com.skipgrey.skipgreycoursehub.enums.StudentStatus;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record StudentPatchRequestDto(

        @Size(max = 100)
        String firstName,

        @Size(max = 100)
        String lastName,

        @Email
        @Size(max = 150)
        String email,

        @Size(max = 20)
        String phoneNumber,

        @Past
        LocalDate dateOfBirth,

        @Size(max = 20)
        String gender,

        @Size(max = 255)
        String address,

        StudentStatus status
) {}
