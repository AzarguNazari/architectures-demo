package com.example.studentapp.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Student student;
    private String subject;
    private double score;

    public Grade(Student student, String subject, double score) {
        this.student = student;
        this.subject = subject;
        this.score = score;
    }
}
