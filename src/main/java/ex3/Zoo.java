package ex3;

import java.util.ArrayList;
import java.util.List;

import ex3.animal.*;

/**
 * @author DIGINAMIC
 */
public class Zoo {

	private String nom;
	@SuppressWarnings("rawtypes")
	private List<Zone> sections;
	
	@SuppressWarnings("rawtypes")
	public Zoo(String nom){
		this.nom = nom;
		sections = new ArrayList<Zone>();
		sections.add(new SavaneAfricaine("Savane"));
		sections.add(new ZoneCarnivore("Enclos carnivores"));
		sections.add(new FermeReptile("Ferme des reptiles"));
		sections.add(new Aquarium("Aquarium"));
	}
	
	public void addAnimal(Animal animal){
		sections.stream().forEach(zone -> zone.addAnimal(animal));
	}
	
	public void afficherListeAnimaux(){
		sections.stream().forEach(zone -> zone.afficherListeAnimaux());
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
