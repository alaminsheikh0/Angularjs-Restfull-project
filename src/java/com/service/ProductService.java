
package com.service;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.dao.ProductDAO;
import com.pojo.Product;


public class ProductService {

    private Map<Integer, Product> productMap = new HashMap();

    public ProductService() {
        for (Product e : ProductDAO.doQuery()) {
            productMap.put(e.getPid(), e);
        }
    }

    public Product findProductById(int pid) {
        return productMap.get(pid);
    }

    public List<Product> getAllProduct() {
        return new ArrayList<Product>(productMap.values());
    }

    public Product addProduct(Product d) {
        ProductDAO.doSave(d);
        return d;
    }

    public Product updateProduct(Product d) {
        if (d.getPid() <= 0) {
            return null;
        }
        ProductDAO.doUpdate(d);
        return d;
    }

    public void removeProduct(int pid) {
        Product e = new Product();
        e.setPid(pid);
        ProductDAO.doDelete(e);
    }

}


