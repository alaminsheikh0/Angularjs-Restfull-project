/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.hibernate.Session;
import com.pojo.Department;
import com.util.NewHibernateUtil;

public class DepartmentDAO {
    
//    private static Map<Integer, Simple> simple = new HashMap<>();
//
//    public static Map<Integer, Simple> getSimple() {
//        for(Simple s: doQuery()){
//            simple.put(s.getId(), s);
//        }
//        return simple;
//    }
    
    public static int doSave(Department dpt){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        int n = (Integer) session.save(dpt);
        session.getTransaction().commit();
        return n;
    }
    
    
    public static void doUpdate(Department dpt){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(dpt);
        session.getTransaction().commit();
    }
    
    public static void doDelete(Department dpt){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(dpt);
        session.getTransaction().commit();
    }
    public static List<Department> doQuery(){
        List<Department> list = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        list = session.createQuery("from Department").list();
        return list;
    }
    
}

