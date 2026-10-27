package com.skipgrey.skipgreycoursehub.service.impl;

import com.skipgrey.skipgreycoursehub.DTO.StudentPatchRequestDto;
import com.skipgrey.skipgreycoursehub.DTO.StudentRequestDto;
import com.skipgrey.skipgreycoursehub.DTO.StudentResponseDto;
import com.skipgrey.skipgreycoursehub.entity.StudentEntity;
import com.skipgrey.skipgreycoursehub.exception.StudentNotFoundException;
import com.skipgrey.skipgreycoursehub.mapper.StudentMapper;
import com.skipgrey.skipgreycoursehub.repository.StudentRepository;
import com.skipgrey.skipgreycoursehub.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    @Transactional(readOnly = true)
    public List<StudentResponseDto> getAllStudent() {
        return studentRepository.findAll()
                .stream()
                .map(studentMapper::toDTO)
                .toList();
    }

    @Override
    public StudentResponseDto getStudentById(long id) {
        StudentEntity entity = studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException("Student not found with id: " + id));
        return studentMapper.toDTO(entity);
    }

    @Transactional
    @Override
    public StudentResponseDto saveStudent(StudentRequestDto studentRequest) {
        StudentEntity studentEntity = studentMapper.toEntity(studentRequest);
        studentEntity = studentRepository.save(studentEntity);
        return studentMapper.toDTO(studentEntity);
    }

    @Override
    @Transactional
    public StudentResponseDto updateStudent(
            long id,
            StudentRequestDto studentRequestDto) {

        StudentEntity student = studentRepository.findById(id)
                .orElseThrow(() ->
                        new StudentNotFoundException(
                                "Student not found with id: " + id
                        )
                );

        student.setFirstName(studentRequestDto.firstName());
        student.setLastName(studentRequestDto.lastName());
        student.setEmail(studentRequestDto.email());
        student.setAddress(studentRequestDto.address());
        student.setPhoneNumber(studentRequestDto.phoneNumber());
        student.setGender(studentRequestDto.gender());
        student.setDateOfBirth(studentRequestDto.dateOfBirth());
        student.setStatus(studentRequestDto.status());

        return studentMapper.toDTO(student);
    }

    @Override
    @Transactional
    public StudentResponseDto updatePatchStudent(
            long id,
            StudentPatchRequestDto studentPatchRequestDto) {

        StudentEntity student = studentRepository.findById(id)
                .orElseThrow(() ->
                        new StudentNotFoundException(
                                "Student not found with id: " + id
                        )
                );

        if (studentPatchRequestDto.firstName() != null) {
            student.setFirstName(studentPatchRequestDto.firstName());
        }

        if (studentPatchRequestDto.lastName() != null) {
            student.setLastName(studentPatchRequestDto.lastName());
        }

        if (studentPatchRequestDto.email() != null) {
            student.setEmail(studentPatchRequestDto.email());
        }

        if (studentPatchRequestDto.phoneNumber() != null) {
            student.setPhoneNumber(studentPatchRequestDto.phoneNumber());
        }

        if (studentPatchRequestDto.dateOfBirth() != null) {
            student.setDateOfBirth(studentPatchRequestDto.dateOfBirth());
        }

        if (studentPatchRequestDto.gender() != null) {
            student.setGender(studentPatchRequestDto.gender());
        }

        if (studentPatchRequestDto.address() != null) {
            student.setAddress(studentPatchRequestDto.address());
        }

        if (studentPatchRequestDto.status() != null) {
            student.setStatus(studentPatchRequestDto.status());
        }

        return studentMapper.toDTO(student);
    }

    @Override
    public StudentResponseDto deleteStudentById(long id) {
        StudentEntity findStudent = studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException("Student not found with id: " + id));
        studentRepository.deleteById(id);
        return studentMapper.toDTO(findStudent);
    }
}
