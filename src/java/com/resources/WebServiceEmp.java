/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.resources;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.pojo.Employee;

import com.service.EmployeeService;

@Path("/emp")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class WebServiceEmp {

    EmployeeService employeeService = new EmployeeService();

    @GET
    public List<Employee> getAllEmployee() {

        return employeeService.getAllEmployee();
    }

    @POST
    public Employee addEmployee(Employee e) {

        return employeeService.addEmployee(e);
    }

    @PUT
    @Path("/up/{employeeId}")
    public Employee updateEmployee(@PathParam("employeeId") int id, Employee e) {
        e.setId(id);
        return employeeService.updateEmployee(e);
    }

    @DELETE
    @Path("/del/{employeeId}")
    public void deleteEmployee(@PathParam("employeeId") int id) {
        employeeService.removeEmployee(id);
    }

    @GET
    @Path("/{employeeId}")
    public Employee getEmployeeById(@PathParam("employeeId") int id) {

        return employeeService.findEmployeeById(id);
    }

}

