package ex3;

import java.util.List;

import ex3.animal.Animal;

public abstract class Zone<T extends Animal> {

	private List<T> animaux;
	
	
	/**
	 * Ajoute un animal dans la zone
	 * @param animal l'animal à ajouter
	 */
	public abstract void addAnimal(T animal);
	
	/**
	 * Affiche la liste des animaux
	 */
	public abstract void afficherListeAnimaux();
	
	
	/**
	 * Compte les animaux de cette zone
	 * @return int le nombre d'animaux
	 */
	public abstract int compterAnimaux();
	
	/**
	 * 
	 * @return
	 */
	public abstract double getPoids();
	
	/**
	 * Calcule la nourriture par jour nécessaire pour cette zone
	 * @return la somme
	 */
	public abstract double calculerKgsNourritureParJour();
}
