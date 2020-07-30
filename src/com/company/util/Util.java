package com.company.util;

import com.company.person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Util {
    static Scanner scanner = new Scanner(System.in);
    static List<Person> listOfPersons = new ArrayList<>();

    //Creates a list of peoples with their details
    public List<Person> createPersons() {

        Person person1 = new Person("Mehtab Kayani", "Stockholmsvägen 25", "0735865680", "001122", "19890711");
        Person person2 = new Person("Kalle Andersson", "Stockholmsvägen 26", "0735865680", "112233", "19800712");
        Person person3 = new Person("Peter Doe", "Stockholmsvägen 27", "0735765681", "223344", "19890713");
        Person person4 = new Person("Nils Hanson", "Stockholmsvägen 28", "0735767800", "445566", "19890714");
        Person person5 = new Person("Mike Petersen", "Stockholmsvägen 29", "0735969920", "556677", "19890715");
        Person person6 = new Person("Andrew High", "Stockholmsvägen 30", "0735160030", "778899", "19890716");
        Person person7 = new Person("John Node", "Stockholmsvägen 2", "0735262345", "222222", "19890717");
        Person person8 = new Person("Zika Mika", "Stockholmsvägen 99", "07353645864", "334411", "19890718");
        Person person9 = new Person("Kalle Andersen", "Stockholmsvägen 56", "07354667834", "19890719");
        Person person10 = new Person("Craig Dennis", "Stockholmsvägen 87", "07398633878", "19890720");
        listOfPersons.add(person1);
        listOfPersons.add(person2);
        listOfPersons.add(person3);
        listOfPersons.add(person4);
        listOfPersons.add(person5);
        listOfPersons.add(person6);
        listOfPersons.add(person7);
        listOfPersons.add(person8);
        listOfPersons.add(person9);
        listOfPersons.add(person10);

        return listOfPersons;
    }

    public List<Person> getPersonByName(String name) {
        List<Person> filteredList = new ArrayList<>();
        for (Person person : listOfPersons) {
            //Adds person to filteredList if condition is met otherwise it ignores the person
            if (person.getFullName().toLowerCase().contains(name.toLowerCase())) {
                filteredList.add(person);
            }
        }
        return filteredList;
    }

    public List<Person> getPersonByNumber(String number) {
        List<Person> filteredList = new ArrayList<>();
        for (Person person : listOfPersons) {
            //Adds person to filteredList if condition is met otherwise it ignores the person
            if (person.getMobileNumber().contains(number)) {
                filteredList.add(person);
            }
        }
        return filteredList;

    }

    public int searchOption(int choice) {

        if (choice == 1) {
            System.out.println("Enter the name you are looking for: ");
            String name = scanner.next();
            //Call getPersonByName() and returns a list
            List<Person> filterList = getPersonByName(name);
            if (filterList.isEmpty()) {
                System.out.println("****************");
                System.out.println("*No match found*");
                System.out.println("****************");
                System.exit(0);
            }
            filterList.forEach(person -> System.out.println(person));

        } else if (choice == 2) {
            System.out.println("Enter the telephone number you are looking for: ");
            String number = scanner.next();
            //Call getPersonByNumber() and returns a list
            List<Person> filterList = getPersonByNumber(number);
            if (filterList.isEmpty()) {
                System.out.println("****************");
                System.out.println("*No match found*");
                System.out.println("****************");
                System.exit(0);

            }
            filterList.forEach(person -> System.out.println(person));


        } else {
            System.out.println("Choose option 1 or 2");
            start();
        }
        return choice;
    }

    public int start() {
        int number;
        do {
            System.out.println("Choose one of these option below to search for the person/persons you are looking for");
            System.out.println("1: Enter name");
            System.out.println("2: Enter telephone Number");

            while (!scanner.hasNextInt()) {
                System.out.println("You can only choose 1 or 2");
                System.out.println("1: Name");
                System.out.println("2: Telephone Number");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number <= 0 || number > 2);

        return number;
    }


}
