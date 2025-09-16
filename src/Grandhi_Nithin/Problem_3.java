package Grandhi_Nithin;

import java.util.Scanner;

public class Problem_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		if(a%2 == 0) {
			int num = 1;
			for(int i=1; i<a; i++) {
				System.out.print(num+" ");
				num+=2;
			}
		}
		else {
			int num = 1;
			for(int i=1; i<=a; i++) {
				System.out.print(num+" ");
				num+=2;
			}
		}
	}

}
