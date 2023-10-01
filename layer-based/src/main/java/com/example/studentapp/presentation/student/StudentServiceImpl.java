package com.example.studentapp.presentation.student;

import com.example.studentapp.presistance.student.Student;
import com.example.studentapp.presistance.student.StudentDto;
import com.example.studentapp.presistance.student.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.lang.String.format;

@Service
class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository;

    @Override
    public StudentDto saveStudent(StudentDto studentDto) {
        var savedStudent = studentRepository.save(studentDto.toEntity());
        return savedStudent.toDto();
    }

    @Override
    public List<StudentDto> getAllStudents() {
        return studentRepository.findAll().stream().map(Student::toDto).toList();
    }

    @Override
    public StudentDto getStudent(Long studentId) {
        return studentRepository.findById(studentId).orElseThrow(() -> new RuntimeException(format("Student with id %s is not fond", studentId))).toDto();
    }

    @Override
    public void deleteStudent(Long studentId) {
        if(studentRepository.existsById(studentId)){
            studentRepository.deleteById(studentId);
        }
        else{
            throw new RuntimeException(format("Student with %s doesn't exist", studentId));
        }
    }
}
