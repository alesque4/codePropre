package ex3;

import java.util.List;

import ex3.animal.Animal;

public abstract class Zone<T extends Animal> {

	protected String nom;
	protected List<T> animaux;
	
	/**
	 * Ajoute un animal dans la zone
	 * @param animal l'animal à ajouter
	 */
	public abstract void addAnimal(Animal animal);
	
	/**
	 * Affiche la liste des animaux
	 */
	public void afficherListeAnimaux() {
		System.out.println("-"+nom+" :");
		this.animaux.stream().forEach(a -> System.out.println(a));
	}
	
	/**
	 * Compte les animaux de cette zone
	 * @return int le nombre d'animaux
	 */
	public int compterAnimaux() {
		return animaux.size();
	}
	
	/**
	 * Donne le poids moyen journalier de nourriture pour un animal
	 * @return
	 */
	public abstract double getPoids();
	
	/**
	 * Calcule la nourriture par jour nécessaire pour cette zone
	 * @return la somme
	 */
	public double calculerKgsNourritureParJour() {
		return getPoids()*compterAnimaux();
	}
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
