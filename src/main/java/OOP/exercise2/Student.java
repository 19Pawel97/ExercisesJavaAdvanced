package OOP.exercise2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
public class Student extends Person {
    private String courseType;
    private int yearOfStudies;
    private float fees;

    public Student(String name, String address, String courseType, int yearOfStudies, float fees) {
        super(name, address);
        this.courseType = courseType;
        this.yearOfStudies = yearOfStudies;
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", courseType='" + courseType + '\'' +
                ", yearOfStudies=" + yearOfStudies +
                ", fees=" + fees +
                '}';
    }
}
