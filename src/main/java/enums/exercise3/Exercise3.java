package enums.exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println(TemperatureConverter.convertTemperature('C','K',30));
        System.out.println(TemperatureConverter.convertTemperature('C','F',30));
        System.out.println(TemperatureConverter.convertTemperature('F','K',300));
        System.out.println(TemperatureConverter.convertTemperature('F','C',300));
        System.out.println(TemperatureConverter.convertTemperature('K','C',50));
    }
}
