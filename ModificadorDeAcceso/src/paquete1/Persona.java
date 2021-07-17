package paquete1;

public class Persona {
	
	//Modificador de acceso default, se puede acceder a los atributos
	//y objetos dentro del mismo paquete
	String nombre = "";
	//Modificador de acceso privado, se puede acceder solo dentro de la
	//misma clase
	private int edad = 29;
	//Modificador protected, se puede acceder dentro de la misma clase
	//y del mismo paquete
	protected String domicilio = "Puerta del sol 123";
	//Modificador de acceso público se puede acceder desde la misma clase,
	//y otros paquetes
	public float estatura = 0;
	
	String saludar() {
		return "Hola, mi nombre es " + this.nombre + " mi edad es " + this.edad;
	}

}
