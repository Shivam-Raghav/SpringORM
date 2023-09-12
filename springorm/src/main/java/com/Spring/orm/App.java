package com.Spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring.orm.dao.StudentDao;
import com.Spring.orm.entities.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("hhiii");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		System.out.println("hhiii2");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		System.out.println("hhiii3");
		Student student = new Student(2324, "Shivam Raghav", "Noida");
		System.out.println("hhiii4");
		int r = studentDao.insert(student);
		System.out.println("hhiii5");
		System.out.println("done" + r);

	}
}