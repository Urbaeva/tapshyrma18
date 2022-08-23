package com.company;

public class Hotel implements Pay{
    private Person[] family;

    public Hotel(Person[] family){
        this.family = family;
    }

    @Override
    public void pay() {
        System.out.println("Мейманканада жашагандар аренда толошот");
    }

    public Person[] getFamily() {
        System.out.println("Мейманканада жашагандар: ");
        for (Person p: family) {
            p.getName();
        }
        return family;
    }
}
