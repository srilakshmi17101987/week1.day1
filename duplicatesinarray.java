package week1.day1;

import java.util.Iterator;

public class duplicatesinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,10,10,12,34,67,32,89,34};
		int count=0;
		
		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("duplicate value is"+arr[i]);
					//count++;
					//break;
				}
	
			}
			/*if (count>1)
			{
				System.out.println("Duplicate value is"+arr[i]);
			}*/
				
		}
		
			
		}
	}


