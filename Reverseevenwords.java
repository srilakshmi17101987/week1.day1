package week1.day1;

public class Reverseevenwords {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "I am a software tester"; 
		String arr[]=str.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			if (i%2!=0)
			{
				String text=arr[i];
						for (int j=text.length()-1;j>=0;j--)
						{
							System.out.print(text.charAt(j));
						}
			}
			else
			{
				System.out.print(arr[i]);
		
			}	
			System.out.print(" ");
		}
	}
}
