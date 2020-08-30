package day6;

public class Task1 {
    public static void main(String[] args) {
        Airplane plane = new Airplane("Cessna",2003, 7.9,1300);

        plane.setYear(2005);
        plane.setLength(8.6);
        plane.fillUp(220.5);
        plane.fillUp(30);
        plane.info();

        Student ivan = new Student("Иван Просто Студент");
        Teacher teacher = new Teacher("Иван Петрович Валит","История");

        teacher.estimateStudent(ivan);
    }
}
