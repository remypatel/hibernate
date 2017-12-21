package com.example.hibernate.Dao;

import com.example.hibernate.Entity.*;;

public interface EmployeeDao {
	public Employee getEmployee(int Id);
	public void saveEmployee(Employee e);


}
