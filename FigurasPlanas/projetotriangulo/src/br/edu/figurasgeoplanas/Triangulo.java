package br.edu.figurasgeoplanas;

public class Triangulo {
	
	public double base;
	public double altura;
	public double area;
	
	public void listaAtributosT() {
		System.out.println("Base do tri�ngulo: "+base);
		System.out.println("Altura do tri�ngulo: "+altura);
	}
	
	public double calcAreaT() {
		area = (base * altura)/2;
		return area;
	}

	
}
