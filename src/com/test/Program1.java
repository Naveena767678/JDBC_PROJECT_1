package com.test;
import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("hello world!");
		Scanner sc=new Scanner(System.in);
		 System.out.println("square number");
		 System.out.println("enter the number:");
		int n= sc.nextInt();
		int sqnum =n*n;
		 System.out.println("the square number of "+n+"is "+sqnum);
		
	}

}
