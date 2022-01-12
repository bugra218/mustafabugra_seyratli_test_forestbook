package be.intecbrussel.services;

import be.intecbrussel.entities.animal_entities.Animal;
import be.intecbrussel.entities.animal_entities.Carnivore;
import be.intecbrussel.entities.animal_entities.Herbivore;
import be.intecbrussel.entities.animal_entities.Omnivore;
import be.intecbrussel.entities.plant_entities.Plant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ForestNotebook {
    private List<Carnivore> carnivores = new ArrayList<>();
    private List<Omnivore> omnivores = new ArrayList<>();
    private List<Herbivore> herbivores = new ArrayList<>();
    private int plantCount=0;
    private int animalCount=0;
    private List<Animal> animals = new ArrayList<>();
    private List<Plant> plants = new ArrayList<>();

    public ForestNotebook(){

    }

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {
        return plantCount;
    }

    public int getAnimalCount() {
        return animalCount;
    }
    public void addAnimal(Animal addAnimal){
        if (!animals.contains(addAnimal)) {
            animals.add(addAnimal);
            animalCount++;
            differentAnimals(addAnimal);
        } else {
            System.out.println("Your animal is already in the collection!");
        }

    }
    private void differentAnimals(Animal animal){
        if (animal instanceof Omnivore) omnivores.add((Omnivore) animal);
        if (animal instanceof Carnivore) carnivores.add((Carnivore) animal);
        if (animal instanceof Herbivore) herbivores.add((Herbivore) animal);
    }
    public void addPlant(Plant addPlant){
        if (!plants.contains(addPlant)) {
            plants.add(addPlant);
            plantCount++;
        } else {
            System.out.println("Your plant is already in the collection!");
        }

    }
    public void printNotebook(){
        System.out.println("You saw this animals in the forest: ");
        if ((plantCount > 1)) {
            System.out.println(plantCount + " different kind of plants:");
        } else if (plantCount == 1) {
            System.out.println("1 plant: ");
        }
        plants.stream().map(a -> a.getName() + ", ").forEach(System.out::print);
        System.out.println();
        if (animalCount > 1) {
            if (plantCount > 0) System.out.print("And ");
            System.out.println(animalCount + " different animals: ");
            System.out.print(herbivores.size() + " Herbivore(s): ");
            herbivores.stream().map(a -> a.getName() + ", ").forEach(System.out::print);
            System.out.print("\n" + carnivores.size() + " Carnivore(s): ");
            carnivores.stream().map(a -> a.getName() + ", ").forEach(System.out::print);
            System.out.print("\n" + omnivores.size() + " Omnivore(s): ");
            omnivores.stream().map(a -> a.getName() + ", ").forEach(System.out::print);
            System.out.println();
        }
        if (animalCount == 1) {
            if (plantCount > 0) System.out.print("And 1 animal:\n");
            System.out.println(animals.get(0).getName());
        }
    }
    public void sortAnimalsByName(){
        animals = animals.stream().sorted(Comparator.comparing(Animal::getName)).collect(Collectors.toList());
        herbivores = herbivores.stream().sorted(Comparator.comparing(Animal::getName)).collect(Collectors.toList());
        carnivores = carnivores.stream().sorted(Comparator.comparing(Animal::getName)).collect(Collectors.toList());
        omnivores = omnivores.stream().sorted(Comparator.comparing(Animal::getName)).collect(Collectors.toList());
    }
    public void sortPlantsByName(){
        plants = plants.stream().sorted(Comparator.comparing(Plant::getName)).collect(Collectors.toList());

    }
    public void sortAnimalsByHeight(){
        animals.sort(Comparator.comparing(Animal::getHeight));
    }

    public void sortPlantsByHeight(){
        plants.sort(Comparator.comparing(Plant::getHeight));
    }


}
