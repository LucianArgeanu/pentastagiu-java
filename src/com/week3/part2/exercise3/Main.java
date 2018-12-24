package com.week3.part2.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       Character human = new Human("Human",50,20,5,3);
       Character monster = new Monster("Monster",50,20,10,8);
       Character animal = new Animal("Animal",50,20,5,5);

       Artifact healthArtifact = new HealthArtifact(5,10);
       Artifact energyArtifact = new EnergyArtifact(6,5);

       List<Character> myList = new ArrayList<>();
       myList.add(human);
       myList.add(monster);
       myList.add(animal);

       //get position for all the characters
//       ((Human) human).getPosition();
//       ((Monster) monster).getPosition();
//       ((Animal) animal).getPosition();

        //checking attacks for human and monster
//        ((Human) human).attack(animal);
//        ((Monster) monster).attack(animal);

        //checking attack range
//        ((Human) human).attack(monster);
//        monster.setPositionY(9);
//        ((Human) human).attack(monster);

        //checking energy artifact
//        human.setEnergyPoints(0);
//        ((Human) human).attack(animal);
//        ((Human) human).getArtifact(energyArtifact);
//        ((Human) human).attack(animal);

        //checking health artifact
//        animal.setHealthPoints(5);
//        ((Animal) animal).getArtifact(healthArtifact);

        //checking if a character has died
//        human.setHealthPoints(15);
//        ((Monster) monster).attack(human);

        //Scenario from homework
        ((Human) human).attack(animal);
        ((Monster) monster).attack(human);
        ((Human) human).attack(monster);
        ((Human) human).getArtifact(energyArtifact);
        animal.setHealthPoints(15);
        ((Monster) monster).attack(animal);
        ((Human) human).getArtifact(healthArtifact);
        System.out.println("Character info:\n");

        for(Character list: myList){
            list.getInfo();
        }
    }
}
