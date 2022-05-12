package Pruebas;

import java.util.*;
public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Animal> Animales = new ArrayList<Animal>(); 
		Iterator < Animal > it = Animales.iterator();
		
		Animal tigrecito = new Tigre("Pepe",5,"Sabana", "Carnivoro", "Mamifero",11,"Albino");
		Animal jirafita = new Jirafa("Juan",5,"Sabana","Herbivoro","Mamifero","Naranja con manchas",7);
		Animales.add(jirafita);
		Animales.add(tigrecito);
		
		
		for(Animal x:Animales) {
			System.out.println(x);
		}
		
		System.out.println("----- Metodos ----");
		//Aqui comen
		jirafita.Come();
		tigrecito.Come();
		//Aqui vuelven a comer
		jirafita.Come();
		tigrecito.Come();
		
		
	}

}
