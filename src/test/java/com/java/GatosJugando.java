package com.java;

public class GatosJugando {


	public static void main(String[] args) {

	isCatPlaying(false, 35);
		
	}
	

	public static boolean isCatPlaying(boolean verano, int temperatura) {
	
	boolean resultado = false;
	
	if ((verano ==true) && (temperatura >= 25 && temperatura <=45)) {
		resultado = true;
		System.out.println("Los Gatos están jugando");
	} 
	else 
	if ((verano ==false) && (temperatura >= 25 && temperatura <=35)) {
		resultado = true;
		System.out.println("Los Gatos están jugando");
	} 
	 else {
	    resultado = false;
	    System.out.println("Los Gatos no están jugando");
	 }
    return resultado;
	    }
	}

