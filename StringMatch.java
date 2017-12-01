package javaProjectNew;

import java.util.Arrays;
import java.util.Scanner;

public class StringMatch {
	public static void main(String args[]){
		String s1;
		String s2;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter first  String");
		s1=sc.nextLine();
		System.out.println("Please enter second   String");
		s2=sc.nextLine();
		
		int length_of_s1=s1.length();
		int length_of_s2=s2.length();
		
		char[] string1=new char[length_of_s1];
		char[] string2=new char[length_of_s2];
		
		for(int i=0;i<length_of_s1;i++)
		{
			
			
				{
				 string1[i]=s1.charAt(i);
				}
			
			 {
				 string2[i]=s2.charAt(i);
			 }
			
			//string2[i]=s2.charAt(i);
		}
	
		Arrays.sort(string1);
		Arrays.sort(string2);
		
		s1=new String(string1);
		s2=new String(string2);
		
		if(s1.equals(s2)){
			System.out.println("these are equal strings");
		}
		else{
			System.out.println("these are not equal String");
		}

}
}	
