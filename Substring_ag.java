package Subseq;

import java.util.Scanner;

public class Substring_ag {
	public static int seq(String str) {
		int result=0;
		int a_count = 0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == 'a' ||str.charAt(i) == 'A'  ) {
				a_count++;
			}
			else if(str.charAt(i) == 'g'||str.charAt(i) == 'G'  ) {
				result +=a_count;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int value=seq(str);
		System.out.println(value);

	}

}