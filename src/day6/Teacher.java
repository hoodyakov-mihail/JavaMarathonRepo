package day6;

public class Teacher {
    private String fio;
    private String subject;

    public String getFio() {
        return fio;
    }
    public String getSubject() {
        return subject;
    }

    public Teacher(String fio, String subject) {
        this.fio = fio;
        this.subject = subject;
    }

    public void estimateStudent (Student student) {
        int ratingCalculation = (int) (Math.random() * 4 + 2);
        String rating = "";
        switch (ratingCalculation) {
            case 2:
                rating = "неудовлетворительно";
                break;
            case 3:
                rating = "удовлетворительно";
                break;
            case 4:
                rating = "хорошо";
                break;
            case 5:
                rating = "отлично";
                break;
        }
        System.out.printf("Преподаватель %s оценил студента с именем %s по предмету %s на оценку %s.",
                getFio(), student.getFio(), getSubject(), rating);
    }
}
