package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Rectangulo;

public class TestPerimetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test Perimetro");
		
		Cuadrado cuad=new Cuadrado("Cuadrado", "rojo", 5);
		System.out.println(cuad);
		System.out.println("Perimetro: "+cuad.calcularPerimetro());
		
		Rectangulo rect=new Rectangulo("Rectangulo", "verde", 4, 3);
		System.out.println(rect);
		System.out.println("Perimetro: "+rect.calcularPerimetro());

	}

}
