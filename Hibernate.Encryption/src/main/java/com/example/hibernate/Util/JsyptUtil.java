package com.example.hibernate.Util;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.hibernate4.encryptor.HibernatePBEEncryptorRegistry;
import org.jasypt.hibernate4.encryptor.HibernatePBEStringEncryptor;


public class JsyptUtil {
	public HibernatePBEStringEncryptor getEncryptor(StandardPBEStringEncryptor strongEncryptor){
	
		 HibernatePBEEncryptorRegistry registry=  HibernatePBEEncryptorRegistry.getInstance();
		 registry.registerPBEStringEncryptor("strongHibernateStringEncryptor", strongEncryptor);
		 HibernatePBEStringEncryptor hibernateStringEncryptor=new HibernatePBEStringEncryptor();
		 hibernateStringEncryptor.setPassword("jsypt");
		 hibernateStringEncryptor.setRegisteredName("strongHibernateStringEncryptor");
		 hibernateStringEncryptor.setAlgorithm("PBEWithMD5AndTripleDES");
		 return hibernateStringEncryptor;
	}
}
