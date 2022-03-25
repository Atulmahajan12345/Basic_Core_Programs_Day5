package day5;

import java.util.Scanner;

public class QuotientReminder {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			int divident,divisor,quotient,remainder;
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Divident");
			divident=s.nextInt();
			System.out.println("Enter Divisor");
			divisor=s.nextInt();
		
			quotient=divident/divisor;
			remainder=divident%divisor;
			
			System.out.println("Quotient is "+ quotient);
			System.out.println("Remainder is "+ remainder);
		}

	

		
		// TODO Auto-generated method stub

	}


