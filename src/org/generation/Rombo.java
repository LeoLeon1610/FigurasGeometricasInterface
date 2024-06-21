package org.generation;

public class Rombo implements FiguraGeometrica{
	private String nombre;
	private double DiagonalMenor;
	private double DiagonalMayor;
	private double lado;
	
	public Rombo(String nombre, double diagonalMenor, double diagonalMayor, double lado) {
		super();
		this.nombre = nombre;
		DiagonalMenor = diagonalMenor;
		DiagonalMayor = diagonalMayor;
		this.lado = lado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getDiagonalMenor() {
		return DiagonalMenor;
	}

	public void setDiagonalMenor(double diagonalMenor) {
		DiagonalMenor = diagonalMenor;
	}

	public double getDiagonalMayor() {
		return DiagonalMayor;
	}

	public void setDiagonalMayor(double diagonalMayor) {
		DiagonalMayor = diagonalMayor;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return (DiagonalMayor*DiagonalMenor)/2;
	}

	@Override
	public double calcularPerimetro() {
		return lado*4;
	}

	@Override
	public String toString() {
		return "Rombo [nombre=" + nombre + ", DiagonalMenor=" + DiagonalMenor + ", DiagonalMayor=" + DiagonalMayor
				+ ", lado=" + lado + "]";
	}
	
	
}
