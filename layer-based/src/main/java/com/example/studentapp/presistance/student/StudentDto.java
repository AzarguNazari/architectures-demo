package com.example.studentapp.presistance.student;

import lombok.Builder;

@Builder
public class StudentDto {
    private Long id;
    private String name;
    private String email;

    public Student toEntity(){
        return Student.builder()
                .id(id)
                .email(email)
                .name(name)
                .build();
    }
}
