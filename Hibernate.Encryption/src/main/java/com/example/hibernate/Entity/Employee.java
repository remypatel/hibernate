
package com.example.hibernate.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnTransformer;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.jasypt.hibernate4.type.EncryptedStringType;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.jasypt.hibernate4.type.EncryptedStringType;

@TypeDefs({
    @TypeDef(
            name="encryptedString",
            typeClass=EncryptedStringType.class,
            parameters= {
                    @Parameter(name="encryptorRegisteredName", value="strongHibernateStringEncryptor")
            }
    )
})

@Entity
@Table(name = "emp1000")

public class Employee {
@Id

@Column(name = "Id")
private int id;
@Column(name = "Name")
@Type(type="encryptedString")
private String name;
@Column(name = "Salary")
private int salary;
public Employee(){}
public Employee(int id, String name, int salary) {
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

}
