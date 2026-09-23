package com.krakedev.figuras;

public class Hexagono extends Figura{
	
	private int lado;

    public Hexagono(String nombre, String color, int lado) {
        super(nombre, color);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public int calcularPerimetro() {
        return 6 * lado;
    }

    @Override
    public double calcularArea() {
    	double area = (3 * Math.sqrt(3) * Math.pow(lado, 2)) / 2;
    	return Math.round(area*1000.0)/1000.0;
    }

    @Override
    public String toString() {
        return "Hexagono [nombre=" + getNombre() 
        + ", color=" + getColor() 
        + ", lado=" + lado 
        + "]";
    }

}
