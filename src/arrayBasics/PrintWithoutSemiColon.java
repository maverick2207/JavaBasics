package arrayBasics;

/**
 * Print Hello world without using semicolon
 */

public class PrintWithoutSemiColon {

    public static void main(String[] args) {

        // printing without semicolon

        //1. Using if statement:

        if (System.out.printf("Hello World") == null) {

        }
        // 2. Using String.equals() method
        if (System.out.printf("Hello World").equals(null)) {

        }

//        3. Using StringBuilder.append() method:

        if (System.out.append("Hello World") == null) {

        }

        if (System.out.append("Hello World").equals(null)) {

        }

//        4. Using for loop:

        for (int i = 0; i < 1; System.out.println("Hello World")) {
            i++;
        }
    }
}
