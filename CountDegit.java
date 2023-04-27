package StringsArray;

import java.util.Scanner;

public class CountDegit {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string");
		String s= scn.nextLine();
		int i=0;
		while(i<=s.length()-1) {
			char c=s.charAt(i);
			if(c>='0'&&c<='9') {
				System.out.println(c);
			}
			i++;
		}
	}

}
