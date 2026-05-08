//package com.baobao.superapp.entity.unione;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//@NoArgsConstructor
//@Data
//@Entity
//@Table(name = "Majors")
//
//public class Major {
//    @Id
//    @Column(name = "Id")
//    private String id; //ma chuyen nghanh
//    @Column(name = "Name", columnDefinition = "NVARCHAR(255)", nullable = false)
//    private String name; //ten chuyen nghanh
//
//    public Major(String id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    //mot Major co nhieu sinh vien
//    //Muon luu nhieu info dung List ArrayList
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    // nho cau nay thi ben phia many se doi 1 FK//JoinColumn
////    cascade = CascadeType.ALL : vi du tao 1 chuyen nganh roi dung studentList add 5 Student vao sao do persist() Major vao DB thi tu dong 5 Student nay duoc them vao DB
//    @JoinColumn(name = "majorId") //tao ben table many 1 cot FK co ten la majorId
//    private List<Student> students = new ArrayList<>();
//
//    public void addStudent(Student student) {
//        students.add(student);
//    }
//
//
//
//
//
//
//}
