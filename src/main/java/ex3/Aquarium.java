package ex3;

import java.util.ArrayList;
import java.util.List;

import ex3.animal.Animal;
import ex3.animal.Poisson;

public class Aquarium extends Zone{

	private List<Poisson> poissons;
	
	public Aquarium() {
		poissons = new ArrayList<Poisson>();
	}
	
	public double calculerKgsNourritureParJour(){
		return poissons.size() * 0.2;
	}

	@Override
	public void addAnimal(Animal animal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compterAnimaux() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPoids() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void afficherListeAnimaux() {
		// TODO Auto-generated method stub
		
	}
}
