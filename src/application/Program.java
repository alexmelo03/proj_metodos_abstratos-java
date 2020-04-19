package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circles;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Entre com o número de formas: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Forma #"+ i + ":");
			System.out.print("Retangulo ou Circulo (r/c)? ");
			char resp = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED)? ");
			Color color = Color.valueOf(sc.next());
			
			if(resp == 'r') {
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				list.add(new Rectangle(color, largura, altura));
			}
			else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circles(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("AREAS E CORES DAS FORMAS:");
		for(Shape form : list ) {
			System.out.println(String.format("%.2f : ", form.area()) + form.getColor());
		}
		
		
		sc.close();
		

	}

}
