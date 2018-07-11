package br.ifmt.roo.emi.hexadecimal;

import java.util.Scanner;

/**
 * Copyright (C) Adler Lopes, all rights reserved unauthorized copying of this
 * file, via any medium is strictly prohibited proprietary and confidential
 */
public class Hexadecimal {

	public static void main(String[] args) {
		String data = "";
		int numberResource = 0;
		int count = 0;

		System.out.print("Insira os caracteres hexadecimais: ");

		System.out.println(2 * (int) Math.pow(16, 1));

		Scanner scanner = new Scanner(System.in);

		data = scanner.nextLine();
		scanner.close();

		for (int i = data.length(); i > 0; i--) {

			switch (data.charAt((i - 1))) {
			case 'A':
				System.out.println("A");
				System.out.println("Math: " + (int) Math.pow(16, count));
				System.out.println("Result: " + 10 * (int) Math.pow(16, count));
				System.out.println("Count: " + count);

				numberResource += 10 * (int) Math.pow(16, count);
				count++;
				break;
			case 'B':
				System.out.println("B");
				System.out.println("Math: " + (int) Math.pow(16, count));
				System.out.println("Result: " + 11 * (int) Math.pow(16, count));
				System.out.println("Count: " + count);

				numberResource += 11 * (int) Math.pow(16, count);
				count++;
				break;
			case 'C':
				System.out.println("C");
				System.out.println("Math: " + (int) Math.pow(16, count));
				System.out.println("Result: " + 12 * (int) Math.pow(16, count));
				System.out.println("Count: " + count);

				numberResource += 12 * (int) Math.pow(16, count);
				count++;
				break;
			case 'D':
				System.out.println("D");
				System.out.println("Math: " + (int) Math.pow(16, count));
				System.out.println("Result: " + 13 * (int) Math.pow(16, count));
				System.out.println("Count: " + count);

				numberResource += 13 * (int) Math.pow(16, count);
				count++;
				break;
			case 'E':
				System.out.println("E");
				System.out.println("Math: " + (int) Math.pow(16, count));
				System.out.println("Result: " + 14 * (int) Math.pow(16, count));
				System.out.println("Count: " + count);

				numberResource += 14 * (int) Math.pow(16, count);
				count++;
				break;
			case 'F':
				System.out.println("F");
				System.out.println("Math: " + (int) Math.pow(16, count));
				System.out.println("Result: " + 15 * (int) Math.pow(16, count));
				System.out.println("Count: " + count);

				numberResource += 15 * (int) Math.pow(16, count);
				count++;
				break;
			case '1':
				System.out.println("1");
				System.out.println("Math: " + (int) Math.pow(16, count));
				System.out.println("Result: " + 1 * (int) Math.pow(16, count));
				System.out.println("Count: " + count);

				numberResource += 1 * (int) Math.pow(16, count);
				count++;
				break;
			case '2':
				System.out.println("2");
				System.out.println("Math: " + (int) Math.pow(16, count));
				System.out.println("Result: " + 2 * (int) Math.pow(16, count));
				System.out.println("Count: " + count);

				numberResource += 2 * (int) Math.pow(16, count);
				count++;
				break;
			case '3':
				System.out.println("3");
				System.out.println("Math: " + (int) Math.pow(16, count));
				System.out.println("Result: " + 3 * (int) Math.pow(16, count));
				System.out.println("Count: " + count);

				numberResource += 3 * (int) Math.pow(16, count);
				count++;
				break;
			case '4':
				System.out.println("4");
				System.out.println("Math: " + (int) Math.pow(16, count));
				System.out.println("Result: " + 4 * (int) Math.pow(16, count));
				System.out.println("Count: " + count);

				numberResource += 4 * (int) Math.pow(16, count);
				count++;
				break;
			case '5':
				System.out.println("5");
				System.out.println("Math: " + (int) Math.pow(16, count));
				System.out.println("Result: " + 5 * (int) Math.pow(16, count));
				System.out.println("Count: " + count);

				numberResource += 5 * (int) Math.pow(16, count);
				count++;
				break;
			case '6':
				System.out.println("6");
				System.out.println("Math: " + (int) Math.pow(16, count));
				System.out.println("Result: " + 6 * (int) Math.pow(16, count));
				System.out.println("Count: " + count);

				numberResource += 6 * (int) Math.pow(16, count);
				count++;
				break;
			case '7':
				System.out.println("7");
				System.out.println("Math: " + (int) Math.pow(16, count));
				System.out.println("Result: " + 7 * (int) Math.pow(16, count));
				System.out.println("Count: " + count);

				numberResource += 7 * (int) Math.pow(16, count);
				count++;
				break;
			case '8':
				System.out.println("8");
				System.out.println("Math: " + (int) Math.pow(16, count));
				System.out.println("Result: " + 8 * (int) Math.pow(16, count));
				System.out.println("Count: " + count);

				numberResource += 8 * (int) Math.pow(16, count);
				count++;
				break;
			case '9':
				System.out.println("9");
				System.out.println("Math: " + (int) Math.pow(16, count));
				System.out.println("Result: " + 9 * (int) Math.pow(16, count));
				System.out.println("Count: " + count);

				numberResource += 9 * (int) Math.pow(16, count);
				count++;
				break;
			}

		}

		System.out.println("NR: " + numberResource);

	}

}
