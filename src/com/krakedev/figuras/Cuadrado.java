package com.krakedev.figuras;

public class Cuadrado extends Figura {
	public Cuadrado(String nombre, String color) {
		super(nombre, color);
	}

	@Override
	public String toString() {
		return "Cuadrado [nombre=" + getNombre() + ", color=" + getColor() + "]";
	}

}
