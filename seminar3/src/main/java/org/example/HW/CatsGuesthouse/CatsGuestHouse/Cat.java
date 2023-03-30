package org.example.HW.CatsGuesthouse.CatsGuestHouse;
import java.util.Objects;

public class Cat implements Comparable<Cat> {
    private String name;
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Cat cat) {
        if (Objects.equals(age, cat.getAge())) return 0;
        if (age > cat.getAge()) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}
