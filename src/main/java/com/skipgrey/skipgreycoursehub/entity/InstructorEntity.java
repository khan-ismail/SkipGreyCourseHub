package com.skipgrey.skipgreycoursehub.entity;


import com.skipgrey.skipgreycoursehub.enums.InstructorStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "instructors",
        uniqueConstraints = {@UniqueConstraint(name = "email", columnNames = "email")}
)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InstructorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "specialization", nullable = false)
    private String specialization;

    @Column(name = "qualification", nullable = false)
    private String qualification;

    @Column(name = "hire_date", nullable = false)
    private LocalDate hire_date;

    @Column(name = "salary", nullable = false)
    private Double salary;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private InstructorStatus status;

    @Column(
            name = "created_at",
            nullable = false,
            insertable = false,
            updatable = false
    )
    private LocalDateTime createdAt;

    @Column(
            name = "updated_at",
            nullable = false,
            insertable = false,
            updatable = false
    )
    private LocalDateTime updatedAt;
}
