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
        deleteStudent();
    }

//    Insert Student

    public static void insertStudent() {
//        Student student1 = new Student("SE123", "Nguyen Van An", 2001, 8.3);
//        Student student2 = new Student("SE456", "Nguyen Van Binh", 2003, 9.0);
        Student student3 = new Student("SE333", "Nhat Cuong", 2001, 8.3);
        Student student4 = new Student("SE444", "Tran Thanh", 2003, 9.0);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.baobao.superapp-PU");

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(student3);
        em.persist(student4);
        em.getTransaction().commit();
        List<Student> studentList = em.createQuery("FROM Student", Student.class).getResultList();
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
        em.close();
    }


//Delete Student

    public static void deleteStudent() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.baobao.superapp-PU");

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Student student3 = em.find(Student.class, "SE333");
        if (student3 != null) {
            em.remove(student3);
        }
        Student student4 = em.find(Student.class, "SE444");
        if (student4 != null) {
            em.remove(student4);
        }
        em.getTransaction().commit();
        List<Student> studentList = em.createQuery("FROM Student", Student.class).getResultList();
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
        em.close();
    }
}

