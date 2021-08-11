package week1.day1;

import java.util.Arrays;

public class learnArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.println("sorted array is"+arr[i]);
		
		for(int i=0;i<arr.length;)
		{
			if (arr[i]!=i)
			{
				
				System.out.println("the number missing is"+i);
				i++;
				
			}
			else
			{
				System.out.println("The number exist");
				break;
			}
			
		}
		

	}

}
