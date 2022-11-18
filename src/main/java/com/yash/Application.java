package com.yash;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.yash.Repository.StudentRepository;
import com.yash.beans.Student;

import ch.qos.logback.classic.pattern.Util;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		 StudentRepository repository = context.getBean(StudentRepository.class);
//		 Student stu1=new Student(101, "shubham","srt@yash.com", "26");
//		 Student stu2=new Student(102, "palak","plk@yash.com", "20");
//		 Student stu3=new Student(103, "akash","akt@yash.com", "22");
//		 Student stu4=new Student(104, "dinesh","dns@yash.com", "25");
//		 Student stu5=new Student(105, "lavish","lvs@yash.com", "27");
//		List<Student> list = Arrays.asList(stu1,stu2,stu3,stu4,stu5);
//		 repository.saveAll(list);
		 //SSystem.out.println("Student Records successfully Added....");
//		 Student age = repository.findByStudentAge("20");
//		 System.out.println(age);
		//List<Student> studentAgeGreterThan = repository.findByStudentAgeGreaterThanEqual(25);
		
		//List<Student> students= repository.findByStudentAgeIn(Arrays.asList(25,27));
		  
		 List<Student> list = repository.findByStudentNameAndStudentAge("lavish", 27);
		 System.out.println(list);
//		 for(Student s:students)
//		{
//			System.out.println(s);
//		}
	}

}
