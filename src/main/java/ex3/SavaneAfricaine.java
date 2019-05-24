package ex3;

import java.util.ArrayList;

import ex3.animal.Animal;
import ex3.animal.MammifereHerbivore;

public class SavaneAfricaine extends Zone<MammifereHerbivore> {

	/** Masse moyenne en kg de nourriture consommée par 1 herbivore */
	private static final double MASSE_NOURRITURE = 0;
	
	public SavaneAfricaine(String nom) {
		this.nom = nom;
		animaux = new ArrayList<MammifereHerbivore>();
	}
	
	@Override
	public double getPoids() {
		return MASSE_NOURRITURE;
	}

	@Override
	public void addAnimal(Animal animal) {
		if(animal != null && animal instanceof MammifereHerbivore) {
			animaux.add((MammifereHerbivore) animal);
		}
	}

	

}
