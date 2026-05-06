package com.baobao.superapp.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@Data
@Entity
@Table(name = "Lecturors")


public class Lecturer {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Id tu tang bat dau tu 1
    private int Id;
    @Column(name = "Name",columnDefinition = "NVARCHAR(255)",nullable = false)
    private String name;
    @Column(name = "YOB",nullable = false)
    private int yob;
    @Column(name = "Salary",nullable = false)
    private long salary;
    public Lecturer(String name, int yob, long salary) {
        this.name = name;
        this.yob = yob;
        this.salary = salary;
    }
}
