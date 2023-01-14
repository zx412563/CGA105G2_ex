package com.core.app;

import com.code.model.Code.pojo.Code;
import com.core.util.HibernateUtil;
import com.store.model.Store.pojo.Store;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Testapp {
    public static void main(String[] args) {
////        測試啟動
//        SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
////        開啟資料庫
//        Session session=sessionFactory.openSession();
//        Store store=session.get(Store.class,1);
//
//        System.out.println(store.getStoreName());
////        關閉
//        HibernateUtil.shutdown();
//        Store store=new Store();
//        store.setStoreName("Anthony");


        Testapp app=new Testapp();
//        新增
//        Integer id=app.insert(store);
//        System.out.println(id);
//        刪除
        app.deleteById(7);

    }

    public  Integer insert(Code code){
//        宣告
        SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
        //        開啟資料庫
        Session session=sessionFactory.openSession();
        try {
//        開啟交易
            Transaction tx=session.beginTransaction();
//        交易物件
            session.persist(code);
//        確認送出交易
            tx.commit();
//        取得回傳
            return code.getCodeId();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
            return null;
        }


    }

    public  void deleteById(Integer id){
//        宣告
        SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
        //        開啟資料庫
        Session session=sessionFactory.openSession();
        try {
//        開啟交易
            Transaction tx=session.beginTransaction();
//        交易物件
            Store store =new Store();
            store.setStoreId(id);
            session.remove(store);
//        確認送出交易
            tx.commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }


    }
}
