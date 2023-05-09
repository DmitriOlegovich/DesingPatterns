package org.example;
public class PersonBuilder {
    private String name;
    private String surname;
    private int age = -1;
    private String Address;




    public String getName() {
        return name;
    }


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }


    public String getSurname() {
        return surname;
    }


    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }


    public int getAge() {
        return age;
    }


    public PersonBuilder setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException(
                    "Возраст должен быть от 0 до 100, а у вас: " + age
            );
        }
        this.age = age;
        return this;
    }


    public String getAddress() {
        return Address;
    }


    public PersonBuilder setAddress(String Address) {
        this.Address = Address;
        return this;
    }


    public Person build() {
        if (name == null) {
            throw new IllegalStateException(
                    "Имя является обязательным полем, а вы его не заполнили"
            );
        }
        if (surname == null) {
            throw new IllegalStateException(
                    "Фамилия является обязательным полем, а вы его не заполнили"
            );
        }
        Person person;
        if (age == -1) {
            person = new Person(name, surname);
        } else {
            person = new Person(name, surname, age);
        }


        if (Address != null) {
            person.setAddress(Address);
        }
        return person;
    }


}
