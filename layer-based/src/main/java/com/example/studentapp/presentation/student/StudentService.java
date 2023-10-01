package com.example.studentapp.presentation.student;

import com.example.studentapp.presistance.student.Student;
import com.example.studentapp.presistance.student.StudentDto;

import java.util.List;

public interface StudentService {

    StudentDto saveStudent(StudentDto student);

    List<StudentDto> getAllStudents();

    StudentDto getStudent(Long studentId);

    void deleteStudent(Long studentId);

}
