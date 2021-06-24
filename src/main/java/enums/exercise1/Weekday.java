package enums.exercise1;

import lombok.Getter;

@Getter
public enum Weekday {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private String name;

    Weekday(String name) {
        this.name = name;
    }

    public boolean isWeekDay() {
        return this != SATURDAY && this != SUNDAY;
    }

    public boolean isHoliday() {
        return this == SATURDAY || this == SUNDAY;
    }

    public void whichIsGreater(Weekday weekday) {
        int weekdayPlace = weekday.ordinal();
        int theDayOrder = this.ordinal();

        if (weekdayPlace > theDayOrder) {
            System.out.println("Before " + weekday.getName());
        } else if (weekdayPlace < theDayOrder) {
            System.out.println("After " + weekday.getName());
        } else {
            System.out.println("It is the same day of week.");
        }
    }

}
