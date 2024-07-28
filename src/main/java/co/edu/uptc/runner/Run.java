package co.edu.uptc.runner;

import java.sql.DriverManager;
import co.edu.uptc.controller.Control;

/*Autor:Daniel Malaver 
 * Fecha: 28-07-2024
 * Tematica: Proyecto de Conexion y operaciones SQL usando Java y SQL SERVER
 */

public class Run {

	public static void main(String[]args) {
	    Control control = new Control();
	    control.init();
	}
}
