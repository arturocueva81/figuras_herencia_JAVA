package com.krakedev.figuras;

public class Figura {
	private String nombre;
	private String color;
	
	public Figura(String nombre, String color) {
		super();
		this.nombre = nombre;
		this.color = color;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Figura [nombre=" + nombre + ", color=" + color + "]";
	}
	
	public int calcularPerimetro() {
        return 0;
    }
	
	public double calcularArea() {
        return 0;
    }

}
