package Lab3Package;

import java.util.ArrayList;

public class Compound {
    private int numAnimals;
    private String enclosure;
    private final ArrayList<Animal> animals;

    public Compound(){
        animals = new ArrayList<Animal>();
    }

    private void addAnimal(Animal animal) {
        this.animals.add(animal);
    }


}
