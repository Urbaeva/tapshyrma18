package com.company;

public class Apartment implements Pay{
    private Person[] family;

    public Apartment(Person[] family){
        this.family = family;
    }

    public Person[] getFamily() {
        System.out.println("Квартирада жашагандар: ");
        for (Person p: family) {
            p.getName();
        }
        return family;
    }

    @Override
    public void pay() {
        System.out.println("Квартирада жашагандар ком.услуга толошот");
    }
}
