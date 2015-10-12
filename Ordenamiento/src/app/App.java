package app;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int[] arrNoOrdenado;
		Random rn = new Random();	
			
		int longitud;
		Scanner entrada = new Scanner(System.in);
				
		System.out.print("Ingrese la cantidad de elementos del arreglo: ");
		longitud = entrada.nextInt();
		
		arrNoOrdenado = new int[longitud];
		
		for (int i = 0; i < longitud; i++){
			arrNoOrdenado[i] = rn.nextInt(500) + 1;
		}
		System.out.println("Areglo Desordenado: "+ Arrays.toString(arrNoOrdenado));
		
		Quicksort algoritmo = new Quicksort();		
		
		algoritmo.sort(arrNoOrdenado);
	
		System.out.println("Areglo Ordenado: "+ Arrays.toString(arrNoOrdenado));
		
	}

}
