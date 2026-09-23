package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Triangulo;

public class TestGraficar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graficador graf=new Graficador();
		Figura figura = new Figura("Figura", "amarillo");
        Cuadrado cuadrado = new Cuadrado("Cuadrado", "azul");
        Triangulo triangulo = new Triangulo("Triangulo", "rojo");
        
        System.out.println("Test Graficador");
        graf.graficar(figura);
        graf.graficar(cuadrado);
        graf.graficar(triangulo);
		

	}

}
