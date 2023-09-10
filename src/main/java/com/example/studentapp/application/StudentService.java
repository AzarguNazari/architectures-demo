package com.example.studentapp.application;
import com.example.studentapp.domain.Student;
import com.example.studentapp.infrastructure.primary.StudentUseCase;
import com.example.studentapp.infrastructure.secondary.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements StudentUseCase {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student registerStudent(Student student) {
        // You can add validation, business logic, etc., before saving
        return studentRepository.save(student);
    }

    @Override
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void removeStudent(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student updateStudent(Long id, Student updatedStudent) {
        if(studentRepository.existsById(id)) {
            updatedStudent.setId(id); // Ensure the correct ID is set on the updated student
            return studentRepository.save(updatedStudent);
        }
        throw new RuntimeException("Student not found with ID: " + id); // Or use a custom exception
    }
}
