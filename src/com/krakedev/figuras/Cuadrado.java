package com.krakedev.figuras;

public class Cuadrado extends Figura {
	
	private int lado;
	
	
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public Cuadrado(String nombre, String color, int lado) {
		super(nombre, color);
		this.lado=lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [nombre=" + getNombre() + ", color=" + getColor() +", lado="+getLado()+ "]";
	}
	
	@Override
	public int calcularPerimetro() {
		return lado*4;
	}

}
