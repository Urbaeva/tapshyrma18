package com.company;
public class Main {
    public static void main(String[] args) {
        Person student1 = new Person("Burulai");
        Person student2 = new Person("Nurkyz");
        Person student3 = new Person("Zhazgul");
        Person student4 = new Person("Bermet");
        Person student5 = new Person("Aydana");
        Person person1 = new Person("Aymeerim");
        Person person2 = new Person("Ziregul");
        Person person3 = new Person("Azida");
        Person person4 = new Person("Sude");
        Person person5 = new Person("Esra");
        Person person6 = new Person("Adida");
        Person person7 = new Person("Aydanek");
        Person person8 = new Person("Tynchtykbek");
        Person person9 = new Person("Orozali");
        Person person10 = new Person("Anas");

        Person[] family1 = {student1, student2, student3, student4, student5};
        Person[] family2 = {person1, person2, person3, person4, person5};
        Person[] family3 = {person6, person7, person8, person9, person10};

        Hostel hostel = new Hostel(family1);
        Apartment apartment = new Apartment(family2);
        Hotel hotel = new Hotel(family3);

        hostel.getFamily();
        hostel.pay();

        apartment.getFamily();
        apartment.pay();

        hotel.getFamily();
        hotel.pay();
    }
}
