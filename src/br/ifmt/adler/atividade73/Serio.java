package br.ifmt.adler.atividade73;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Copyright (C) Adler Lopes, all rights reserved unauthorized copying of this
 * file, via any medium is strictly prohibited proprietary and confidential
 * 
 * eu@adlerlopes.com.br adlerlopes.com.br
 * 
 * C O P I A N A O C O M E D I A
 */

public class Serio {

	public static void main(String[] args) {

		System.out.println("----------------------------------------------------------");
		System.out.println("                IFMT - CAMPUS RONDONOPOLIS                ");
		System.out.println("                                                          ");
		System.out.println("             Algoritmo e lógica da programação            ");
		System.out.println("                                                          ");
		System.out.println("                      Atividade 73                        ");
		System.out.println("----------------------------------------------------------");

		float persons = 0, personsCount = 0, msCount = 0;
		int mediaFilhos = 0;

		float maiorSalario = 0.0f, mediaSalario = 0.0f;

		List<PersonConstructor> personsData = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);

		System.out.print("(0) Escreva a quantidade de pessoas na cidade: ");
		persons = scanner.nextInt();

		for (int i = 0; i < persons; i++) {
			int filhos = 0;
			float salario = 0.0f;

			System.out.print("(" + i + ") Escreva a quantidade de filhos: ");
			filhos = scanner.nextInt();

			System.out.print("(" + i + ")  Informe o seu salário mensal: ");
			salario = scanner.nextFloat();

			personsData.add(new PersonConstructor(filhos, salario));
		}

		for (PersonConstructor pc : personsData) {
			mediaFilhos = mediaFilhos + pc.getFilhos();
			mediaSalario = mediaSalario + pc.getSalario();
			personsCount++;

			if (pc.getSalario() > maiorSalario) {
				maiorSalario = pc.getSalario();
			}

			if (150 > pc.getSalario()) {
				msCount++;
			}
		}

		mediaFilhos = (int) (mediaFilhos / personsCount);
		mediaSalario = (mediaSalario / personsCount);

		System.out.println("----------------------------------------------------------");
		System.out.println("                IFMT - CAMPUS RONDONOPOLIS                ");
		System.out.println("                                                          ");
		System.out.println("Resultados da pesquisa:        ");
		System.out.println("                                                          ");
		System.out.println("Habitantes: " + personsCount);
		System.out.println("Salário em média: R$" + mediaSalario);
		System.out.println("Filhos em média: " + mediaFilhos);
		System.out.println("Média menor salário: " + ((msCount / persons) * 100) + "%");
		System.out.println("                      Atividade 73                        ");
		System.out.println("----------------------------------------------------------");

		scanner.close();

	}

	public static class PersonConstructor {

		private int filhos;
		private float salario;

		public PersonConstructor(int filhos, float salario) {
			this.filhos = filhos;
			this.salario = salario;
		}

		public int getFilhos() {
			return filhos;
		}

		public float getSalario() {
			return salario;
		}

	}

}
