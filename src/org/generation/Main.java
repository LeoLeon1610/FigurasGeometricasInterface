package org.generation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangulo bermudas = new Triangulo("Bermudas",20,10,15);
		Triangulo t = new Triangulo("TrianguloTe",12,6,10);
		Cuadrado c = new Cuadrado("Kawaii", 4);
		Rectangulo r= new Rectangulo("Rectangulo", 3, 4);
		Rombo rombi= new Rombo("Rombo", 5, 6, 4);
		Romboide romboidete= new Romboide("Romboidete", 5, 10);
		Trapecio trapeador = new Trapecio("Trapeciotrapeador", 3, 4, 5, 6, 8, 10, 12);
		
		imprimirCalculo(bermudas);
		imprimirCalculo(t);
		imprimirCalculo(c);
		imprimirCalculo(r);
		imprimirCalculo(rombi);
		imprimirCalculo(romboidete);
		imprimirCalculo(trapeador);
		
	}//main
	
	public static void imprimirCalculo(FiguraGeometrica t) {
		System.out.println(t.toString());
		System.out.println("+===================================");
		System.out.println("|El área de ["+t.getNombre()
				+ "] es : " + t.calcularArea());
		System.out.println("|El perímetro de ["+t.getNombre()
				+ "] es : " + t.calcularPerimetro());
		System.out.println("+===================================");
		
	}//imprimir calculo

}//Class main
