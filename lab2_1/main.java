package lab2_1;
import java.util.ArrayList;
import java.util.List;

public class main {
    private static final List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student("Андрей", "Бойко", "БУТ1901", 5));
        studentList.add(new Student("Мария", "Гусева", "БАП1901", 4.9));
        studentList.add(new Student("Александра", "Зубкова", "БУТ1901", 3.2));
        studentList.add(new Aspirant("Вячеслав", "Козлов", "А111", 3.9));
        studentList.add(new Aspirant("Данил", "Лавров", "А111", 5));
        studentList.add(new Aspirant("Анна", "Некрасова", "А234", 4));
    }

    public static void main(String[] args) {

        for (Student student : studentList) {
            System.out.println("Имя, фамилия: " + student.getFirstName() + " " + student.getLastName()
                    + "\n\tГруппа: " + student.getGroup()
                    + "\n\tСредний балл: " + student.getAverageMark()
                    + "\n\tРазмер стипендии: " + student.getScholarship());
        }
    }
}
