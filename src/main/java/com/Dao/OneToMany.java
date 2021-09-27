package com.Dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Pojo.Answer;
import com.Pojo.Question;

public class OneToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Configuration conref = new Configuration();
		conref.configure("hibernateOM.cfg.xml");
		SessionFactory sfref = conref.buildSessionFactory();
		Session sref = sfref.openSession();
		Transaction tref = sref.beginTransaction();
		
		Answer ans1 = new Answer();
		ans1.setAnswer("Java is a programming language");
		ans1.setPostedBy("John");
		
		Answer ans2 = new Answer();
		ans2.setAnswer("java is a platform");
		ans2.setPostedBy("Kale");
		
		Answer ans3=new Answer();    
	    ans3.setAnswer("Servlet is an Interface");    
	    ans3.setPostedBy("Jai Kumar");    
	        
	    Answer ans4=new Answer();    
	    ans4.setAnswer("Servlet is an API");    
	    ans4.setPostedBy("Arun");   
	    
	    
	    ArrayList<Answer> list1 = new ArrayList<Answer>();
	    list1.add(ans1);
	    list1.add(ans2);
	    
	    ArrayList<Answer> list2 = new ArrayList<Answer>();
	    list2.add(ans3);
	    list2.add(ans4);
	    
	    Question question1=new Question();    
	    question1.setQuestion("What is Java?");    
	    question1.setAnswers(list1);    
	        
	    Question question2=new Question();    
	    question2.setQuestion("What is Servlet?");    
	    question2.setAnswers(list2);    
	    
	    sref.save(question1);
	    sref.save(question2);
	    
	    tref.commit();
	    sref.close();
	    sfref.close();
	}

}
