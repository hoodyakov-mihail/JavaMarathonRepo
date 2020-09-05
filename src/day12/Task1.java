package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> carManufacturer = new ArrayList<>();
        carManufacturer.add("BMW");
        carManufacturer.add("Mercedes-Benz");
        carManufacturer.add("Honda");
        carManufacturer.add("Mazda");
        carManufacturer.add("Suzuki");
        for (String car:carManufacturer) System.out.println(car);

        carManufacturer.add(3,"Kia");
        carManufacturer.remove(0);
        for (String car:carManufacturer) System.out.println(car);
    }
}
