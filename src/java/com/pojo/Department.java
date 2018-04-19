package com.pojo;
// Generated Feb 28, 2018 6:31:40 PM by Hibernate Tools 4.3.1

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;




@Entity
@XmlRootElement
public class Department  implements java.io.Serializable {

    @Id 
    @GeneratedValue
     private Integer did;
     private String dname;
     private String ddec;
     private String dmp;
     private String dceo;
     private Double dbudget;

    public Department() {
    }

    public Department(String dname, String ddec, String dmp, String dceo, Double dbudget) {
       this.dname = dname;
       this.ddec = ddec;
       this.dmp = dmp;
       this.dceo = dceo;
       this.dbudget = dbudget;
    }
   
    public Integer getDid() {
        return this.did;
    }
    
    public void setDid(Integer did) {
        this.did = did;
    }
    public String getDname() {
        return this.dname;
    }
    
    public void setDname(String dname) {
        this.dname = dname;
    }
    public String getDdec() {
        return this.ddec;
    }
    
    public void setDdec(String ddec) {
        this.ddec = ddec;
    }
    public String getDmp() {
        return this.dmp;
    }
    
    public void setDmp(String dmp) {
        this.dmp = dmp;
    }
    public String getDceo() {
        return this.dceo;
    }
    
    public void setDceo(String dceo) {
        this.dceo = dceo;
    }
    public Double getDbudget() {
        return this.dbudget;
    }
    
    public void setDbudget(Double dbudget) {
        this.dbudget = dbudget;
    }




}


