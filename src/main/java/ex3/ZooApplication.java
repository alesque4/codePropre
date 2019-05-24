package ex3;

import ex3.animal.MammifereCarnivore;
import ex3.animal.MammifereHerbivore;
import ex3.animal.Poisson;
import ex3.animal.Reptile;

public class ZooApplication {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo("Thoiry");
		
		//Remplissage du zoo
		zoo.addAnimal(new Reptile("Croco1"));
		zoo.addAnimal(new Reptile("Croco2"));
		zoo.addAnimal(new Reptile("Croco3"));
		zoo.addAnimal(new Poisson("Bar"));
		zoo.addAnimal(new Poisson("Thon"));
		zoo.addAnimal(new MammifereHerbivore("Giraffe1"));
		zoo.addAnimal(new MammifereHerbivore("Giraffe2"));
		zoo.addAnimal(new MammifereHerbivore("Giraffe3"));
		zoo.addAnimal(new MammifereCarnivore("Lion1"));
		zoo.addAnimal(new MammifereCarnivore("Lion2"));
		
		//affichage
		zoo.afficherListeAnimaux();
	}

}
