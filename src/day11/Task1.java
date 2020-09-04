package day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        for (int i = 0; i < 1000 ; i++) {
            courier.doWork();
        }
        for (int i = 0; i < 1500; i++) {
            picker.doWork();
        }

        System.out.println(warehouse.toString());
        System.out.println("ЗП сборщика " + picker.getSalary());
        System.out.println("ЗП курьера " + courier.getSalary());

    }
}
