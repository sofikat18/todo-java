
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hola Mundo");
		
		Persona ana = new Persona();
		ana.name = "Ana Sofía";
		ana.age = 29;
		System.out.println(ana.saludar());
		System.out.println(ana.miEdad());
		
	}

}
