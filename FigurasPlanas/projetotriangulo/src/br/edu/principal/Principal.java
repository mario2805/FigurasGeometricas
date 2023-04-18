package br.edu.principal;
import br.edu.figurasgeoplanas.*;
public class Principal {

	public static void main(String[] args) {
		
		//triangulo
		
		Triangulo tri = new Triangulo();
		tri.base = 3;
		tri.altura = 5;
		
		tri.listaAtributosT();
		
		System.out.print("Área do triângulo: ");	
		double areaT = tri.calcAreaT();
		System.out.println(areaT);
		
		System.out.println(" ");
		
		//quadrado
		
		Quadrado qua = new Quadrado();
		qua.lado = 4;
		
		System.out.println("Lado do quadrado: "+qua.lado);
		
		System.out.print("Área do quadrado: ");
		double areaQ = qua.calcAreaQ();
		System.out.println(areaQ);
		
		System.out.println(" ");
		
		//retangulo
		
		Retângulo ret = new Retângulo();
		ret.altura = 10;
		ret.comprimento = 4;
		
		ret.listaAtributosR();
		
		System.out.print("Área do retângulo: ");
		double areaR = ret.calcAreaR();
		System.out.println(areaR);
		
		System.out.println(" ");
		
		//circulo
		
		Circulo cir = new Circulo();
        cir.raio = 40;
		
		System.out.println("Raio do círculo: "+cir.raio);
		
		System.out.print("Área do circulo: ");
		double areaC = cir.calcAreaC();
		System.out.println(areaC);
		
		System.out.println(" ");
		
		//losango
		
		Losango los = new Losango();
		los.DMaior = 9;
		los.DMenor = 6;
		
		los.listaAtributosL();
		
		System.out.print("Área do losango: ");
		double areaL = los.calcAreaL();
		System.out.println(areaL);
		
		System.out.println(" ");
		
		//trapezio
		
		Trapezio tra = new Trapezio();
		tra.altura = 5;
		tra.BMaior = 10;
		tra.BMenor = 2;
		
		tra.listaAtributosTP();
		
		System.out.print("Área do trapézio: ");
		double areaTP = tra.calcAreaTP();
		System.out.println(areaTP);
		
        System.out.println(" ");
		
		//paralelogramo
		
		Paralelogramo para = new Paralelogramo();
		para.altura = 7;
		para.base = 1;
		
		para.listaAtributosP();
		
		System.out.print("Área do paralelogramo: ");
		double areaP = para.calcAreaP();
		System.out.println(areaP);
		
			
		}		

	}
