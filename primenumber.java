package week1.day1;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=35;
		boolean flag=false;
		for (int i=2; i<num/2;i++)
		{
			if (num%i==0)
			{
				System.out.println(num +"  is not a prime number");
				flag=true;
				}
			break;
		}
		if (flag==false)
		{
			System.out.println(num +"  is  a prime number");
		}
	}

}
