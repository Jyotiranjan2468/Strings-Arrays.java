package StringsArray;

import java.util.Scanner;

public class pallendrom {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string");
		String s=scn.next();
		for(int i=0;i<s.length()-1;i++) {
			for(int j=i+2;j<=s.length();j++) {
				String s1=s.substring(i, j);
				if(IsPalli(s1))System.out.println(s1);
			}
		}
	}
	static boolean IsPalli(String s) {
		s=s.toLowerCase();
		int i=0,j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j))return false;
			i++;
			j--;
		}
		return true;
	}
	

}
