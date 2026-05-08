package com.baobao.superapp.entity.bidirectional;

import com.baobao.superapp.infra.jpaUtils;
import jakarta.persistence.EntityManager;

public class MainBidiriection {
    public static void main(String[] args) {
        Student student1 = new Student("SE123", "Tran Thanh", 2001, 7.2);
        Student student2 = new Student("SE456", "Hoai Linh", 2002, 7.2);
        Student student3 = new Student("SE333", "Truong Giang", 2001, 7.2);
        Student student4 = new Student("SE444", "Kieu Oanh", 2002, 7.2);
        Major se = new Major("SE", "Ky Thuat Phan Mem");
        Major ia = new Major("IA", "An Toan Thong Tin");
        se.addStudent(student1);
        se.addStudent(student2);
        ia.addStudent(student3);
        ia.addStudent(student4);
        EntityManager em = jpaUtils.getEntityManager();
        em.getTransaction().begin();
        em.persist(se);
        em.persist(ia);
        em.getTransaction().commit();
        em.close();

    }
}
