package com.skipgrey.skipgreycoursehub.mapper;

import com.skipgrey.skipgreycoursehub.DTO.StudentRequestDto;
import com.skipgrey.skipgreycoursehub.DTO.StudentResponseDto;
import com.skipgrey.skipgreycoursehub.entity.StudentEntity;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    public StudentResponseDto toDTO(StudentEntity entity) {
        return new StudentResponseDto(
                entity.getId(),
                entity.getFirstName(),
                entity.getLastName(),
                entity.getEmail(),
                entity.getPhoneNumber(),
                entity.getDateOfBirth(),
                entity.getGender(),
                entity.getAddress(),
                entity.getStatus(),
                entity.getCreatedAt(),
                entity.getUpdatedAt()
        );
    }

    public StudentEntity toEntity(StudentRequestDto dto) {

        StudentEntity student = new StudentEntity();

        student.setFirstName(dto.firstName());
        student.setLastName(dto.lastName());
        student.setEmail(dto.email());
        student.setPhoneNumber(dto.phoneNumber());
        student.setDateOfBirth(dto.dateOfBirth());
        student.setGender(dto.gender());
        student.setAddress(dto.address());
        student.setStatus(dto.status());

        return student;
    }
}