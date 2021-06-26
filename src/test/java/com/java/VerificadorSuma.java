package com.java;

public class VerificadorSuma {

	public static void main(String[] args) {
	
	hasEqualSum(1,1,2);
	
	}

	public static boolean hasEqualSum (int x, int y, int z) {
	
	boolean resp = false;
	
	if ((x+y)==z) {
		resp=true;
		System.out.println("El resultado es:" +resp);
	}
	else {
		resp= false;
		System.out.println("El resultado es:" +resp);
	}
	return resp;
	}
	
}
