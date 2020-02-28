package paqueteEvaluacion;

import paqueteEvaluacion.Util;

/**
 * Clase ejecutable que mostrara al usuario el arreglo con precios de los
 * objetos del arreglo electrodomesticos.
 * 
 * @author josuequiriban
 *
 */
public class Ejecutable {

	/**
	 * Constructor por defecto de ejecutable.
	 */
	public Ejecutable() {
		// TODO Apéndice de constructor generado automáticamente
	}

	/**
	 * Metodo principal de la clase Ejecutable.
	 * 
	 * @param args argumentos.
	 */
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		/**
		 * Arreglo de electrodomesticos el cual incluye objetos de tipo Televisor,
		 * Electrodomestico y Lavadora.
		 */
		Electrodomestico electrodomesticos[] = new Electrodomestico[10];
		electrodomesticos[0] = new Televisor(50, false, 100000, 6, "blanco", 'A');
		electrodomesticos[1] = new Electrodomestico(100000, 50, "gris", 'L');
		electrodomesticos[2] = new Televisor(25, true, 100000, 3, "verde", 'D');
		electrodomesticos[3] = new Lavadora(35, 100000, 8, "blanco", 'A');
		electrodomesticos[4] = new Electrodomestico(100000, 5, "amarillo", 'C');
		electrodomesticos[5] = new Televisor(65, true, 100000, 8, "negro", 'A');
		electrodomesticos[6] = new Lavadora(8, 100000, 4, "azul", 'F');
		electrodomesticos[7] = new Electrodomestico(100000, 2, "rojo", 'B');
		electrodomesticos[8] = new Televisor(70, true, 100000, 4, "negro", 'A');
		electrodomesticos[9] = new Electrodomestico(100000, 244, "cafe", 'F');

		/**
		 
		 */
		
		/**
		 * Es el metodo que recorre el arreglo buscando por medio de instanceof todos
		 * los objetos de tipo Lavadora, Televisor y electrodomesticos ademas de
		 * verificar los valores totales de cada tipo de objeto.
		 * @param precioTotal          Es el valor total del objeto.
		 * @param precioTotalLavadora  Es el valor total de todas las lavadoras.
		 * @param precioTotalTelevisor Es el valor total de todos los Televisores.
		 */
		float precioTotal = 0;
		float precioTotalLavadora = 0;
		float precioTotalTelevisor = 0;

		for (int i = 0; i < electrodomesticos.length; i++) {
			precioTotal += electrodomesticos[i].precioFinal(precioTotalTelevisor, precioTotalLavadora);
			if (electrodomesticos[i] instanceof Lavadora) {
				float peso = ((Lavadora)electrodomesticos[i]).getPeso();
				float precio = ((Lavadora)electrodomesticos[i]).getPrecioBase();
				precioTotalLavadora += ((Lavadora)electrodomesticos[i]).precioFinal(peso, precio);
			} else {
				if (electrodomesticos[i] instanceof Televisor) {
					float precio = ((Televisor)electrodomesticos[i]).getPrecioBase();
					float peso = ((Televisor)electrodomesticos[i]).getPeso();
					precioTotalTelevisor += ((Televisor)electrodomesticos[i]).precioFinal(peso, precio);

				}
			}
		}

		/**
		 * Metodo que muestra al usuario el valor total de Televisores, Lavadoras y
		 * Electrodomesticos.
		 */
		Util.escribir("El precio total de todos los televisores es: $" + (int) precioTotalTelevisor);
		Util.escribir("El precio total de todas las lavadoras es: $" + (int) precioTotalLavadora);
		Util.escribir("El precio total por todos los electrodomesticos" + " es de: $" + (int) precioTotal);
	}

}
