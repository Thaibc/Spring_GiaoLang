package com.baobao.superapp.entity.bidirectional;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@Data
@Entity
@Table(name = "Students")


public class Student {
    @Id
    @Column(name = "Id", columnDefinition = "CHAR(8)")
    private String id;
    @Column(name = "Name", columnDefinition = "NVARCHAR(2555)", nullable = false)
    private String name;
    @Column(name = "Yob", nullable = false)
    private int yob;
    @Column(name = "GPA", nullable = false)
    private double gpa;
    //    doi voi nhin tu phia many thi ko co khai niem cascade tuc la khi muon persist 1 sinh vien thi ta phai persist cai chuyen nganh cua sinh vien do truoc
    @ManyToOne
    @JoinColumn(name = "majorId")
    private Major major;


    //    tui Student ne thi tui thuoc 1 chuyen nganh vay khi new ra tui xun DB a thi tui muon luu cai khoa ngoai la majorId vay can mot cong cu de anh xa tu tu duy OOP sang DB
    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

    //    them major cho sinh vien hoac doi chuyen nganh cho svien
    public void setMajor(Major major) {
        this.major = major;
    }


    // lay  Major cua sinh vien

    public Major getMajor() {
        return major;
    }



}
