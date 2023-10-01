package com.example.studentapp.infrastructure.primary;


import com.example.studentapp.domain.Student;

import java.util.List;
import java.util.Optional;

public interface StudentUseCase {

    /**
     * Registers a new student.
     *
     * @param student the student to be registered.
     * @return the registered student with any additional information (like an auto-generated ID).
     */
    Student registerStudent(Student student);

    /**
     * Retrieves a student by their ID.
     *
     * @param id the ID of the student.
     * @return an Optional containing the found student, or empty if not found.
     */
    Optional<Student> getStudentById(Long id);

    /**
     * Retrieves all registered students.
     *
     * @return a list of all students.
     */
    List<Student> getAllStudents();

    /**
     * Removes a student by their ID.
     *
     * @param id the ID of the student to be removed.
     */
    void removeStudent(Long id);

    /**
     * Updates the details of a student.
     *
     * @param id the ID of the student to be updated.
     * @param updatedStudent the new details for the student.
     * @return the updated student.
     */
    Student updateStudent(Long id, Student updatedStudent);
}