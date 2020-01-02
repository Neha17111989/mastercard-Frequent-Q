package com.altimetrik;

import java.util.HashMap;

public class HashMapCode {

	public static void main(String[] args) {
		HashMap<Object, String> hm=new HashMap<Object, String>();
		hm.put(null, "neha");
		hm.put("null", "pushkar");
		String data=hm.get(null);
		System.out.println(data);

	}

}
