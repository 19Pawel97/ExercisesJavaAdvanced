package enums.exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("It is " + Weekday.SUNDAY.isHoliday() + " that " + Weekday.SUNDAY.getName() + " is a holiday.");
        System.out.println("It is " + Weekday.SATURDAY.isWeekDay() + " that " + Weekday.SUNDAY.getName() + " is a weekday.");
        System.out.println("It is " + Weekday.MONDAY.isWeekDay() + " that " + Weekday.MONDAY.getName() + " is a weekday.");
        System.out.println("It is " + Weekday.WEDNESDAY.isHoliday()+ " that " + Weekday.WEDNESDAY.getName() + " is a holiday.");
        Weekday.SATURDAY.whichIsGreater(Weekday.SUNDAY);
    }
}
