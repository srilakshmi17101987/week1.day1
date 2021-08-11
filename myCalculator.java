package week1.day1;

public class myCalculator {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myCalculator obj2= new myCalculator();
		calculator obj1=new calculator();
        int add= obj1.sum(23, 34, 45);
        System.out.println("sum of twom values is" +add);
        float ans1=obj1.div(234.56f,24.10f);
        System.out.println("division of of two values is" +ans1);
        int ans2=obj1.sub(56, 46);
        System.out.println("subtraction of of two values is" +ans2);
        double ans3=obj1.mul(12.34, 23.56);
        System.out.println("multiplication of two values is" +ans3);
	}

}
