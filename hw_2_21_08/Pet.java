package de.telran.lesson_2.hw_2_21_08;

public class Pet {
    String name;
    String animalSpecies;
    int age;
    String breed; // порода

    public Pet(String name, String animalSpecies, int age, String breed) {
        this.name = name;
        this.animalSpecies = animalSpecies;
        this.age = age;
        this.breed = breed;
    }

    public void eat(){
        System.out.println(animalSpecies +" " +name+" породы  "+breed+ " ест " );
    }

    public void drink(){
        System.out.println(animalSpecies+" " +name+" породы  "+breed+ " пьёт " );
    }
}
