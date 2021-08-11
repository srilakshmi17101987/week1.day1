package week1.day1;

public class sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=123,remainder=0,quotient;
int sum=0;
while(num%10>0)
{
	remainder=num%10;
	sum=sum+remainder;
	quotient=num/10;
	num=quotient;
}
System.out.println("The sum of digits is "+sum);

	}

}
