package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Triangulo;

public class TestFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prueba Inicial:");
		
		Figura fig = new Figura("Figura","Rojo");
		System.out.println(fig);
		
		Cuadrado cuad = new Cuadrado("Cuadro","Azul", 0);
		System.out.println(cuad);
		
		Triangulo tri = new Triangulo("Triangulo","Amarillo");
		System.out.println(tri);

	}

}
