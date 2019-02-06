package org.vijaykoshis.Exceptions;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {

            stringtoint("123");
            //creating an exception

            NumberFormatException ex = new NumberFormatException("Exception");

            //setting a cause of the exception

            ex.initCause(new NullPointerException("This is actual cause of the exception"));

            throw ex;
        } catch (NumberFormatException ex) {
            System.out.println(ex);     //displaying the exception

            System.out.println(ex.getCause());    //getting the actual cause of the exception
        }
    }

    public static void stringtoint(String s) {
        boolean isNegative = false;
        int number = 0;
        if (s.charAt(0) == '-') {
            isNegative = true;
        } else {
            number = number * 10 + s.charAt(0) - '0';
        }

        for (int i = 1; i < s.length(); i++) {

            number = number * 10 + s.charAt(i) - '0';
        }
        if (isNegative) {
            number = 0 - number;
        }
        System.out.println(number);
    }
}