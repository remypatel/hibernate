package com.example.hibernate.Application;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.jasypt.encryption.pbe.StandardPBEBigIntegerEncryptor;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.hibernate4.encryptor.HibernatePBEBigIntegerEncryptor;
import org.jasypt.hibernate4.encryptor.HibernatePBEEncryptorRegistry;
import org.jasypt.hibernate4.encryptor.HibernatePBEStringEncryptor;

import com.example.hibernate.Dao.*;
import com.example.hibernate.Entity.*;
import com.example.hibernate.Dao.EmployeeDao;

public class Application {
	public static void main(String[] args) { 
		EmployeeDao employeeDao=new EmployeeDaoImpl();
		
	/*StandardPBEStringEncryptor strongEncryptor = new StandardPBEStringEncryptor();
		 HibernatePBEEncryptorRegistry registry=  HibernatePBEEncryptorRegistry.getInstance();
		 registry.registerPBEStringEncryptor("strongHibernateStringEncryptor", strongEncryptor);
		 HibernatePBEStringEncryptor hibernateStringEncryptor=new HibernatePBEStringEncryptor();
		 hibernateStringEncryptor.setPassword("jsypt");
		 hibernateStringEncryptor.setRegisteredName("strongHibernateStringEncryptor");
		 hibernateStringEncryptor.setAlgorithm("PBEWithMD5AndTripleDES");
		 */
		/* StandardPBEStringEncryptor strongEncryptor1 = new StandardPBEStringEncryptor();
		 HibernatePBEEncryptorRegistry registry1=  HibernatePBEEncryptorRegistry.getInstance();
		 registry1.registerPBEStringEncryptor("strongHibernateIntegerEncryptor", strongEncryptor1);
		 HibernatePBEBigIntegerEncryptor hibernateIntegerEncryptor=new  HibernatePBEBigIntegerEncryptor();
		 hibernateStringEncryptor.setPassword("abc");
		 hibernateStringEncryptor.setRegisteredName("strongHibernateIntegerEncryptor");
		 hibernateStringEncryptor.setAlgorithm("PBEWithMD5AndTripleDES");
		
		StandardPBEBigIntegerEncryptor strongEncryptor1 = new StandardPBEBigIntegerEncryptor();
		 HibernatePBEEncryptorRegistry registry1=  HibernatePBEEncryptorRegistry.getInstance();
		 registry1.registerPBEBigIntegerEncryptor("strongHibernateIntegerEncryptor", strongEncryptor1);
		 HibernatePBEBigIntegerEncryptor hibernateIntegerEncryptor=new  HibernatePBEBigIntegerEncryptor();
		 hibernateIntegerEncryptor.setPassword("jsypt");
		 hibernateIntegerEncryptor.setRegisteredName("strongHibernateIntegerEncryptor");
		 hibernateIntegerEncryptor.setAlgorithm("PBEWithMD5AndTripleDES");
	
		
		*/
		//Employee e=new Employee();
	//	Employee e1=null;
		//e.setId(3);
	//	e1= employeeDaoImpl.getEmployee(e.getId());
	//	System.out.println(e1.getName());
		 
		 
		 
	 /*   //creating configuration object  
	    Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
	      
	    //creating seession factory object  
	    SessionFactory factory=cfg.buildSessionFactory();  
	      
	    //creating session object  
	    Session session=factory.openSession();  
	      
	    //creating transaction object  
	    Transaction t=session.beginTransaction();  
	   */ 
	       
	    Employee e2=new Employee(17104,"joe",199892);
	   employeeDao.saveEmployee(e2);
	// Employee e=employeeDaoImpl.getEmployee(17604);
	    System.out.println(e2.getName());
	      
	
	     /*
	       String Encrypted = hibernateStringEncryptor.encrypt(e2.getName());
	       
	       System.out.println("Encrptedvalue::"+Encrypted);
	       HibernatePBEStringEncryptor hibernateStringDecryptor=new HibernatePBEStringEncryptor();
			 hibernateStringDecryptor.setPassword("jsypt");
			 System.out.println("Decryptedvalue::"+hibernateStringDecryptor.decrypt(Encrypted)); */
	       
	  
	      
	    System.out.println("successfully saved");  
	
	     
	}  


}
