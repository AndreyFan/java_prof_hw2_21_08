package de.telran.lesson_2.hw_2_21_08;

public class Cat extends Pet{
    String abilityToCatchMice; // умение ловить мышей

    public Cat(String name, String animalSpecies, int age, String breed, String abilityToCatchMice) {
        super(name, animalSpecies, age, breed);
        this.abilityToCatchMice = abilityToCatchMice;
    }

    public void play(){
        System.out.println("Кошка по кличке "+name+" которая  "+ abilityToCatchMice+ "  любит играть с детьми");
    }

}
