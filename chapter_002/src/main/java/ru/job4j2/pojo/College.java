package ru.job4j2.pojo;

/**
 * 2. Модель данных.[#235612]
 */
public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Mayer Sergey Andreevich");
        student.setGroup("GI96-1");
        student.setAcceptance("01.09.1996");

        System.out.println("Student " + student.getName() + " studied in the group " + student.getGroup() + " from " + student.getAcceptance());
    }
}
