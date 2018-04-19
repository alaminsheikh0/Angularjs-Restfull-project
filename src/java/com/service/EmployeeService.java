package com.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.dao.EmployeeDAO;
import com.pojo.Employee;


public class EmployeeService {

    private Map<Integer, Employee> employeeMap = new HashMap();

    public EmployeeService() {
        for (Employee e : EmployeeDAO.doQuery()) {
            employeeMap.put(e.getId(), e);
        }
    }

    public Employee findEmployeeById(int id) {
        return employeeMap.get(id);
    }

    public List<Employee> getAllEmployee() {
        return new ArrayList<Employee>(employeeMap.values());
    }

    public Employee addEmployee(Employee e) {
        EmployeeDAO.doSave(e);
        return e;
    }

    public Employee updateEmployee(Employee e) {
        if (e.getId() <= 0) {
            return null;
        }
        EmployeeDAO.doUpdate(e);
        return e;
    }

    public void removeEmployee(int id) {
        Employee e = new Employee();
        e.setId(id);
        EmployeeDAO.doDelete(e);
    }

}

