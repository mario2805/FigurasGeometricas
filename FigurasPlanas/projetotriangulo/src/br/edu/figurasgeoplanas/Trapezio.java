package br.edu.figurasgeoplanas;

public class Trapezio {
	public double BMaior;
	public double BMenor;
	public double altura;
	public double areaTP;
	
public void listaAtributosTP() {
		System.out.println("Base maior do trap�zio: "+BMaior);
		System.out.println("Base menor do trap�zio: "+BMenor);
		System.out.println("Altura do trap�zio: "+altura);
	}	
	
public double calcAreaTP() {
	areaTP = ((BMaior + BMenor) * altura)/2;
	return areaTP;
}

}
