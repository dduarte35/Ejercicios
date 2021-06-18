package com.java;

public class VerificadorDeNumeros {

	public static void main(String[] args) {
	
	imprimirVerificadorNumeros(1,0,-3);
		
	}

	
	public static void imprimirVerificadorNumeros (int a, int b, int c) {
	
	if ((a<0) || (b<0) || (c<0)){
	System.out.println("Valor no válido");
	} 
	
	else if ((a==b) && (b==c)) {
		System.out.println("Todos los números son iguales");
		} 
	        else if  ((a!=b) && (b!=c)) {
		      System.out.println("Todos los números son diferentes");
	}
	
	else {
	    System.out.println("Ni todos son iguales ni diferentes");
	}
	}
	
	
}
