package ex3.animal;

public class MammifereCarnivore extends Animal {
	
	public MammifereCarnivore(String nom) {
		this.setNom(nom);
	}

	@Override
	public String toString() {
		return "Carnivore : "+getNom();
	}
}
