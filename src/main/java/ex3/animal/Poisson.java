package ex3.animal;

public class Poisson extends Animal {
	
	public Poisson(String nom) {
		this.setNom(nom);
	}
	
	@Override
	public String toString() {
		return "Poisson : "+getNom();
	}

}
