package StringsArray;

import java.util.Scanner;

public class ReversChar {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string");
		String s=scn.nextLine();
		char[] a=s.toCharArray();
		String s2="";
		int i=a.length-1,j=a.length-1;
		while(i>-1) {
			while(i>-1 &&a[i]!=' ' )i--;
			int k=i+1;
			String temp="";
			while(k<=j) {
				temp+=a[j];
				j--;
			}
			s2+=temp;
			if(i>-1)s2+=" ";
			i--;
			j=i;
		}
		System.out.println(s2);
	}

}
