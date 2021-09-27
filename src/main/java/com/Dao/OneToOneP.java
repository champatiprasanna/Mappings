package com.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Pojo.Address;
import com.Pojo.Details;
import com.Pojo.Employee;
import com.Pojo.Employer;

public class OneToOneP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration conref = new Configuration();
		conref.configure("hibernateP.cfg.xml");
		SessionFactory sfref = conref.buildSessionFactory();
		Session sref = sfref.openSession();
		Transaction tref = sref.beginTransaction();
		
		Employer e1=new Employer();    
	    e1.setName("John");    
	    
	        
	    Details details=new Details();    
	    details.setDepartment("IT");
	        
	    
	    e1.setDetails(details);   
	    details.setEmployer(e1);  
	       sref.save(e1);
	       tref.commit();
	       sref.close();
	       sfref.close();
	}

}
