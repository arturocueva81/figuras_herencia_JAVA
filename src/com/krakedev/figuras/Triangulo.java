package com.krakedev.figuras;

public class Triangulo extends Figura {
	private int ladoA;
	private int ladoB;
	private int ladoC;
	
	public int getLadoA() {
		return ladoA;
	}

	public void setLadoA(int ladoA) {
		this.ladoA = ladoA;
	}

	public Triangulo(String nombre, String color, int ladoA, int ladoB, int ladoC) {
		super(nombre, color);
		this.ladoA= ladoA;
		this.ladoB= ladoB;
		this.ladoC= ladoC;
	}

	public int getLadoB() {
		return ladoB;
	}

	public void setLadoB(int ladoB) {
		this.ladoB = ladoB;
	}

	public int getLadoC() {
		return ladoC;
	}

	public void setLadoC(int ladoC) {
		this.ladoC = ladoC;
	}

	@Override
    public String toString() {
        return "Triangulo [nombre=" + getNombre() 
        + ", color=" + getColor()
        + ", ladoA=" + ladoA 
        + ", ladoB=" + ladoB 
        + ", ladoC=" + ladoC 
        + "]";
    }
	
	@Override
	public int calcularPerimetro() {
        return ladoA+ladoB+ladoC;
    }
	
	@Override
    public double calcularArea() {
		// Formula de Heron
        double s = (ladoA + ladoB + ladoC) / 2.0;
        return Math.round(Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC)) * 100.0) / 100.0;
    }

}
