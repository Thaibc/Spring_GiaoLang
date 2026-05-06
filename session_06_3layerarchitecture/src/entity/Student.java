package com.baobao.superapp.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //bat buoc them dum taooooooooooo
@Entity
@Table(name = "Student_session6")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long Id;
    @Column(name = "Name", columnDefinition = "NVARCHAR(255)", nullable = false)
    private String name;
    @Column(name = "YOB", nullable = false)
    private int yob;
    @Column(name = "GPA", nullable = false)
    private double gpa;

    public Student(String name, int yob, double gpa) {
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }
}
