package com.krakedev.figuras;

public class Triangulo extends Figura {
	private int lado;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public Triangulo(String nombre, String color, int lado) {
		super(nombre, color);
		this.lado= lado;
	}

	@Override
	public String toString() {
		return "Triangulo [nombre:"+getNombre()+", color: "+getColor()+"]";
	}
	
	@Override
	public int calcularPerimetro() {
        return 0;
    }
	
	@Override
    public double calcularArea() {
        return 0;
    }

}
