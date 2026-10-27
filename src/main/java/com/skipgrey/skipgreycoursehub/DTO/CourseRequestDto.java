package com.skipgrey.skipgreycoursehub.DTO;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;

public record CourseRequestDto(

        @NotNull
        @Positive
        Long instructorId,

        @NotBlank
        @Size(max = 30)
        String courseCode,

        @NotBlank
        @Size(max = 150)
        String courseName,

        String description,

        @NotNull
        @Positive
        Integer durationHours,

        @NotNull
        @DecimalMin(value = "0.00", inclusive = true)
        @Digits(integer = 10, fraction = 2)
        BigDecimal fee,

        @NotBlank
        @Size(max = 30)
        String level,

        @NotBlank
        @Size(max = 20)
        String status,

        @NotNull
        LocalDate startDate,

        @NotNull
        LocalDate endDate

) {}