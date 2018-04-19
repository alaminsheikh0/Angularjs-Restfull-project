package com.pojo;
// Generated Feb 28, 2018 6:31:40 PM by Hibernate Tools 4.3.1

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;




@Entity
@XmlRootElement
public class Product  implements java.io.Serializable {

    @Id 
    @GeneratedValue
     private Integer pid;
     private String pname;
     private String ptype;
     private String pdesc;
     private Double pprice;
     private Integer pstock;
     private String porigin;

    public Product() {
    }

    public Product(String pname, String ptype, String pdesc, Double pprice, Integer pstock, String porigin) {
       this.pname = pname;
       this.ptype = ptype;
       this.pdesc = pdesc;
       this.pprice = pprice;
       this.pstock = pstock;
       this.porigin = porigin;
    }
   
    public Integer getPid() {
        return this.pid;
    }
    
    public void setPid(Integer pid) {
        this.pid = pid;
    }
    public String getPname() {
        return this.pname;
    }
    
    public void setPname(String pname) {
        this.pname = pname;
    }
    public String getPtype() {
        return this.ptype;
    }
    
    public void setPtype(String ptype) {
        this.ptype = ptype;
    }
    public String getPdesc() {
        return this.pdesc;
    }
    
    public void setPdesc(String pdesc) {
        this.pdesc = pdesc;
    }
    public Double getPprice() {
        return this.pprice;
    }
    
    public void setPprice(Double pprice) {
        this.pprice = pprice;
    }
    public Integer getPstock() {
        return this.pstock;
    }
    
    public void setPstock(Integer pstock) {
        this.pstock = pstock;
    }
    public String getPorigin() {
        return this.porigin;
    }
    
    public void setPorigin(String porigin) {
        this.porigin = porigin;
    }




}


