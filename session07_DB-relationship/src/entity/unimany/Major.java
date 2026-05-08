//package com.baobao.superapp.entity.unimany;
//
//import jakarta.persistence.*;
//import lombok.Data;
//import lombok.NoArgsConstructor;
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
//
//    // nho cau nay thi ben phia many se doi 1 FK//JoinColumn
////    cascade = CascadeType.ALL : vi du tao 1 chuyen nganh roi dung studentList add 5 Student vao sao do persist() Major vao DB thi tu dong 5 Student nay duoc them vao DB
//
////    private List<Student> students = new ArrayList<>();
//
////    public void addStudent(Student student) {
////        students.add(student);
////    }
//
//
//
//
//
//
//}
