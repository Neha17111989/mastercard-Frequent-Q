package com.altimetrik;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class AB implements A,B {

	 public  void  printA() {
		//System.out.println("A Interface");
		 B.super.printA();
	}
	 public static void main(String[] args) {
		AB obj=new AB();
		//obj.printA();
		Map<String, String> map = new HashMap<>();
		map.put("1", "test1");
		map.put("2", "test2");
		map.put("3", "test3");
		map.put("4", "test4");
		map.put("5", "test5");
		map.put("6", "test6");
		//map.entrySet().stream().filter((a,b)->a.get("test2")).collect(Collectors.toMap(x->x.get, valueMapper));

		  //iterate over map items
		  //Java 8 forEach iterator which is an Internal Iterator.
		 map.forEach((key,value)->{ 
		  System.out.print("Key : " +key);
		  System.out.println(value);
		  
		  });
	}
}
