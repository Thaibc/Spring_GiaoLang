package com.baobao.superapp;

import com.baobao.superapp.entity.Student;
import com.baobao.superapp.services.StudentService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //them moi sinh vien
        StudentService studentService = new StudentService();
//        studentService.createStudent(new Student("Nguyễn Thành Thái", 2005, 9.0));

        //  lay 1 sinh vien By id
//        System.out.println(studentService.getStudentById(1).toString());

//          lay tat ca sinh vien
//        for (Student student : studentService.getAllStudents()) {
//            System.out.println(student.toString());
//        }

        //        update mot sinh vien

//        studentService.updateStudent(1, new Student("Nguyễn Thành Huy", 2009, 7.0));

        //    xoa 1 sinh vien
        studentService.deleteStudent(1);
    }
}