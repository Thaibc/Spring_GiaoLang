package com.baobao.superapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table (name="Students")

public class Student {
    @Id
    @Column(name = "ID",columnDefinition = "CHAR(8)")
    private String Id;
    @Column(name = "Name",columnDefinition = "NVARCHAR(200)", nullable = false)
    private String name;
    @Column(name="YOB",nullable=false)
    private int yob;
    @Column(name="GPA",nullable=false)
    private double gpa;
}
