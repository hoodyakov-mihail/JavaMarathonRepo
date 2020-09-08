package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "{name='" + this.name + "', year=" + this.age + "}";
    }
    public static List<Person> parseFileToObjList() throws FileNotFoundException {
        List<String> people = new ArrayList<>();
        File file = new File("C:\\JavaMarathon2020\\src\\day14\\people");
        Scanner scan = new Scanner(file);

        List<Person> persons = new ArrayList<>();
        int i = 0;
        while (scan.hasNextLine()) {
            people.add(scan.nextLine());
            String[] peopleCreate = people.get(i).split(" ");
            if(Integer.parseInt(peopleCreate[1]) >= 0) {
                persons.add(new Person(peopleCreate[0], Integer.parseInt(peopleCreate[1])));
            } else {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Некорректный входной файл");
                }
            }
            i++;
        }

        scan.close();
        return persons;
    }
}
