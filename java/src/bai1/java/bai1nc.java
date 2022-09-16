package bai1.java;

import java.util.Scanner;

public class bai1nc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("nhao vao so  canh cua da giac:");
		int socanh=input.nextInt();
		float [] chieudaicanh = new float[socanh];
		for(int i=0;i<socanh;i++) {
			System.out.println("nhap chieu dai canh thu:"+(i+1));
			chieudaicanh[i]=input.nextFloat();
		}
		System.out.println("da giac ban nhap có"+socanh+"canh");
		int tong=0;
		for(int i=0;i<socanh;i++) {
			System.out.println("canh "+(i+1)+"="+chieudaicanh[i]);
			tong+=chieudaicanh[i];
		}
		System.out.print("chu vi da giac vua nhap la:"+tong);
	}

}
