package StringsArray;

import java.util.Scanner;

public class OccuranceChar {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string");
		String s=scn.nextLine();
		s=s.toLowerCase();
		while(0<s.length()) {
			char c=s.charAt(0);
			String s1=s.replaceAll(c+"", "");
			int n=s.length()-s1.length();
			s=s1;
			System.out.println(c+"="+n);
		}
	}

}
