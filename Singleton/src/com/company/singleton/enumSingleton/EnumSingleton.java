package com.company.singleton.enumSingleton;

import java.util.Arrays;

/** An Enum value is initialized only once at the time of class loading.
 It is singleton by design and is also thread-safe.
 */

enum EnumSingleton {
    WEEKDAY("Monday", "Tuesday", "Wednesday", "Thursday", "Friday"),
    WEEKEND("Saturday", "Sunday");

    private String[] days;

    EnumSingleton(String... days){
        System.out.println("Initializing enum with " + Arrays.toString(days));
        this.days = days;
    }

    public String[] getDays() {
        return days;
    }

    @Override
    public String toString(){
        return "EnumSingleton{" + "days=" + Arrays.toString(days) + "}";
    }
}

