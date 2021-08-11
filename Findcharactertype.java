package week1.day1;

public class Findcharactertype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter=0,space=0,num=0,specialchar=0;
		char[] arr=test.toCharArray();
		for (int i=0;i<arr.length;i++)
		{
			if(Character.isLetter(arr[i]))
			{
				letter=letter+1;
				//System.out.println("Letter"+arr[i]+"count"+letter);
				//return;
			}
			//System.out.println("Letter"+arr[i]+ ""+letter);
			else if(Character.isDigit(arr[i]))
			{
				num=num+1;
				//System.out.println("num"+arr[i]);
				//continue;
			}
			else if (Character.isSpaceChar(arr[i]))
			{
				space=space+1;
				//System.out.println("space"+arr[i] + "count"+space);
				
			}
			else
			{
				specialchar=specialchar+1;
				//System.out.println("special character and count"+arr[i]+ " "+specialchar);
				//continue;
			}
		}
		System.out.println("Letter"+letter);
		System.out.println("Number"+num);
		System.out.println("space"+space);
		System.out.println("Special character"+specialchar);
		
	}

}
