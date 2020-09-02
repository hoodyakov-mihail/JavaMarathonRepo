package day9;

public class Task1 {
    public static void main(String[] args) {
        Student student1 = new Student("Евгений Проспал", "Б1");
        Teacher teacher1 = new Teacher("Зинаида Петровна", "Математика");

        System.out.println(student1.getGroup());
        System.out.println(teacher1.getSubject());

        student1.printInfo();
        teacher1.printInfo();
    }
}
