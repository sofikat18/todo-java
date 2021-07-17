
public class Perro extends Animal {

	String raza = "";
	String color = "";
	float peso = 0;
	
	public Perro(String nombre, int edad) {
		super(nombre, edad);
	}
	
	public String ladrar() {
		return "Guaf";
	}
	
	@Override
	public String comer() {
		return "Comer croquetas";
	}
}
