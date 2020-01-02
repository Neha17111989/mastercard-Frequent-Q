package com.altimetrik;

public class PallindromDemo {

	public static void main(String[] args) {
		if(isPallindrom("MADAM"))
		{
			System.out.println("Yes pallindrom");
		}
		else {
			System.out.println("NO");
		}

	}

	private static boolean isPallindrom(String string) {
		int i=0, j=string.length()-1;
		while(i<j) {
			if(string.charAt(i)!=string.charAt(j))
				return false;
				i++;
				j--;
		}
		return true;
	
		
	}

}
