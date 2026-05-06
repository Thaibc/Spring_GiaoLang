package com.baobao.superapp;

import com.baobao.superapp.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        insertStudent();
    }

//    Insert Student

    public static void insertStudent() {
        Student student1 = new Student("SE123", "Hoài Linh", 2001, 8.3);
        Student student2 = new Student("SE456", "Trấn Thành", 2003, 9.0);
        Student student3 = new Student("SE333", "Trường Giang", 2001, 8.3);
        Student student4 = new Student("SE444", "Nhật Cường", 2003, 9.0);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.baobao.superapp-PU");

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(student1);
        em.persist(student2);
        em.persist(student3);
        em.persist(student4);
        em.getTransaction().commit();
        List<Student> studentList = em.createQuery("FROM Student", Student.class).getResultList();
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
        em.close();
        emf.close();
    }


//Delete Student

    public static void deleteStudent() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.baobao.superapp-PU");

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Student student3 = em.find(Student.class, "SE333");
        if (student3 != null) {
            em.remove(student3);
            System.out.println("xoa user " + student3.getId() + " thanh cong");
        }
        Student student4 = em.find(Student.class, "SE444");
        if (student4 != null) {
            em.remove(student4);
            System.out.println("xoa user " + student4.getId() + " thanh cong");
        }
        em.getTransaction().commit();
        List<Student> studentList = em.createQuery("FROM Student", Student.class).getResultList();
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
        em.close();
        emf.close();
    }


//   Find Student

    public static void findStudent() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.baobao.superapp-PU");

        EntityManager em = emf.createEntityManager();
        Student s3 = em.find(Student.class, "SE123");
        if (s3 != null) {
            System.out.println(s3.toString());
        } else {
            System.out.println("ko tim thay");
        }
        em.close();
        emf.close();
    }

    //    su dung find() Update
    public static void findUpdateStudent() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.baobao.superapp-PU");

        EntityManager em = emf.createEntityManager();
        Student s3 = em.find(Student.class, "SE124");
        em.getTransaction().begin();
        if (s3 != null) {
            s3.setName("Truong Giang");
            s3.setYob(2009);
            System.out.println("update user " + s3.getId() + " thanh cong");
        }
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    //    su dung merge() Update
    public static void mergeUpdateStudent() {

//Neu truyen vao 1 user ko ton tai trong DB thi se tao moi mot user do

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.baobao.superapp-PU");
        EntityManager em = emf.createEntityManager();
        Student student1 = new Student("SE789", "Anh Duc", 2001, 8.3);
        em.getTransaction().begin();
        em.merge(student1);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

}

