package day11;

public class Courier implements Worker{
    private int salary;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.salary = 0;
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setBalance(warehouse.getBalance() + 1000);
        if (warehouse.getBalance() == 1000000) {
            bonus();
        }
    }
    @Override
    public void bonus() {
        salary *= 2;
        System.out.println("Бонус! ЗП удваивается " + salary);
    }
}
