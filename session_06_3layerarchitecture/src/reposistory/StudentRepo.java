package com.baobao.superapp.reposistory;

import com.baobao.superapp.entity.Student;
import com.baobao.superapp.infra.jpaUtils;
import jakarta.persistence.EntityManager;

import java.util.List;

public class StudentRepo {

    public StudentRepo() {
    }

//   class nay la CRUD ne tuong tac voi DB ne persis() find() merge() remove()
//    muon tuong tac duoc voi DB thi phai moi EntityManager
//  ---- cac ham trong day duoc dat ten gan gui voi DB nen dat giong voi cac ham trong DB luon Insert Update Slelect Delete


    //    Insert
    public void insert(Student student) {
        EntityManager em = jpaUtils.getEntityManager();
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
        em.close();
    }


    //    select all Student
    public List<Student> selectAll() {
        EntityManager em = jpaUtils.getEntityManager();
        List<Student> studentList = em.createQuery("FROM Student ", Student.class).getResultList();
        em.close();
        return studentList;
    }

    //    select studentById
    public Student selectById(long id) {
        EntityManager em = jpaUtils.getEntityManager();
        Student s1 = em.find(Student.class, id);
        em.close();
        return s1;
    }

    //delete Student
    public void delete(long id) {
        EntityManager em = jpaUtils.getEntityManager();
        Student s = em.find(Student.class, id);
        if (s != null) {
            em.getTransaction().begin();
            em.remove(s);
            em.getTransaction().commit();
        } else {
            System.out.println("ko tim thay sinh vien");
        }
        em.close();
    }


//    update Student

    public void update(long id, String newName, int newYob, double newGpa) {
        EntityManager em = jpaUtils.getEntityManager();
        Student s = em.find(Student.class, id);
        if (s != null) {
            em.getTransaction().begin();
            s.setName(newName);
            s.setYob(newYob);
            s.setGpa(newGpa);
            em.getTransaction().commit();
        } else {
            System.out.println("ko tim thay sinh vien");
        }
        em.close();
    }

}
