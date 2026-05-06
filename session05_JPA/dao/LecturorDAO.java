package com.baobao.superapp.dao;

import com.baobao.superapp.entity.Lecturer;
import com.baobao.superapp.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class LecturorDAO {

    // Insert Lecturer
    public void insertLecturer() {
        Lecturer lecturer1 = new Lecturer("Hoài Linh", 1985, 15000000L);
        Lecturer lecturer2 = new Lecturer("Trấn Thành", 1980, 20000000L);
        Lecturer lecturer3 = new Lecturer("Trường Giang", 1982, 18000000L);
        Lecturer lecturer4 = new Lecturer("Nhật Cường", 1979, 22000000L);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.baobao.superapp-PU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(lecturer1);
        em.persist(lecturer2);
        em.persist(lecturer3);
        em.persist(lecturer4);
        em.getTransaction().commit();

        List<Lecturer> lecturerList = em.createQuery("FROM Lecturer", Lecturer.class).getResultList();
        for (Lecturer lecturer : lecturerList) {
            System.out.println(lecturer.toString());
        }

        em.close();
        emf.close();
    }


    // Delete Lecturer
    public void deleteLecturer() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.baobao.superapp-PU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Lecturer lecturer3 = em.find(Lecturer.class, 3); // ID là int, tự tăng
        if (lecturer3 != null) {
            em.remove(lecturer3);
            System.out.println("Xoa lecturer " + lecturer3.getId() + " thanh cong");
        }

        Lecturer lecturer4 = em.find(Lecturer.class, 4);
        if (lecturer4 != null) {
            em.remove(lecturer4);
            System.out.println("Xoa lecturer " + lecturer4.getId() + " thanh cong");
        }

        em.getTransaction().commit();

        List<Lecturer> lecturerList = em.createQuery("FROM Lecturer", Lecturer.class).getResultList();
        for (Lecturer lecturer : lecturerList) {
            System.out.println(lecturer.toString());
        }

        em.close();
        emf.close();
    }



    // Find Lecturer
    public void findLecturer() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.baobao.superapp-PU");
        EntityManager em = emf.createEntityManager();

        Lecturer l1 = em.find(Lecturer.class, 1); // ID là int
        if (l1 != null) {
            System.out.println(l1.toString());
        } else {
            System.out.println("Ko tim thay");
        }

        em.close();
        emf.close();
    }


    // Su dung find() de Update Lecturer
    public void findUpdateLecturer() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.baobao.superapp-PU");
        EntityManager em = emf.createEntityManager();

        Lecturer l1 = em.find(Lecturer.class, 1);
        em.getTransaction().begin();

        if (l1 != null) {
            l1.setName("Truong Giang Updated");
            l1.setYob(1975);
            l1.setSalary(25000000L);
            System.out.println("Update lecturer " + l1.getId() + " thanh cong");
        }

        em.getTransaction().commit();
        em.close();
        emf.close();
    }


    // Su dung merge() de Update Lecturer
    public void mergeUpdateLecturer() {
        // Neu truyen vao 1 lecturer ko ton tai trong DB thi se tao moi mot lecturer do
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.baobao.superapp-PU");
        EntityManager em = emf.createEntityManager();

        // ID = 0 hoặc không set → JPA sẽ INSERT mới (vì @GeneratedValue)
        Lecturer newLecturer = new Lecturer("Anh Duc", 1990, 17000000L);

        em.getTransaction().begin();
        em.merge(newLecturer);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }




}
