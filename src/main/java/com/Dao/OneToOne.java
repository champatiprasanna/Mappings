package com.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Pojo.Address;
import com.Pojo.Employee;

public class OneToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration conref = new Configuration();
		conref.configure("hibernate.cfg.xml");
		SessionFactory sfref = conref.buildSessionFactory();
		Session sref = sfref.openSession();
		Transaction tref = sref.beginTransaction();
		
		Employee e1=new Employee();    
	    e1.setName("Ravi Malik");    
	    
	        
	    Address address1=new Address();    
	    address1.setStreet("vert");
	    address1.setCity("Ghaziabad");    
	       
	    
	    e1.setAddress(address1);   
	    address1.setEmployee(e1);  
	       sref.save(e1);
	       tref.commit();
	       sref.close();
	       sfref.close();
	       
	}

}
