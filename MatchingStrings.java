package javaProjectNew;

import java.util.Arrays;
import java.util.Scanner;


public class MatchingStrings {
	public static void main(String args[]){
	        
	        
	        String string1;
	        String string2;
	        
	        Scanner scanner=new Scanner(System.in);
	        System.out.println(" first string");
	        string1=scanner.nextLine();
	        
	        System.out.println("second string");
	        string2=scanner.nextLine();
	        
	        System.out.println(matching(string1,string2));
	     }
		
		
     public static  boolean matching(String first,String second){
	        
	        char[] myfirst=new char[first.length()];
	        for(int i=0;i<first.length();i++)
	        {
	            myfirst[i]=first.charAt(i);
	        }
	        
	        
	        char[] mysecond=new char[second.length()];
	        for(int i=0;i<second.length();i++)
	        {
	            mysecond[i]=second.charAt(i);
	        }
	        Arrays.sort(myfirst);
	        Arrays.sort(mysecond);
	        
	        first=new String(myfirst);
	        second=new String(mysecond);
	        if(first.equals(second))
	        {
	            return true;
	        }
	        else
	        {
	        	return false; 
	        }
	    }
	    
}


