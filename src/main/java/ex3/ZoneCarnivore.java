package ex3;

import java.util.ArrayList;

import ex3.animal.Animal;
import ex3.animal.MammifereCarnivore;

public class ZoneCarnivore extends Zone<MammifereCarnivore>{

	/** Masse moyenne en kg de nourriture consommée par 1 carnivore */
	private static final double MASSE_NOURRITURE = 10;
	
	public ZoneCarnivore(String nom) {
		this.nom = nom;
		animaux = new ArrayList<MammifereCarnivore>();
	}
	
	@Override
	public double getPoids() {
		return MASSE_NOURRITURE;
	}

	@Override
	public void addAnimal(Animal animal) {
		if(animal != null && animal instanceof MammifereCarnivore) {
			animaux.add((MammifereCarnivore) animal);
		}
	}

	
}
