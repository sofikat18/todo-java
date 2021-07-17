import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * La colección Set no puede contener elementos duplicados
		 * Sólo tiene los métodos heredados de Collection
		 * Existen diferentes tipos de implementaciones
		 * 
		 * HashSet: Esta implementación almacena los elementos en una
		 * tabla hash. Es la que mejor rendimiento tiene.
		 * Los elementos no tienen un orden
		 * 
		 * LinkedHashSet - Respeta el orden de inserción 
		 * 
		 * TreeSet - orden alfabético
		 */
		
		/*
		Set<String> frutas = new LinkedHashSet();
		frutas.add("Mango");
		frutas.add("Manzana");
		frutas.add("Durazno");
		frutas.add("Cereza");
		frutas.add("Pera");
		frutas.add("Carambola");
		frutas.add("Mandarina");
		frutas.add("Maracuyá");
		frutas.add("Plátano");
		
		
		for(String fruta: frutas) {
			System.out.println(fruta);
		}
		*/
		
		//System.out.println(frutas.contains("Mango"));
		
		
		/*
		 * La interfaz List 
		 * Rango de operación: permite realizar ciertas operaciones sobre ragos 
		 * de elementos dentro de la propia lista.
		 * Acceso posicional a elementos: manipula elementos en función de su 
		 * posición en la lista.
		 * Búsqueda de elementos: busca un elemento concreto de la lista y 
		 * devuelve su posición.
		 */
		
		List<String> frutas2 = new ArrayList<String>();
		frutas2.add("Mango");
		frutas2.add("Manzana");
		frutas2.add("Durazno");
		frutas2.add("Cereza");
		frutas2.add("Pera");
		frutas2.add("Carambola");
		frutas2.add("Mandarina");
		frutas2.add("Maracuyá");
		frutas2.add("Plátano");
		
		for(String f: frutas2) {
			System.out.println(f);
		}
		
		int pera = frutas2.indexOf("Pera");
		System.out.println(pera);
		System.out.println(frutas2.get(pera));
		
		/* 
		 *  int dato primitivo
		 *  Integer es un objeto
		 */
		
		List <Integer> agenda = new ArrayList <Integer>();
		agenda.add(123);
		agenda.add(456);
		agenda.add(789);
		
		for(Integer a: agenda) {
			System.out.println(a);;
		}
		
		//LinkedList
		
		List<String> animales = new ArrayList <String>();
		animales.add("Perro");
		animales.add("Gato");
		animales.add("Conejo");
		animales.add("Tortuga");
		animales.add("Oso");
		animales.add("Quetzal");
			
		for(String an: animales) {
			System.out.println(an);
		}
		
		/*
		 * La interfaz Map asocia claves a valores.
		 * No puede contener claves duplicadas y cada clave
		 * solo puede tener un valor asociado
		 * 
		 * Implementaciones
		 * HashMap
		 * TreeMap
		 * LinkedHashMap
		 * 
		 */
		
		Map<String, String> diccionario = new HashMap<>();
		diccionario.put("elemento1", "Ana Sofia");
		diccionario.put("elemento2", "Luis Ernesto");
		
		for (Map.Entry<String, String> entry : diccionario.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		System.out.println(diccionario.get("elemento1"));
	
		/*
		 * Implementación TreeMap
		 */
		
		Map<String, String> diccionario2 = new TreeMap<>();
		diccionario2.put("elemento1", "Ana Sofia");
		diccionario2.put("elemento2", "Luis Ernesto");
		
		for (Map.Entry<String, String> entry : diccionario2.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		System.out.println("Implementación TreeMap");
		System.out.println(diccionario2.get("elemento1"));
		
		/*
		 * Implementación LinkedHashMap
		 */
		
		Map<String, String> diccionario3 = new LinkedHashMap<>();
		diccionario2.put("elemento1", "Ana Sofia");
		diccionario2.put("elemento2", "Luis Ernesto");
		
		for (Map.Entry<String, String> entry : diccionario3.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		System.out.println("Implementación TreeMap");
		System.out.println(diccionario3.get("elemento1"));
	
		
		
	}

}
