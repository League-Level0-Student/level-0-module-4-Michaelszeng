import java.util.Random;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


public class StringMethods2 {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it with
		//    random upper and lower case characters.
String x = "ArGEashRT";
		// 2. Print your String to the console in upper case.
System.out.println(x.toUpperCase());
		// 3. Print your String to the console in lower case.
System.out.println(x.toLowerCase());
		// 4. Print the first 3 char's of your String
		//    HINT: .substring(start,end)
System.out.println(x.substring(0, 3));
		// 5. Print a single char somewhere in the middle of your String
		//    REMINDER: char's in string start at index 0


Random y = new Random();
int ran = y.nextInt(x.length());
System.out.println(x.substring(ran,ran+1));
		// 6. BONUS -- print the LAST 3 char's of your string using
		//        .length() to determine WHERE the last 3 char's are located.
int a=x.length();
System.out.println(x.substring(a-3, a));
	}
}
