package com.infotech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ClientTest {

	 public static void main(String[] args) {
	
	String arr[] = new String[] {"AA","BB","CC"};
	Stream <String> stream = Arrays.stream(arr);
	stream.forEach(System.out::println);
	 
	
	Stream <String> of = Stream.of("A","B","C");
	System.out.println("------");
	of.forEach(System.out::println);
	
	List<String> list = new ArrayList<>();
	list.add("anu");
	list.add("manu");
	list.add("kala");
	
	System.out.println("------");


	Stream<String> stream2=list.stream();
	stream2.forEach(System.out::println);
}

}