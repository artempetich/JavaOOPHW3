package org.example.HW.CatsGuesthouse.HedgehogsGuesthouse;
public class Hedgehog implements Comparable<Hedgehog> {
    private String name;
    private Integer age;

    public Hedgehog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Hedgehog hedgehog) {
        return age.compareTo(hedgehog.getAge());
    }
}
