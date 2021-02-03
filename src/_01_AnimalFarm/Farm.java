package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
public static void main(String[] args) {
	ArrayList<Animal> farm = new ArrayList<Animal>( );
	farm.add(new Cow("Ben"));
	farm.add(new Duck("Peep"));
	farm.add(new Pig("Pig"));
	farm.add(new Goat("Bob"));
	for(Animal animal: farm) {
		animal.makeNoise();
	}
}
}
