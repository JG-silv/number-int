package number01;

import java.util.Scanner;

public class Program01 {  

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;

		System.out.print("Enter the first integer: ");
		a = sc.nextInt();

		System.out.print("Enter the second integer: ");
		b = sc.nextInt();

		int soma = a + b;
		System.out.println("The sum is:" + soma);
	}
}
