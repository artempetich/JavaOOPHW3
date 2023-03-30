package org.example.DogsGuesthouse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Dog> ourDogs = new ArrayList<>(Arrays.asList(
                new Dog("Дайкон"),
                new Dog("Артек"),
                new Dog("Волк"),
                new Dog("Бобер"),
                new Dog("Грозный")));

        Collections.sort(ourDogs);
        for (Dog dog : ourDogs) {
            System.out.println(dog.getName());
        }

    }
}