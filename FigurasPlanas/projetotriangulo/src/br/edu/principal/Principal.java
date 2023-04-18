package br.edu.principal;
import br.edu.figurasgeoplanas.*;
public class Principal {

	public static void main(String[] args) {
		
		//triangulo
		
		Triangulo tri = new Triangulo();
		tri.base = 3;
		tri.altura = 5;
		
		tri.listaAtributosT();
		
		System.out.print("�rea do tri�ngulo: ");	
		double areaT = tri.calcAreaT();
		System.out.println(areaT);
		
		System.out.println(" ");
		
		//quadrado
		
		Quadrado qua = new Quadrado();
		qua.lado = 4;
		
		System.out.println("Lado do quadrado: "+qua.lado);
		
		System.out.print("�rea do quadrado: ");
		double areaQ = qua.calcAreaQ();
		System.out.println(areaQ);
		
		System.out.println(" ");
		
		//retangulo
		
		Ret�ngulo ret = new Ret�ngulo();
		ret.altura = 10;
		ret.comprimento = 4;
		
		ret.listaAtributosR();
		
		System.out.print("�rea do ret�ngulo: ");
		double areaR = ret.calcAreaR();
		System.out.println(areaR);
		
		System.out.println(" ");
		
		//circulo
		
		Circulo cir = new Circulo();
        cir.raio = 40;
		
		System.out.println("Raio do c�rculo: "+cir.raio);
		
		System.out.print("�rea do circulo: ");
		double areaC = cir.calcAreaC();
		System.out.println(areaC);
		
		System.out.println(" ");
		
		//losango
		
		Losango los = new Losango();
		los.DMaior = 9;
		los.DMenor = 6;
		
		los.listaAtributosL();
		
		System.out.print("�rea do losango: ");
		double areaL = los.calcAreaL();
		System.out.println(areaL);
		
		System.out.println(" ");
		
		//trapezio
		
		Trapezio tra = new Trapezio();
		tra.altura = 5;
		tra.BMaior = 10;
		tra.BMenor = 2;
		
		tra.listaAtributosTP();
		
		System.out.print("�rea do trap�zio: ");
		double areaTP = tra.calcAreaTP();
		System.out.println(areaTP);
		
        System.out.println(" ");
		
		//paralelogramo
		
		Paralelogramo para = new Paralelogramo();
		para.altura = 7;
		para.base = 1;
		
		para.listaAtributosP();
		
		System.out.print("�rea do paralelogramo: ");
		double areaP = para.calcAreaP();
		System.out.println(areaP);
		
			
		}		

	}
