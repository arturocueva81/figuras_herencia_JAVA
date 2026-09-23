package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Hexagono;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.Triangulo;
import com.krakedev.figuras.TrianguloRectangulo;

public class TestGraficar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graficador graf=new Graficador();
		//Figura figura = new Figura("Figura", "amarillo");
		Figura cuadrado = new Cuadrado("Cuadrado", "azul", 5);
		Figura triangulo = new Triangulo("Triangulo", "rojo", 3, 4, 5);
		Figura rect = new Rectangulo("Rectangulo ","verde", 3,4);
		Figura trianguloR = new TrianguloRectangulo("Triangulo Rectangulo", "morado", 3, 4);
		Figura hexagono = new Hexagono("Hexagono", "naranja", 5);
        
        System.out.println("Test Graficador");
        //graf.graficar(figura);
        graf.graficar(cuadrado);
        graf.graficar(triangulo);
        graf.graficar(rect);
        graf.graficar(trianguloR);
        graf.graficar(hexagono);

	}

}
