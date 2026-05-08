//package com.baobao.superapp.entity.unione;
//
//import com.baobao.superapp.infra.jpaUtils;
//import jakarta.persistence.EntityManager;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class MainUniOne {
//    public static void main(String[] args) {
//
//        //        tao 1 chuyen nganh
//
//        Major SE = new Major("SE", "Ky Thuat Phan Mem");
//        //  tao 2 Student
//        Student student1 = new Student("SE123", "Tran Thanh", 2007, 9.3);
//        Student student2 = new Student("SE456", "Truong Giang", 2001, 9.3);
//        //them student1 vao chuyen nghanh SE
//        SE.addStudent(student1);
//        //them student2 vao chuyen nghanh SE
//        SE.addStudent(student2);
//
//        EntityManager em = jpaUtils.getEntityManager();
//        em.getTransaction().begin();
//        em.persist(SE);
//        em.getTransaction().commit();
//        em.close();
//    }
//}
