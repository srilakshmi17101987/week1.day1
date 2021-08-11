package week1.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="stops";
		String str1="abcde";
		char arr1[] = null,arr2[]=null;
		int len=str.length();
		int len1=str1.length();
		if (len==len1)
		{
	     arr1= str.toCharArray();
	     arr2=str1.toCharArray();
		}
		else
		{
			System.out.println("hi");
			return;	
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		boolean a= Arrays.equals(arr1, arr2);
		if (a==true)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}		
	}

}
