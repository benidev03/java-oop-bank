package com.poo.javabank;

import java.util.Random;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		
		int scelta;
		String nomeTitolare;
		double somma;
		int numeroConto = r.nextInt(1000) + 1;
		
		
		
		System.out.println("CREAZIONE DI UN CONTO BANCARIO\n");
		System.out.print("Inserire il nome del titolare: ");
		nomeTitolare = sc.nextLine();
		
		Conto conto = new Conto(numeroConto, nomeTitolare);
		
		System.out.println("Bevenuto "+nomeTitolare.toUpperCase()+" nella tua area personale\n");
		
		do {
			
			System.out.println("1 - Versamento");
			System.out.println("2 - Prelievo");
			System.out.println("3 - Info");
			System.out.println("0 - Uscire");
			
			System.out.print("\nScegliere un'operazione: ");
			scelta = sc.nextInt();
			
			switch(scelta) {
			
			case 1:
				System.out.print("Somma da versare :");
				somma = sc.nextDouble();
				conto.versamento(somma);
				System.out.println("Operazione riuscita!\n");
				break;
			case 2:
				System.out.print("Somma da prelevare :");
				somma = sc.nextDouble();
				if(conto.getSaldo() > somma) {
					conto.prelievo(somma);
					System.out.println("Operazione riuscita!\n");
				}else {
					System.out.println("Operazione non possinile! Saldo insufficiente\n");
				}
				
				break;
			case 3:
				System.out.println("\nDettagli del conto" +conto.infoConto());
				
				break;
			case 0:
				System.out.println("Arrivederci");
				break;
			default: System.out.println("Scelta non corretto");
			}
			
		}while(scelta != 0);
		
			
		sc.close();

	}

}
