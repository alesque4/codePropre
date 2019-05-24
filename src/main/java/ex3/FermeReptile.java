package ex3;

import java.util.ArrayList;

import ex3.animal.Animal;
import ex3.animal.Reptile;

/** ReprÃ©sente une ferme de reptile
 * @author DIGINAMIC
 */
public class FermeReptile extends Zone<Reptile> {

	/** Masse moyenne en kg de nourriture consommée par 1 reptile */
	private static final double MASSE_NOURRITURE = 0.1;
	
	public FermeReptile(String nom) {
		this.nom = nom;
		animaux = new ArrayList<Reptile>();
	}

	@Override
	public double getPoids() {
		return MASSE_NOURRITURE;
	}

	@Override
	public void addAnimal(Animal animal) {
		if(animal != null && animal instanceof Reptile) {
			animaux.add((Reptile) animal);
		}
	}

}
