package week1.day1;

public class oddindextouppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome sri";
//System.out.println(str.toUpperCase());
		char newstr[] = str.toCharArray();
		for (int i = 0; i < newstr.length; i++) {
			if (i % 2 != 0) {
				System.out.print(Character.toUpperCase(newstr[i]));
				// newstr=str.toUpperCase(i);
			} else {
				System.out.print(newstr[i]);
			}
		}

	}

}
