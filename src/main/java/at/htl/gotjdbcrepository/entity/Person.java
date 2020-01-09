package at.htl.gotjdbcrepository.entity;

import java.util.Objects;

public class Person {

    private Long id;
    private String name;
    private String city;
    private String house;

    public Person() {
    }

    public Person(String name, String city, String house) {
        this.name = name;
        this.city = city;
        this.house = house;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!name.equals(person.name)) return false;
        if (!city.equals(person.city)) return false;
        return house.equals(person.house);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + house.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", name, city, house);
    }
}
