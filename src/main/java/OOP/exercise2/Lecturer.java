package OOP.exercise2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
public class Lecturer extends Person{
    private String specialization;
    private double salary;

    public Lecturer(String name, String address, String specialization, double salary) {
        super(name, address);
        this.specialization = specialization;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "specialization='" + specialization + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
