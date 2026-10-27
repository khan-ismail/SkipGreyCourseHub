package com.skipgrey.skipgreycoursehub.DTO;

import com.skipgrey.skipgreycoursehub.enums.InstructorStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record InstructorResponseDto(
        Long id,
        String firstName,
        String lastName,
        String email,
        String phoneNumber,
        String specialization,
        String qualification,
        LocalDate hireDate,
        Double salary,
        InstructorStatus status,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {}