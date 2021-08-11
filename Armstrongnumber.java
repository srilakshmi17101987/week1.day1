package week1.day1;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int calculated=0,remainder,input=153,quotient;
		int original=input;
	
		while(original>0)
		{
		remainder=original%10;
		//System.out.println(remainder);
		//System.out.println(remainder*remainder*remainder);
		quotient=original/10;		
		original=quotient;
		calculated=calculated+(remainder*remainder*remainder);
		System.out.println(calculated);
		//break;
		}
		
		
		if (input==calculated)
		{
			System.out.println("the given numver" +input+ " is Armstrong");
		}
		else
			
		System.out.println("The number" +input + "is not armstrong");

	}

}
