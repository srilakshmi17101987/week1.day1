package week1.day1;
import java.util.*;

public class polindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner in=new Scanner(System.in);
		//System.out.println("enter a string");
 String txt="madam";
 //txt=in.nextLine();
 String rev="";
 System.out.println("string length is"+txt.length());
 for(int i=txt.length()-1;i>=0;i--)
 {
	 rev=rev+txt.charAt(i);
 }
 if (txt.equals(rev))
 {
	 System.out.println("string is polindrome");
 }
 else
 {
	 System.out.println("string is not a polindrome");
 }
	}
}

