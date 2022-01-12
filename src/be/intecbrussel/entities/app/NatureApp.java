package be.intecbrussel.entities.app;


import be.intecbrussel.entities.animal_entities.Carnivore;
import be.intecbrussel.entities.animal_entities.Herbivore;
import be.intecbrussel.entities.animal_entities.Omnivore;
import be.intecbrussel.entities.plant_entities.*;
import be.intecbrussel.services.ForestNotebook;

import java.util.HashSet;
import java.util.Set;

public class NatureApp {
    public static void main(String[] args) {
        ForestNotebook forestNotebook = new ForestNotebook();
        Flower camomile = new Flower("Camomile");
        camomile.setSmell(Scent.SWEET);
        camomile.setHeight(12);
        forestNotebook.addPlant(camomile);
        Bush redSprite = new Bush("Red Sprite");
        redSprite.setFruit("Berries");
        redSprite.setLeafType(LeafType.SPEAR);
        forestNotebook.addPlant(redSprite);
        Tree pearTree = new Tree("Pear Tree");
        pearTree.setLeafType(LeafType.ROUND);
        forestNotebook.addPlant(pearTree);
        Weed purslane = new Weed("Purslane");
        purslane.setArea(25);
        forestNotebook.addPlant(purslane);
        Tree redMaple = new Tree("Red Maple");
        redMaple.setLeafType(LeafType.ROUND);
        forestNotebook.addPlant(redMaple);

        Set<Plant> herbivoreDiet = new HashSet<>();
        Set<Plant> omnivoreDiet = new HashSet<>();
        herbivoreDiet.add(redSprite);
        herbivoreDiet.add(camomile);
        omnivoreDiet.add(redSprite);
        omnivoreDiet.add(camomile);

        Herbivore goat = new Herbivore("Goat",30,41, 24);
        goat.setPlantDiet(herbivoreDiet);
        goat.addPlantToDiet(purslane);
        forestNotebook.addAnimal(goat);
        Carnivore lion = new Carnivore("Lion",130,120,200);
        lion.setMaxFoodSize(120);
        forestNotebook.addAnimal(lion);
        Omnivore bear = new Omnivore("Bear",450,150,280);
        bear.addPlantToDiet(redSprite);
        bear.setMaxFoodSize(130);
        bear.setPlantDiet(omnivoreDiet);
        forestNotebook.addAnimal(bear);
        Herbivore deer = new Herbivore("Deer",100,100, 124);
        deer.setPlantDiet(herbivoreDiet);
        deer.addPlantToDiet(purslane);
        forestNotebook.addAnimal(deer);
        Herbivore duck  = new Herbivore("Duck",10,5, 7);
        duck.setPlantDiet(herbivoreDiet);
        duck.addPlantToDiet(purslane);
        forestNotebook.addAnimal(duck);
        Herbivore elephant = new Herbivore("Elephant",1500,200, 250);
        elephant.setPlantDiet(herbivoreDiet);
        elephant.addPlantToDiet(purslane);
        forestNotebook.addAnimal(elephant);
        Herbivore cow = new Herbivore("Cow",200,250, 300);
        cow.setPlantDiet(herbivoreDiet);
        cow.addPlantToDiet(purslane);
        forestNotebook.addAnimal(cow);
        Herbivore camel = new Herbivore("Camel",180,200, 220);
        camel.setPlantDiet(herbivoreDiet);
        camel.addPlantToDiet(purslane);
        forestNotebook.addAnimal(camel);
        Herbivore horse = new Herbivore("Horse",150,170, 190);
        horse.setPlantDiet(herbivoreDiet);
        horse.addPlantToDiet(purslane);
        forestNotebook.addAnimal(horse);

        forestNotebook.printNotebook();

        forestNotebook.sortAnimalsByName();
        forestNotebook.sortPlantsByName();
        forestNotebook.printNotebook();

        forestNotebook.sortAnimalsByHeight();
        forestNotebook.sortPlantsByHeight();
        forestNotebook.printNotebook();












    }
}
