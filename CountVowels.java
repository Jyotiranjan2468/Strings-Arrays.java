package StringsArray;

import java.util.Scanner;

public class CountVowels {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter a string");
		String s=scn.nextLine();
		s=s.toLowerCase();
		int voule=0,cons=0;
		int i=0,j=s.length()-1;
		while(i<=j) {
			if(s.charAt(i)!=' ') {
				if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
					voule++;
				}else {
					cons++;
				}
				
			}
			i++;
		}
		System.out.println(voule);
		System.out.println(cons);
	}

}
