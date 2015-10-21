package app;

public class BusquedaLineal {

	public BusquedaLineal(){
	}
	
	public int busquedaLineal(int arreglo[], int dato){				
		int posicion = -1;
		
		for (int i = 0; i <= arreglo.length; i++) {
			if (arreglo[i] == dato) {
				posicion = i;
			}
		}
		return posicion;
	}	
}
