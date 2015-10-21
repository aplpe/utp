package app;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

	private static Scanner entrada;

	public static void main(String[] args) {

		int[] arrNoOrdenado, arrOrdenado;
		Random rn = new Random();

		int longitud = 0, opcionMenu = 0;
		entrada = new Scanner(System.in);

		//System.out.print("Ingrese la cantidad de elementos del arreglo: ");
		System.out.print("Ingrese el numero de elementos del arreglo: ");
		longitud = entrada.nextInt();

		arrNoOrdenado = new int[longitud];
		arrOrdenado = new int[longitud];

		for (int i = 0; i < longitud; i++) {
			arrNoOrdenado[i] = rn.nextInt(20) + 1;
		}
		System.out.println("Areglo Desordenado: "
				+ Arrays.toString(arrNoOrdenado));

		while (opcionMenu != 3) {
			System.out
					.print("Ingrese el algoritmo a usar:\n[1] QuickSort\n[2] Bubble Sort\n[3] Busqueda Lineal\n[4] Busqueda Binaria\n[5] Salir\n");
			opcionMenu = entrada.nextInt();
			switch (opcionMenu) {
			case 1:
				QuickSort objAlgoritmoQuickSort = new QuickSort();
				objAlgoritmoQuickSort.sort(arrNoOrdenado);
				arrOrdenado = arrNoOrdenado;
				System.out
						.println("Areglo Ordenado por algoritmo 'Quicksort': "
								+ Arrays.toString(arrOrdenado));
				break;
			case 2:
				BubbleSort objAlgoritmoBubbleSort = new BubbleSort();
				objAlgoritmoBubbleSort.sort(arrNoOrdenado);
				System.out
						.println("Areglo Ordenado por algoritmo 'Bubble Sort': "
								+ Arrays.toString(arrNoOrdenado));
				break;
			case 3:
				System.out.print("Ingrese el elemento a buscar:");
				int datoBL = entrada.nextInt();
				int encontradoBL = -1;
				BusquedaLineal objAlgoritmoBusquedaLineal = new BusquedaLineal();				
				int opcionSubMenuBL = 0;				
				while (opcionSubMenuBL != 3) {
					System.out.print("Ingrese el algoritmo a usar:\n[1] Busqueda Lineal Tonta.\n[2] Busqueda Lineal Inteligente.\n[3] Salir\n");
					opcionSubMenuBL = entrada.nextInt();				
					switch (opcionSubMenuBL) {
					case 1:
						encontradoBL = objAlgoritmoBusquedaLineal.busquedaLinealTonta(arrNoOrdenado, datoBL);
						if (encontradoBL != -1)
							System.out.printf("El elemento %d fue encontrado en la posicion %d.\n",datoBL, encontradoBL);
						else
							System.out.printf("El elemento %d no se encuentra en el arreglo.\n", datoBL);
						break;
					case 2:
						encontradoBL = objAlgoritmoBusquedaLineal.busquedaLinealInteligente(arrNoOrdenado, datoBL);
						if (encontradoBL != -1)
							System.out.printf("El elemento %d fue encontrado en la posicion %d.\n",datoBL, encontradoBL);
						else
							System.out.printf("El elemento %d no se encuentra en el arreglo.\n", datoBL);
						break;
					case 3: 
						break;
					default:
						System.out.println("Opcion inválida.");
						break;
					}
				}
				continue;
			case 4:
				System.out.print("Ingrese el elemento a buscar:");
				int datoBB = entrada.nextInt();
				int encontradoBB = -1;
				BusquedaBinaria objAlgoritmoBusquedaBinaria = new BusquedaBinaria();
				int opcionSubMenuBB = 0;
				while (opcionSubMenuBB != 3) {
					System.out.print("Ingrese el algoritmo a usar:\n[1] Busqueda Binaria Iterativa.\n[2] Busqueda Binaria Recursiva.\n[3] Salir\n");
					opcionSubMenuBB = entrada.nextInt();
					System.out.print("Ordenamos el arreglo mediante el algoritmo Quicksort.");
					QuickSort objAlgoritmoQuickSortTemporal = new QuickSort();
					objAlgoritmoQuickSortTemporal.sort(arrNoOrdenado);
					switch (opcionSubMenuBB) {
					case 1:
						encontradoBB = objAlgoritmoBusquedaBinaria.busquedaBinariaIterativa(arrNoOrdenado, datoBB);
						if (encontradoBB != -1)
							System.out.printf("El elemento %d fue encontrado en la posicion %d.\n",datoBB, encontradoBB);
						else
							System.out.printf("El elemento %d no se encuentra en el arreglo.\n", datoBB);
						break;
					case 2:
						encontradoBL = objAlgoritmoBusquedaBinaria.busquedaBinariaRecursiva(arrNoOrdenado, 0, arrNoOrdenado.length, datoBB);
						if (encontradoBL != -1)
							System.out.printf("El elemento %d fue encontrado en la posicion %d.\n",datoBB, encontradoBB);
						else
							System.out.printf("El elemento %d no se encuentra en el arreglo.\n", datoBB);
						break;
					case 3:
						break;
					default:
						System.out.println("Opcion inválida.");
						break;
					}
				}
				continue;							
			case 5:	
				return;				
			default:
				System.out.println("Opcion inválida.");
				break;
			}
		}

	}

}
