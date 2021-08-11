package week1.day1;

public class fabinocciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=10;
		int firstnum=0,secondnum=1,sum=0;
		System.out.println("the fabinocci series for the number "+ range + " is");
		System.out.println(firstnum + " " + secondnum);
		for (int i=1;i<range;i++)
		{
			sum=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=sum;
			System.out.println(sum);
		}
	}

}
