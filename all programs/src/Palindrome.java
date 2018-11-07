

import java.util.Scanner;
/**
 * @author Mohammed Omar
 *
 */
public class Palindrome {

	public static void main(String[] args) {
		String original;
		System.out.println("Enter Value:");
		Scanner sc=new Scanner(System.in);
		original=sc.next();
		if(original.equals(new StringBuffer(original).reverse().toString()))   //we have used stringbuffer so that we can use built in reverse() of StringBuffer class using this we can check palindrome of numbers and strings
				System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
		sc.close();
	}
}
