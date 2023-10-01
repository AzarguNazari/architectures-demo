package com.example.studentapp.ports.adapter.secondary;


import com.example.studentapp.domain.Student;
import com.example.studentapp.infrastructure.secondary.StudentRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaStudentRepository extends StudentRepository, JpaRepository<Student, Long> {
    // The JpaRepository already provides the basic CRUD methods (save, findById, findAll, deleteById, etc.).
    // You can add custom queries here if needed.
}
