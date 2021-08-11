package week1.day1;

import java.util.Arrays;

public class findsecondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {23,34,45,13,20};
		int i=0;
		Arrays.sort(arr);
		for(i=0;i<arr.length;i++)
		{
			System.out.println("sorted array is"+arr[i]);
		}
		int a=arr.length-2;
		 System.out.println("The second largest array is"+arr[a]);
	}

}
