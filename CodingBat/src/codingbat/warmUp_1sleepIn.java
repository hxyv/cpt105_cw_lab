/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbat;

/**
 * @author xingyu hu
 */
public class warmUp_1sleepIn {

    public static void main(String[] args) {
        // System.out.println(sleepIn(true, false));

        // System.out.println(monkeyTrouble(true, true));

        // System.out.println(sumDouble(2, 2));

        // System.out.println(diff21(22));

        // System.out.println(parrotTrouble(true, 6));

        // System.out.println(makes10(1, 1));

        // System.out.println(nearHundred(93));

        // System.out.println(posNeg(1, -1, true));

        System.out.println(notString("x"));
    }

    /**
     * Given a string, return a new string where "not " has been added to the front.
     * However, if the string already begins with "not", return the string unchanged.
     * Note: use .equals() to compare 2 strings.
     */
    public static String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }

        return "not " + str;
    }



    /**
     * Given 2 int values, return true if one is negative and one is positive. Except if
     * the parameter "negative" is true, then return true only if both are negative.
     */
    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }


    /**
     * Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num)
     * computes the absolute value of a number.
     */
    public static boolean nearHundred(int n) {
        if ((Math.abs(n - 100) <= 10) || (Math.abs(n - 200) <= 10)) {
            return true;
        }
        return false;
    }


    /**
     * Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
     */
    public static boolean makes10(int a, int b) {
        if (a == 10 || b == 10) {
            return true;
        } else if (a + b == 10) {
            return true;
        }
        return false;
    }


    /**
     * We have a loud talking parrot. The "hour" parameter is the current hour
     * time in the range 0..23. We are in trouble if the parrot is talking and
     * the hour is before 7 or after 20. Return true if we are in trouble.
     */
    public static boolean parrotTrouble(boolean talking, int hour) {
        if (talking == true && (hour < 7 || hour > 20)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Given an int n, return the absolute difference between n and 21, except
     * return double the absolute difference if n is over 21.
     */
    public static int diff21(int n) {
        if (n > 21) {
            return 2 * (n - 21);
        } else {
            return Math.abs(n - 21);
        }
    }


    /**
     * Given two int values, return their sum. Unless the two values are the
     * same, then return double their sum.
     */
    public static int sumDouble(int a, int b) {
        if (a == b) {
            return 4 * a;
        } else {
            return a + b;
        }
    }

    /**
     * We have two monkeys, a and b, and the parameters aSmile and bSmile
     * indicate if each is smiling. We are in trouble if they are both smiling
     * or if neither of them is smiling. Return true if we are in trouble.
     */
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == true && bSmile == true) {
            return true;
        } else if (aSmile == false && bSmile == false) {
            return true;
        }
        return false;
    }

    /**
     * The parameter weekday is true if it is a weekday, and the parameter
     * vacation is true if we are on vacation. We sleep in if it is not a
     * weekday or we're on vacation. Return true if we sleep in.
     *
     * @param weekday
     * @param vacation
     * @return
     */
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (vacation == true) {
            return true;
        } else if (weekday == false) {
            return true;
        }
        return false;
    }

}
