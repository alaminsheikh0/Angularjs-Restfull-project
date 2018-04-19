/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.dao.DepartmentDAO;
import com.pojo.Department;


public class DepartmentService {

    private Map<Integer, Department> departmentMap = new HashMap();

    public DepartmentService() {
        for (Department e : DepartmentDAO.doQuery()) {
            departmentMap.put(e.getDid(), e);
        }
    }

    public Department findDepartmentById(int did) {
        return departmentMap.get(did);
    }

    public List<Department> getAllDepartment() {
        return new ArrayList<Department>(departmentMap.values());
    }

    public Department addDepartment(Department d) {
        DepartmentDAO.doSave(d);
        return d;
    }

    public Department updateDepartment(Department d) {
        if (d.getDid() <= 0) {
            return null;
        }
        DepartmentDAO.doUpdate(d);
        return d;
    }

    public void removeDepartment(int did) {
        Department e = new Department();
        e.setDid(did);
        DepartmentDAO.doDelete(e);
    }

}


