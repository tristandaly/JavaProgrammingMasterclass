package com.tristandaly;

public class Main {

    public static void main(String[] args) {
        int value = 1;
        if(value == 1) {
            System.out.println("Value was 1");
        } else if(value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 1;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3, or 4, or 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char switchValue1 = 'a';

        switch (switchValue1) {
            case 'a': case 'b': case 'c': case 'd': case 'e':
                System.out.println("Value was '" + switchValue1 + "'");
                break;

            default:
                System.out.println("Value not found");
        }

        String month = "January";

        switch (month.toLowerCase()) {
            case "january": case "february": case "march": case "april": case "may": case"june":
                System.out.println("Month is " + month.substring(0, 3) + " and is in the first half of the year.");
                break;

            default:
                System.out.println("Unknown month!");
        }

        // More code here
    }
}
