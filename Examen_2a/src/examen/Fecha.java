package examen;
/**
 * La clase Fecha gestiona la información de una fecha y valida su formato
 * @author Félix Lamana
 * 
 * @version 1.0
 *
 */
public class Fecha {
	/**
	 * El campo fechaValida es un booleano que almacena la validez del formato de la fecha
	 */
	public static boolean fechaValida;
/**
 * Método por el cual se analiza el formato de la fecha y devuelve si cumple el estándar
 * @param anio Entero que representa el año de la fecha
 * @param mes Entero que representa el mes de la fecha
 * @param dia Entero que representa el dia de la fecha
 * @return Booleano que indica si el formato de la fecha es válido
 */
	public static boolean validarFecha(int anio, int mes, int dia) {
		fechaValida = false;
		// Evalúo que los valores introducidos son mayores que cero
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}
}