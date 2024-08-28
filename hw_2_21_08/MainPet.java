package de.telran.lesson_2.hw_2_21_08;

public class MainPet {
    public static void main(String[] args) {
        Cat cat1=new Cat("Мурка", "кошка", 3, "Мейн-кун", "умеет ловить мышей");
        cat1.eat();
        cat1.drink();
        cat1.play();

        Dog dog1= new Dog("Байкал","Пёс",5, "лабрадор", "умеет приносить тапки");
        dog1.eat();
        dog1.drink();
        dog1.swim();
    }
}
