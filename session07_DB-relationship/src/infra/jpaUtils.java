package com.baobao.superapp.infra;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.lang.management.ManagementFactory;

public class jpaUtils {

    //    cam new

    //de constructor ve private de ko the new moi object nay
    private jpaUtils() {
    }

    //bien co kieu static chi duy nhat 1 vung ram
    private static final EntityManagerFactory emf;


    //doi voi 1 clalss ham static{} se duoc chay 1 lan duy nhat khi class nay dc cham toi
    static {
        try {
            emf = Persistence.createEntityManagerFactory("com.baobao.superapp-PU");
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }


    //    class nao muon ket noi thi su dung jpaUtils.getEntityManager() thi ham static{} se chay emf se dc tao ra 1 lan duy nhat trong RAM va no thuoc ve class
    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public static void shutDown() {
        emf.close();
    }

}
