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
        int i = 0;
        while (scan.hasNextLine()) {
            people.add(i, scan.nextLine());
            i++;
        }
        List<Person> persons = new ArrayList<>();
        for (int j = 0; j < people.size(); j++) {
            String[] peopleCreate = people.get(j).split(" ");
            //System.out.println(Arrays.toString(peopleCreate));
            if(Integer.parseInt(peopleCreate[1]) < 0) try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Некорректный входной файл");
            }
            persons.add(new Person(peopleCreate[0], Integer.parseInt(peopleCreate[1])));
        }
        scan.close();
        return persons;
    }
}
