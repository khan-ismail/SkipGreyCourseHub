package com.skipgrey.skipgreycoursehub.DTO;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record CourseResponseDto(
        Long id,
        Long instructorId,
        String courseCode,
        String courseName,
        String description,
        Integer durationHours,
        BigDecimal fee,
        String level,
        String status,
        LocalDate startDate,
        LocalDate endDate,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {}