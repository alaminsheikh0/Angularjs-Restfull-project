/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.resources;

import com.pojo.Product;
import com.service.ProductService;
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

@Path("/pro")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class WebServicePro {

    ProductService productService = new ProductService();

    @GET
    public List<Product> getAllProduct() {

        return productService.getAllProduct();
    }

    @POST
    public Product addEmployee(Product e) {

        return productService.addProduct(e);
    }

    @PUT
    @Path("/up/{employeeId}")
    public Product updateProduct(@PathParam("employeeId") int eid, Product e) {
        e.setPid(eid);
        return productService.updateProduct(e);
    }

    @DELETE
    @Path("/del/{employeeId}")
    public void deleteProduct(@PathParam("employeeId") int pid) {
        productService.removeProduct(pid);
    }

    @GET
    @Path("/{employeeId}")
    public Product getProductById(@PathParam("employeeId") int pid) {

        return productService.findProductById(pid);
    }

}


