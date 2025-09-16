package Grandhi_Nithin;

import java.util.Scanner;

public class Problem_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		int num = 1;
		for(int i=1; i<=a; i++) {
			System.out.print(num+" ");
			num+=2;
		}
	}
	
}
