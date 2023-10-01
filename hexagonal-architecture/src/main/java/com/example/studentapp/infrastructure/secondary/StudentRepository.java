package com.example.studentapp.infrastructure.secondary;

import com.example.studentapp.domain.Student;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {

    Student save(Student student);

    Optional<Student> findById(Long id);

    List<Student> findAll();

    void deleteById(Long id);

    boolean existsById(Long id);
}