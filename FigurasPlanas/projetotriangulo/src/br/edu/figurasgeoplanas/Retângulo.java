package br.edu.figurasgeoplanas;

public class Ret�ngulo {
    public double altura;
    public double comprimento;
    public double areaR;
    
public void listaAtributosR() {
	System.out.println("Altura do ret�ngulo: "+altura);
	System.out.println("Comprimento do ret�ngulo: "+comprimento);
	
}
	
public double calcAreaR() {
	areaR = altura * comprimento;
	return areaR;
}
}

