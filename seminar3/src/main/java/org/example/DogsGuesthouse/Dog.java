package org.example.DogsGuesthouse;
public class Dog implements Comparable<Dog> {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Dog dog) {
        if (name == null || dog.getName() == null) return 0;
        return name.compareTo(dog.getName());
    }
}
