package day14;

import java.io.FileNotFoundException;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Person> persons = null;
        try {
            persons = Person.parseFileToObjList();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        //Вывод в консоль
        System.out.print(persons);
    }
}
