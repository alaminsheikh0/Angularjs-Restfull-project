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
import com.pojo.Department;

import com.service.DepartmentService;

@Path("/dpt")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class WebServiceDPT {

    DepartmentService departmentService = new DepartmentService();

    @GET
    public List<Department> getAllDepartment() {

        return departmentService.getAllDepartment();
    }

    @POST
    public Department addEmployee(Department e) {

        return departmentService.addDepartment(e);
    }

    @PUT
    @Path("/up/{employeeId}")
    public Department updateDepartment(@PathParam("employeeId") int did, Department e) {
        e.setDid(did);
        return departmentService.updateDepartment(e);
    }

    @DELETE
    @Path("/del/{employeeId}")
    public void deleteDepartment(@PathParam("employeeId") int did) {
        departmentService.removeDepartment(did);
    }

    @GET
    @Path("/{employeeId}")
    public Department getEmployeeById(@PathParam("employeeId") int did) {

        return departmentService.findDepartmentById(did);
    }

}
