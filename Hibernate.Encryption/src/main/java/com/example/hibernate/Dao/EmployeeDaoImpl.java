package com.example.hibernate.Dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.hibernate4.encryptor.HibernatePBEEncryptorRegistry;
import org.jasypt.hibernate4.encryptor.HibernatePBEStringEncryptor;

import com.example.hibernate.Entity.*;
import com.example.hibernate.Util.*;;

public class EmployeeDaoImpl implements EmployeeDao
{

public EmployeeDaoImpl(){
	 StandardPBEStringEncryptor strongEncryptor = new StandardPBEStringEncryptor();
	 HibernatePBEEncryptorRegistry registry=  HibernatePBEEncryptorRegistry.getInstance();
	 registry.registerPBEStringEncryptor("strongHibernateStringEncryptor", strongEncryptor);
	 HibernatePBEStringEncryptor hibernateStringEncryptor=new HibernatePBEStringEncryptor();
	 hibernateStringEncryptor.setPassword("jsypt");
	 hibernateStringEncryptor.setRegisteredName("strongHibernateStringEncryptor");
	 hibernateStringEncryptor.setAlgorithm("PBEWithMD5AndTripleDES");
}
  public Employee getEmployee(int id) {
	Session session=EncryptorService.getSessionFactory().openSession();
	Transaction transaction = null;
	Employee employee= null;
	try {
		transaction = session.beginTransaction();
		 employee=(Employee) session.load(Employee.class,id);
		transaction.commit();
		
	} catch (HibernateException e) {
		transaction.rollback();
		e.printStackTrace();
	} finally {
		session.close();
		
	}
	return employee;
   
	
}
	 
	public void saveEmployee(Employee e){
		Session session = EncryptorService.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(e);
			transaction.commit();
		} catch (HibernateException e1) {
			transaction.rollback();
			e1.printStackTrace();
		} finally {
			session.close();
		}
		
	}

	
	

}
