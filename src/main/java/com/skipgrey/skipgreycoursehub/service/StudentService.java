package com.skipgrey.skipgreycoursehub.service;


import com.skipgrey.skipgreycoursehub.DTO.StudentPatchRequestDto;
import com.skipgrey.skipgreycoursehub.DTO.StudentRequestDto;
import com.skipgrey.skipgreycoursehub.DTO.StudentResponseDto;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<StudentResponseDto> getAllStudent();

    StudentResponseDto getStudentById(long id);

    StudentResponseDto saveStudent(StudentRequestDto studentRequest);

    StudentResponseDto updateStudent(long id, StudentRequestDto studentRequestDto);

    StudentResponseDto updatePatchStudent(long id, StudentPatchRequestDto studentPatchRequestDto);

    StudentResponseDto deleteStudentById(long id);
}
