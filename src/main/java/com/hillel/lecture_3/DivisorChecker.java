package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class DivisorChecker {

    public String checkDivisor(int divisor, int number) {

        String result = "";
        if ((number % divisor) == 0) {
            result = "The number " + divisor + " is divisor of the number " + number;
        } else {

            result = "The number " + divisor + " is not divisor of the number " + number;
        }

        return result;
    }
}
