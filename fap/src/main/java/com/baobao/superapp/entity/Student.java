package com.baobao.superapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.Nationalized;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table (name="Students")

public class Student {
    @Id
    @Column(name = "ID")
    private String Id;
    @Column(name = "Name", nullable = false,length = 200)
    @Nationalized
    private String name;
    @Column(name="YOB",nullable=false)
    private int yob;
    @Column(name="GPA",nullable=false)
    private double gpa;
}
