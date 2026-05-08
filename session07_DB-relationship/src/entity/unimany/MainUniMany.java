//package com.baobao.superapp.entity.unimany;
//
//
//import com.baobao.superapp.infra.jpaUtils;
//import jakarta.persistence.EntityManager;
//
//public class MainUniMany {
//    public static void main(String[] args) {
////    tao mot sinh vien
//        Student student1 = new Student("SE123", "Tran Thanh", 2001, 7.2);
//        Student student2 = new Student("SE456", "Hoai Linh", 2002, 7.2);
////      them chuyen nghanh cho sinh vien 1
//        Major se = new Major("SE", "Ky Thuat Phan Mem");
//        Major ia = new Major("IA", "An Toan Thong Tin");
//        student1.setMajor(se);
//        student2.setMajor(ia);
//
//        EntityManager em = jpaUtils.getEntityManager();
//        em.getTransaction().begin();
//        em.persist(se);
//        em.persist(student1);
//        em.persist(ia);
//        em.persist(student2);
//        em.getTransaction().commit();
//        em.close();
//
//    }
//}
