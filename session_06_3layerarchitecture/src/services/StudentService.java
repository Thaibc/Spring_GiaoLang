package com.baobao.superapp.services;

import com.baobao.superapp.entity.Student;
import com.baobao.superapp.infra.jpaUtils;
import com.baobao.superapp.reposistory.StudentRepo;

import java.util.List;


public class StudentService {
//    class nay nhan nhung  request tu nguoi dung gui xuong repo lay du lieu sau do xu ly roi tra ve client

    public StudentService() {
    }

    private StudentRepo studentRepo = new StudentRepo();

    //    them moi sinh vien
    public void createStudent(Student student) {
        studentRepo.insert(student);
    }

    //  lay 1 student by Id
    public Student getStudentById(long id) {
        return studentRepo.selectById(id);
    }

    //    lay tat ca student
    public List<Student> getAllStudents() {
        return studentRepo.selectAll();
    }

    // update mot sinh vien
    public void updateStudent(long id, Student newStudent) {
        studentRepo.update(id, newStudent.getName(), newStudent.getYob(), newStudent.getGpa());
    }

    //    xoa 1 sinh vien
    public void deleteStudent(long id) {
        studentRepo.delete(id);
    }


}
