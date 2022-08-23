package com.company;

public class Hostel implements Pay{
    private Person[] family;

    public Hostel(Person[] family){
        this.family = family;
    }

    @Override
    public void pay() {
        System.out.println("Жатаканада жашагандар аренда толошот");
    }

    public Person[] getFamily() {
        System.out.println("Жатаканада жашагандар: ");
        for (Person p: family) {
            p.getName();
        }
        return family;
    }
}
