
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Animal animal = new Animal();
		//System.out.println(animal.comer());
		
		Perro canelo = new Perro("Canelo", 3);
		System.out.println(canelo.ladrar());
		System.out.println(canelo.comer());
		System.out.println(canelo.nombre);
		
		Gato pulgas = new Gato("Bigotes", 2, "naranja");
		System.out.println(pulgas.comer());
		System.out.println(pulgas.nombre);

	}

}
