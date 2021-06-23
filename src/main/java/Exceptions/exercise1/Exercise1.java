package Exceptions.exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        try {
            System.out.println(divide(10,0));
        } catch (CannotDivideBy0Exception cdbe) {
            cdbe.printStackTrace();
        }

        try {
            System.out.println(divide(10,2));
        } catch (CannotDivideBy0Exception cdbe) {
            cdbe.printStackTrace();
        }
    }

    private static double divide(double num1, double num2) throws CannotDivideBy0Exception {
        if (num2 == 0) {
            throw new CannotDivideBy0Exception();
        } else {
            return num1 / num2;
        }
    }
}
