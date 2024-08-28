package de.telran.lesson_2.hw_2_21_08;

public class Dog extends Pet{
    String abilityToBringSlippers;

    public Dog(String name, String animalSpecies, int age, String breed, String abilityToBringSlippers) {
        super(name, animalSpecies, age, breed);
        this.abilityToBringSlippers = abilityToBringSlippers;
    }

    public void swim(){
        System.out.println("Пёс по кличке "+name+" который "+ abilityToBringSlippers+ "  любит плавать");
    }
}
