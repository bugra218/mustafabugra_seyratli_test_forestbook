package be.intecbrussel.entities.animal_entities;

import be.intecbrussel.entities.plant_entities.Plant;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Herbivore extends Animal {
    private Set<Plant> plantDiet = new HashSet<>();

    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }
    public void addPlantToDiet(Plant addPlantDiet){
        this.plantDiet.add(addPlantDiet);
    }
    public void printDiet(){
        System.out.println("The diet of animal: ");
        Stream.of(plantDiet).forEach(s -> System.out.print(s + " "));
        System.out.println();

    }
    @Override
    public String toString(){
        return name +
                "Herbivore: " +
                "plantDiet=" + plantDiet +
                ", weight=" + weight +
                ", height=" + height +
                ", length=" + length;
    }
}
