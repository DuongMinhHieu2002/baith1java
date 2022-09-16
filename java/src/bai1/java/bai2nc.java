package bai1.java;

import java.util.Scanner;

public class bai2nc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("nhap so a:");
		float a=input.nextFloat();
		System.out.print("nhap so b:");
		double b=input.nextDouble();
		System.out.println("--------");
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println("--------");
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println("--------");
		System.out.println(a+"x"+b+"="+(a*b));
		System.out.println("--------");
		System.out.println(a+"/"+b+"="+(a/b));
		System.out.println("--------");
		System.out.println(a+"%"+b+"="+(a%b));
	}

}
