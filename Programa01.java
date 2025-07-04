package aula03;

import java.util.Scanner;

public class Programa01 {
	// 1. Faça um programa em Java para armazenar 2 números inteiros. Exiba na tela a soma dos números armazenados.   
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;

		System.out.print("Digite o primeiro número inteiro: ");
		a = sc.nextInt();

		System.out.print("Digite o segundo número inteiro: ");
		b = sc.nextInt();

		int soma = a + b;
		System.out.println("A soma é: " + soma);
	}
}
