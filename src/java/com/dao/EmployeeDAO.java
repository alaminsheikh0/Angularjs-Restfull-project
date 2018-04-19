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
import com.pojo.Employee;
import com.util.NewHibernateUtil;

public class EmployeeDAO {
    
//    private static Map<Integer, Simple> simple = new HashMap<>();
//
//    public static Map<Integer, Simple> getSimple() {
//        for(Simple s: doQuery()){
//            simple.put(s.getId(), s);
//        }
//        return simple;
//    }
    
    public static int doSave(Employee emp){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        int n = (Integer) session.save(emp);
        session.getTransaction().commit();
        return n;
    }
    
    
    public static void doUpdate(Employee emp){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(emp);
        session.getTransaction().commit();
    }
    
    public static void doDelete(Employee emp){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(emp);
        session.getTransaction().commit();
    }
    public static List<Employee> doQuery(){
        List<Employee> list = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        list = session.createQuery("from Employee").list();
        return list;
    }
    
}
