package calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int expresion = sc.nextInt();
		int result = 0;
		
		Calcualtor x = new Calcualtor();
		
		int a;
		int b;
		
		switch (expresion) {
		case 1:
			System.out.println("Soma");
			a = sc.nextInt();
			b = sc.nextInt();
			result = x.sum(a,b);
			break;
		case 2:
			System.out.println("Subtração");
			a = sc.nextInt();
			b = sc.nextInt();
			result = x.sub(a, b);
			break;
		case 3:	
			System.out.println("Divisão");
			a = sc.nextInt();
			b = sc.nextInt();
			result = x.div(a, b);
			break;
		case 4:
			System.out.println("Multiplicação");
			a = sc.nextInt();
			b = sc.nextInt();
			result = x.mult(a, b);
			break;
		default:
			System.out.println("Valor Inválido");
			break;
		}
		System.out.printf("Resultado = %d",result);

	}

}
