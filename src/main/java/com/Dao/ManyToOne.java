package com.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Pojo.DepartmentM;
import com.Pojo.EmployeeM;

public class ManyToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Configuration conref = new Configuration();
		conref.configure("hibernateMO.cfg.xml");
		SessionFactory sfref = conref.buildSessionFactory();
		Session sref = sfref.openSession();
		Transaction tref = sref.beginTransaction();
		
		
		
		  EmployeeM e1=new EmployeeM();    
		    e1.setName("Ravi Malik");    
		    
		      
		    EmployeeM e2=new EmployeeM();  
		    e2.setName("Anuj Verma");  
		   
		    DepartmentM d = new DepartmentM();
		    d.setDepartment("Testing");
		    
		    e1.setDepartment(d);
		    e2.setDepartment(d);
		    
		    sref.save(e1);
		    sref.save(e2);
		    tref.commit();
		    sref.close();
		    sfref.close();
		    
		        
	}

}
