package ex3;

import java.util.ArrayList;

import ex3.animal.Animal;
import ex3.animal.Poisson;

public class Aquarium extends Zone<Poisson>{

	/** Masse moyenne en kg de nourriture consommée par 1 poisson */
	private static final double MASSE_NOURRITURE = 0.2;
	
	public Aquarium(String nom) {
		this.nom = nom;
		animaux = new ArrayList<Poisson>();
	}
	
	

	@Override
	public double getPoids() {
		return MASSE_NOURRITURE;
	}

	@Override
	public void addAnimal(Animal animal)  {
		if(animal != null && animal instanceof Poisson) {
			animaux.add((Poisson) animal);
		}
	}
}
