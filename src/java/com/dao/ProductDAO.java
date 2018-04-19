
package com.dao;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.hibernate.Session;
import com.pojo.Product;
import com.util.NewHibernateUtil;

public class ProductDAO {
    
//    private static Map<Integer, Simple> simple = new HashMap<>();
//
//    public static Map<Integer, Simple> getSimple() {
//        for(Simple s: doQuery()){
//            simple.put(s.getId(), s);
//        }
//        return simple;
//    }
    
    public static int doSave(Product pro){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        int n = (Integer) session.save(pro);
        session.getTransaction().commit();
        return n;
    }
    
    
    public static void doUpdate(Product pro){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(pro);
        session.getTransaction().commit();
    }
    
    public static void doDelete(Product pro){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(pro);
        session.getTransaction().commit();
    }
    public static List<Product> doQuery(){
        List<Product> list = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        list = session.createQuery("from Product").list();
        return list;
    }
    
}


