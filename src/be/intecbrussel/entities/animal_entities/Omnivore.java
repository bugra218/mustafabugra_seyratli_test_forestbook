package be.intecbrussel.entities.animal_entities;

import be.intecbrussel.entities.plant_entities.Plant;

import java.util.HashSet;
import java.util.Set;

public class Omnivore extends Animal {
    private Set<Plant> plantDiet = new HashSet<>();
    private double maxFoodSize;

    public Omnivore(String name) {
        super(name);
    }

    public Omnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }
    public void addPlantToDiet(Plant addPlantDiet){
        plantDiet.add(addPlantDiet);

    }
    @Override
    public String toString(){
        return name +
                "Omnivore: " +
                "plantDiet=" + plantDiet +
                ", maxFoodSize=" + maxFoodSize +
                ", weight=" + weight +
                ", height=" + height +
                ", length=" + length;
    }
}
