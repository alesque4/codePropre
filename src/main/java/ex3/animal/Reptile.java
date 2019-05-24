package ex3.animal;

public class Reptile extends Animal {
	
	public Reptile(String nom) {
		this.setNom(nom);
	}
	
	@Override
	public String toString() {
		return "Reptile : "+getNom();
	}

}
