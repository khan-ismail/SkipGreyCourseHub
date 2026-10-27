package com.skipgrey.skipgreycoursehub.DTO;

import com.skipgrey.skipgreycoursehub.enums.StudentStatus;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record StudentResponseDto (
        Long id,
        String firstName,
        String lastName,
        String email,
        String phoneNumber,
        LocalDate dateOfBirth,
        String gender,
        String address,
        StudentStatus status,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {}