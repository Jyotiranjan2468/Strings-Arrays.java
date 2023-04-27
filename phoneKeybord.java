package StringsArray;
import java.util.Scanner;
public class phoneKeybord {
	static String convert(int[] a,String s) {
		s=s.toUpperCase();
		String s1="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				s1+="0";
			}else {
				s1+=a[s.charAt(i)-'A'];
			}
		}
		return s1;
	}
	public static void main(String[] args) {
		int[] a= {2,22,222,3,33,333,4,44,444,5,55,555,6,66,666,7,77,777,7777,8,88,888,9,99,999,9999};
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string");
		String s=scn.nextLine();
		System.out.println(convert(a, s));
	}
}
