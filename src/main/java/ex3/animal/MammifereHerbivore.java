package ex3.animal;

public class MammifereHerbivore extends Animal {

	public MammifereHerbivore(String nom) {
		this.setNom(nom);
	}
	
	@Override
	public String toString() {
		return "Herbivore : "+getNom();
	}
	
}
