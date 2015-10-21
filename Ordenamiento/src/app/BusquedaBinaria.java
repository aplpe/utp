package app;

public class BusquedaBinaria {

	public int busquedaBinariaIterativa(int arreglo[], int dato) {
		int izq = 0;
		int der = arreglo.length - 1;
		int centro = (izq + der)/2;
		
		while ((izq < der) && (arreglo[centro]!=dato)) {
			if (dato < arreglo[centro]) 
				der = centro - 1;
			else
				izq = centro + 1;			
		}
		if (izq < der)
			return -1;
		else
			return centro;			
	}
	
	public int busquedaBinariaRecursiva(int arreglo[], int izq, int der, int dato){
		int centro = (izq + der) / 2;
		
		if (izq > der)
			return -1;
		else if (dato == arreglo[centro])
			return centro;
		else if (dato < arreglo[centro])
			return busquedaBinariaRecursiva(arreglo, izq, centro - 1, dato);
		else
			return busquedaBinariaRecursiva(arreglo, centro + 1, der, dato);		
	}
}
