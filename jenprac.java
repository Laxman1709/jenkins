

public class jenprac {

	public static void main(String[]args) {
		String s="madam";
		if(palindrome(s)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
			
	}
	private static boolean palindrome(String s) {
		StringBuilder b=new StringBuilder(s);
		if(b.reverse().toString().equals(s)) {
			return true;
		}
		return false;
	}

}
