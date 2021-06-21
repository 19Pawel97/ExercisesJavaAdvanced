package OOP.exercise2;

import java.time.Period;

public class Exercise2 {
    public static void main(String[] args) {
        Person student = new Student("James", "Lodz", "IT", 2, 9000);
        Person lecturer = new Lecturer("Adam", "Edinburgh", "Economics", 10000);

        System.out.println(student.getName());
        System.out.println(student.getAddress());
        System.out.println(((Student) student).getCourseType());
        System.out.println(((Student) student).getYearOfStudies());
        System.out.println(((Student) student).getFees());
        ((Student) student).setFees(20000);
        System.out.println(((Student) student).getFees());

        System.out.println(lecturer.getName());
        System.out.println(lecturer.getAddress());
        System.out.println(((Lecturer) lecturer).getSpecialization());
        System.out.println(((Lecturer) lecturer).getSalary());
        ((Lecturer) lecturer).setSalary(2000000);
        System.out.println(((Lecturer) lecturer).getSalary());

        System.out.println(student);
        System.out.println(lecturer);
    }
}
