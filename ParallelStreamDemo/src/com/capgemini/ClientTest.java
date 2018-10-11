package com.capgemini;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ClientTest {
	
	 public static void main(String[] args) {
		 
		 List<Student> list = new ArrayList<>();
		 list.add(new Student("anu",22));
		 list.add(new Student("usha",10));
		 list.add(new Student("ammu",23));
		 list.add(new Student("kala",18));

		 Stream <Student> parallelStream =list.parallelStream();
			System.out.println("Student data order in process---");		

		 parallelStream.forEach(s->doProcess(s));
		 
	 }

	private static void doProcess(Student s) {
	
		System.out.println(s);		
	}
	
	
	

}
