//Java Program to validate password
package container;
import java.util.Scanner;

public class Validator {
	public static boolean isValid(String str) {
		//for password length 8 to 13
		if (!((str.length() >= 8) && (str.length() <= 13))) {
		return false;
		}
		if(str.contains(" ")) // to check space
		{
		return false;
		}
		if(true)
		{ int count=0; //check digits from 0 to 9
		for(int i=0;i<=9;i++)
		{ String str1 = Integer.toString(i);
		if(str.contains(str1))
		{
		count=1;
		}
		}
		if(count==0)
		{
		return false;
		}
		}

		// for special characters without using regex
		if(!(str.contains("@")||str.contains("#")||str.contains("!")||str.contains("~")||str.contains("$")||str.contains("%")||str.contains("^")||str.contains("&")||str.contains("*")||str.contains("(")||str.contains(")")||str.contains("-")||str.contains("+")||str.contains("/")||str.contains(":")||str.contains(".")||str.contains(",")||str.contains("”)||str.contains(“?”)||str.contains(“|”)))
		{
		return false;
		}
		if(true)
		{ int count=0;
		for(int i=65;i<=90;i++) //capital letters
		{
		char c=(char)i;
		String str1=Character.toString(c);
		if(str.contains(str1))
		{
		count=1;
		}

		}
		if(count==0)
		{
		return false;
		}
		}
		if(true)
		{ int count=0;
		for(int i=90;i<=122;i++) //small letters
		{
		char c=(char)i;
		String str1=Character.toString(c);
		if(str.contains(str1))
		{
		count=1;
		}
		}
		if(count==0)
		{
		return false;
		}
		}
		if(str.contains(";")) //should not contain semicolon
		{
		return false;
		}

		return true;
		}

		public static void main(String[] a) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a password with proper password policies : ");

		String str = scn.nextLine();

		if (isValid(str)) {
		System.out.println("Valid Password");
		} else {
		System.out.println("Invalid Password!!!");
		}
		scn.close();
		}


}
