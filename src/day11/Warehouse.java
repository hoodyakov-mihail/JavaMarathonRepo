package day11;

public class Warehouse {
    private int countOrder;
    private int balance;

    public int getCountOrder() {
        return countOrder;
    }
    public int getBalance() {
        return balance;
    }
    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Количество собранных заказов " + countOrder + ", доход от доставленных заказов " + balance;
    }
}
