package com.skipgrey.skipgreycoursehub.controller;

import com.skipgrey.skipgreycoursehub.DTO.StudentPatchRequestDto;
import com.skipgrey.skipgreycoursehub.DTO.StudentRequestDto;
import com.skipgrey.skipgreycoursehub.DTO.StudentResponseDto;
import com.skipgrey.skipgreycoursehub.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Validated
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/students")
    public List<StudentResponseDto> getAllStudent() {
        return studentService.getAllStudent();
    }

    @GetMapping("/students/{id}")
    public StudentResponseDto getStudentById(@PathVariable long id) {
        return studentService.getStudentById(id);
    }

    @PostMapping("/students")
    public StudentResponseDto saveStudent(@Valid @RequestBody StudentRequestDto studentRequest) {
        return studentService.saveStudent(studentRequest);
    }

    @PutMapping("/students/{id}")
    public StudentResponseDto updateStudent(@PathVariable long id, @Valid @RequestBody StudentRequestDto studentRequest) {
        return studentService.updateStudent(id, studentRequest);
    }

    @PatchMapping("/students/{id}")
    public StudentResponseDto updatePatchStudent(@PathVariable Long id, @RequestBody StudentPatchRequestDto request) {
        return studentService.updatePatchStudent(id, request);
    }

    @DeleteMapping("/students/{id}")
    public StudentResponseDto deleteStudentById(@PathVariable long id) {
        return studentService.deleteStudentById(id);
    }
}
