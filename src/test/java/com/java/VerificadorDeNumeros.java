package com.java;

public class VerificadorDeNumeros {

	public static void main(String[] args) {
	
	imprimirVerificadorNumeros(1,0,-3);
		
	}

	
	public static void imprimirVerificadorNumeros (int a, int b, int c) {
	
	if ((a<0) || (b<0) || (c<0)){
	System.out.println("Valor no v�lido");
	} 
	
	else if ((a==b) && (b==c)) {
		System.out.println("Todos los n�meros son iguales");
		} 
	        else if  ((a!=b) && (b!=c)) {
		      System.out.println("Todos los n�meros son diferentes");
	}
	
	else {
	    System.out.println("Ni todos son iguales ni diferentes");
	}
	}
	
	
}
