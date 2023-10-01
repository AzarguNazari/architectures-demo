package com.example.studentapp.business.student;

import com.example.studentapp.presentation.student.StudentService;
import com.example.studentapp.presistance.student.StudentDto;
import org.springframework.web.bind.annotation.*;

@RestController("/v1/api/students")
public class StudentController {

    private StudentService studentService;

    @PostMapping
    public StudentDto addNewStudent(@RequestBody StudentDto student){
        return studentService.saveStudent(student);
    }

    @GetMapping("/{studentId}")
    public StudentDto getStudent(@PathVariable Long studentId){
        return studentService.getStudent(studentId);
    }

    @GetMapping("/{studentId}")
    public void deleteStudent(@PathVariable Long studentId){
        studentService.deleteStudent(studentId);
    }

}
