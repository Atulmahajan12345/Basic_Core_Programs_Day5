package day5;

import java.util.Scanner;

public class Swappingprogram {

	public static void main(String[] args) {
		int num1,num2,temp;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first value");
		num1=sc.nextInt();
		System.out.println("Enter second");
		num2=sc.nextInt();
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("swap of two number number1  is "+ num1 + " and number2 is " + num2);
	}
	
		// TODO Auto-generated method stub

	}


