package testpack;

import java.util.Scanner;

public class Framework {
	public static void main(String[] args) {
		System.out.println("this is my framework");
		System.out.println("pavithra add a method");
		stringPanlindromeByNisha();
		stringPalindromeBySathish("Sathish");
		stringPalindromeBySelvamani();
		  System.out.println("line added by senthil");
	}
  public static void StringPalindromeByGanesh() {
}
	public static void StringPalindromeBypavithra() {
}
	public static void stringPanlindromeByNisha() {
		String s="nisha";
		String reverse="";
		for(int i=0;i<s.length();i++) {
			reverse=reverse+s.charAt(i);
			}
		System.out.println(reverse);
	}
	public static void stringPalindromeBySathish(String a) {
		String b= "";
        for(int i = a.length() - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println(a + " - This string is palindrome.");
        }
        else
        {
            System.out.println(a + " - This string is not palindrome.");
        }
	}
   public static void stringPalindromeBySelvamani() {
		String original, reverse ="";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value to check Palindrome");
		original = input.nextLine();
		for (int i=original.length()-1;i>=0;i--)
		{
	    reverse = reverse + original.charAt(i);
		}
		if (original.equalsIgnoreCase(reverse))
		{
			System.out.println(original + " is a palindrome" );
		}
		else {
			System.out.println(original + " is not a palindrome");
		}
   }
   public static void stringPanlindromeBykarthika() {
		String s="karthika";
		String rev="";
		for(int i=0;i<s.length();i++) {
			rev=rev+s.charAt(i);
			}
		System.out.println(rev);
	}
   
   public void empname() {
System.out.println("jananajanananjanananjanan");
}
}
