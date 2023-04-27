package StringsArray;

import java.util.Scanner;

public class ReversWord {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string");
		String s=scn.nextLine();
		String[] a=s.split(" ");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}

}
