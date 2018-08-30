package testpack;

import java.util.Scanner;

public class Framework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is my framework");
		System.out.println("pavithra add a method");
		stringPanlindromeByNisha();
		stringPalindromeBySathish("Sathish");
		stringPalindromeByMadhuri();
	}

	public static void StringPalindromeByGanesh() {

	}

	public static void StringPalindromeBypavithra() {

	}

	public static void stringPanlindromeByNisha() {
		String s = "nisha";
		String reverse = "";
		for (int i = 0; i < s.length(); i++) {
			reverse = reverse + s.charAt(i);

		}
		System.out.println(reverse);
	}

	public static void stringPalindromeBySathish(String a) {
		String b = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			b = b + a.charAt(i);
		}
		if (a.equalsIgnoreCase(b)) {
			System.out.println(a + " - This string is palindrome.");
		} else {
			System.out.println(a + " - This string is not palindrome.");
		}
	}

	public static void stringPalindromeByMadhuri() {
			 String str, rev = "";
		      Scanner sc = new Scanner(System.in);
		 
		      System.out.println("Enter a string:");
		      str = sc.nextLine();
		 
		      int length = str.length();
		 
		      for ( int i = length - 1; i >= 0; i-- )
		         rev = rev + str.charAt(i);
		 
		      if (str.equals(rev))
		         System.out.println(str+" is a palindrome");
		      else
		         System.out.println(str+" is not a palindrome");		 
		   }
		
	}
