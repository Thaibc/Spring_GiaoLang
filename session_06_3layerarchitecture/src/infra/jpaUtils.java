package com.baobao.superapp.infra;

//SINGLETON moi lan khi muon tuong tac voi du lieu thi cac phai goi EntityManagerFactory thi cai thang nay se di vao doc file persistence.xml de tien hanh ket noi voi DB thi moi lan nhu vay se gay anh huong toi performance cua he thong-->cho nen thi trong 1 phien lam viec ta chi can ket noi 1 lan <===> EntityManangeFactory chi doc file persistence.xml 1 lan va file nay chi xuat hien 1 lan trong RAM. Khai niem ma du lieu chi dc xuat hien 1 lan trong RAM dc goi la SINGLETON

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class jpaUtils {

    //de constructor ve private de ko the new moi object nay
    private jpaUtils(){}

    //bien co kieu static chi duy nhat 1 vung ram
    private static final EntityManagerFactory emf;


//doi voi 1 clalss ham static{} se duoc chay 1 lan duy nhat khi class nay dc cham toi
    static {
        try{
            emf = Persistence.createEntityManagerFactory("com.baobao.superapp-PU");
        }catch (Exception ex){
    throw new RuntimeException(ex);
        }
    }


//    class nao muon ket noi thi su dung jpaUtils.getEntityManager() thi ham static{} se chay emf se dc tao ra 1 lan duy nhat trong RAM va no thuoc ve class
    public static EntityManager getEntityManager(){
        return emf.createEntityManager();
    }

    public static void shutDown(){
        emf.close();
    }
}
