package com.osamagharbi.JEETP04;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;


@Entity

@Table(name = "customer")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@Id

	@Column(name = "custID", unique = true)
	private int id;
	
	@Column(name = "firstName", nullable = false)
   private String fName;

   @Column(name = "lastName", nullable = false)
   private String lName;
	
   public int getID() {
       return id;
   }

   public void setID(int id) {
       this.id = id;
   }
   
   public String getFName() {
       return fName;
   }

   public void setFName(String fName) {
       this.fName = fName;
   }
   
   public String getLName() {
       return lName;
   }

   public void setLName(String lName) {
       this.lName = lName;
   }
	
}
