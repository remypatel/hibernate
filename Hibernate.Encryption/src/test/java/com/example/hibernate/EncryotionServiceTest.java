package com.example.hibernate;

import static org.junit.Assert.*;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.hibernate4.encryptor.HibernatePBEEncryptorRegistry;
import org.jasypt.hibernate4.encryptor.HibernatePBEStringEncryptor;
import org.junit.Test;

import com.example.hibernate.Entity.Employee;
import com.example.hibernate.Util.JsyptUtil;
import com.example.hibernate.Dao.*;


public class EncryotionServiceTest {
	
	@Test
	public void test() {
    Employee employee=new Employee();
    EmployeeDao employeeDao=new EmployeeDaoImpl();
    
	employee.setId(101685);
	employee.setName("denyyal");
	employee.setSalary(10110);
	employeeDao.saveEmployee(employee);
	Employee selectedemployee=employeeDao.getEmployee(101);
	
		assert(selectedemployee != null);
		assert(selectedemployee.getName().equals(employee.getName()));
		System.out.println("success");
	}

}
