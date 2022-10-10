package com.poo.javabank;

import java.text.DecimalFormat;

public class Conto {
	
	//dichiarazione variabili
	private int numConto;
	private String nomeTitolare;
	private double saldo;
	
	
	//construttore
	public Conto(int numConto, String nomeTitolare) {	
		this.numConto = numConto;
		this.nomeTitolare = nomeTitolare;
		this.saldo = 0.0d;
	}
	
	

	
	//metodo di versamento
	public void versamento(double quantita) {
		
		saldo += quantita;
	}
	
	//metodo di prelievo
	public void prelievo(double quantita) {
	
			saldo -= quantita;
	}

	//info conto
	public String infoConto() {
		
		return "\nNumero Conto: "+numConto+ "\nNome Titolare: "+nomeTitolare+"\nSaldo: "+saldo+"\n";
	}
	
	

	public int getNumConto() {
		return numConto;
	}


	


	public String getNomeTitolare() {
		return nomeTitolare;
	}

	public void setNomeTitolare(String nomeTitolare) {
		this.nomeTitolare = nomeTitolare;
	}

	public double getSaldo() {
		return saldo;
	}


	
	
}
