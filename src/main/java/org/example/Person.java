package org.example;

import java.util.OptionalInt;


public class Person {
    private final String name;
    private final String surname;
    private int age;
    private String Address;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = -1;
    }


    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    public String getName(){
        return name;
    }


    public String getSurname(){
        return surname;
    }


    public PersonBuilder newChildBuilder() { //метод создания ребенка
        PersonBuilder child = new PersonBuilder();


        return child
                .setSurname(this.surname); //передаем ребенку фамилию родителя
    }


    public OptionalInt getAge(){
        return hasAge() ? OptionalInt.of(age) : OptionalInt.empty();
    }


    public boolean hasAge(){
        return age != -1;
    }


    public String getAddress(){
        return Address;
    }


    public void setAddress(String Address) {
        this.Address = Address;
    }
}
