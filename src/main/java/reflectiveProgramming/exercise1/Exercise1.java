package reflectiveProgramming.exercise1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        Student student = new Student();

        Method[] declaredMethods = student.getClass().getDeclaredMethods();
        System.out.println(Arrays.toString(declaredMethods));

        Field[] declaredFields = student.getClass().getDeclaredFields();
        System.out.println(Arrays.toString(declaredFields));

        Constructor<?>[] constructors = student.getClass().getConstructors();
        System.out.println(Arrays.toString(constructors));

    }
}
