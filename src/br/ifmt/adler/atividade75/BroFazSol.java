package br.ifmt.adler.atividade75;

/**
 * Copyright (C) Adler Lopes, all rights reserved unauthorized copying of this
 * file, via any medium is strictly prohibited proprietary and confidential
 * 
 * eu@adlerlopes.com.br adlerlopes.com.br
 * 
 * C O P I A N A O C O M E D I A
 */

public class BroFazSol {

	public static void main(String[] args) {

		System.out.println("----------------------------------------------------------");
		System.out.println("                IFMT - CAMPUS RONDONOPOLIS                ");
		System.out.println("                                                          ");
		System.out.println("             Algoritmo e lógica da programação            ");
		System.out.println("                                                          ");
		System.out.println("                      Atividade 75                        ");
		System.out.println("----------------------------------------------------------");
		
		int first = 0, second = 0;
		
		String broadcast = "";

		while (first <= 10) {
			second = 1;
			
			broadcast = "(!) F: " + first  + " : ";
			
			while (second <= 10) {
				broadcast = broadcast + ", " + second;
				second += 1;
			}
			
			first += 1;
			
			System.out.println(broadcast);
		}
	}

}
