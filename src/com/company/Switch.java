package com.company;

public class Switch {

    public static void main(String[] args) {
        // switch on an int
        int someNumber = 1;
        switch(someNumber) {
            case 1:
                System.out.println("The number was 1");
                break;
            case 2:
                System.out.println("The number was 2");
                break;
        }

        // switch on a string
//        String someString = "hello";
//        switch(someString) {
//            case "hello":
//                System.out.println("You said hello");
//                break;
//            case "goodbye":
//                System.out.println("You said goodbye");
//                break;
//        }

        // many languages switch statements, and some rely heavily on switches -- it's worth playing around with some in unit 2, but by no means should you feel like you should know it as well as if/else if/else
    }
}
