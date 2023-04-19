/**
 * Documentation Tips:
 * <br>    1. Jargon must not be explained with jargon.
 * <br>    2. Documentation must be readable by students.
 * <br>    3. Documentation should look nice.
 * <br>
 * Java is one sexy mf.
 * <BR>
 * Documentation is everything. Better documentation will result in a positive progress.
 */
package app.codge.basicjava;

import java.sql.Array;
import java.util.*;

import static app.codge.utilities.Utils.print;
import static app.codge.utilities.Utils.newline;


/**
 * Class of static methods that contain Java learning material.
 * Each method pertains to a unique Java concept.
 * <br>
 *
 */
public class JavaFundamentals {


    /**
     * User inputs
     */
    public static void userInput() {
        Scanner scanner = new Scanner(System.in);

        print("Enter a string: ");              // Sps: You enter the string "Drink water"
        String str1 = scanner.nextLine();       // scanner == Drink water\n
        print("Your string input: " + str1);    // .nextLine() reads up to the '\n' (inclusive)
        // scanner ==

        print("Enter an integer: ");            // Sps: You enter the number 777
        int num = scanner.nextInt();            // scanner == 777\n
        print("Your integer input: " + num);    // .nextInt() ONLY reads the number, but NOT the '\n'
        // scanner == \n

        scanner.nextLine();       // Since scanner still contains '\n',
        //   We MUST clear the buffer by calling scanner.nextLine(); This will NOT prompt the user.
        // If you do NOT do this, then the program will terminate WITHOUT asking you for the next input.
        print("Enter a string: ");
        String str2 = scanner.nextLine();
        print("Your string input: " + str2);
    }


    /**
     * Java types
     */
    public static void javaTypes() {

        int x;         // Declaration
        x = 7;         // Assignment
        int y = 777;   // Initialization

        /*
        Below are the PRIMITIVE types and WRAPPER classes in Java.
        Primitive types store data. Wrapper classes store a memory address.
         */

        /* 1 bit */     boolean a1 = true;                     Boolean A1 = true;
        /* 1 bit */     boolean a2 = false;                    Boolean A2 = false;

        /* 1 byte */    byte b1 = -128;                        Byte B1 = -128;
        /* 1 byte */    byte b2 = 127;                         Byte B2 = 127;

        /* 2 bytes */   short c = 32_767;                      Short C = 32_767;
        /* 4 bytes */   int d = 2_000_000_000;                 Integer D = 2_000_000_000;
        /* 8 bytes */   long e = 9_000_000_000_000_000_000L;   Long E = 9_000_000_000_000_000_000L;

        /* 4 bytes */   float f = 3.141_592f;                  Float F = 3.141_592f;
        /* 8 bytes */   double g = 3.141_592_653_589_793;      Double G = 3.141_592_653_589_793;

        /* 2 bytes */   char h = '@';                          Character H = 'c';


        /*
        Autoboxing: Java compiler automatically converts PRIMITIVE type to WRAPPER class.
         */
        Boolean aa = true;
        Character bb = '!';
        Integer cc = 7;
        Double dd = 3.14;
        String ee = "bro";

        /*
        Unboxing: Automatic conversion of WRAPPER class to PRIMITIVE type.
         */
        if (aa == true) print("Here, the Boolean object is \"unboxed\" to behave like the primitive boolean type.");
        

    }


    /**
     * Java arrays
     */
    public void javaArrays() {

        // Method #1
        String[] subjects = {"Math", "Science", "English", "Music"};

        // Method #2
        String[] cars = new String[4];
        cars[0] = "Chev";
        cars[1] = "Hyundai";
        cars[2] = "Tesla";
        cars[3] = "Honda";
//        cars[4] = "bruh";       //  === ArrayIndexOutOfBoundsException ===

        newline();

        // Arrays + For-Loop
        for (int i = 0; i < cars.length; i++) {
            String car = cars[i];
            print(car);
        }

        newline();

        // Arrays + Enhanced For-Loop
        for (String car : cars) {
            print(car);
        }

    }

    /**
     * Method containing System.out.printf() using common conversion characters.
     */
    public void formatPrint() {
        boolean b = true;
        char ch = 's';
        String str = "world";
        int i = 3;
        double pi = 3.14;

        System.out.printf(" %b ", b);
        System.out.printf(" %c ", ch);
        System.out.printf(" %s ", str);
        System.out.printf(" %d ", i);
        System.out.printf(" %f ", pi);

        System.out.printf("Hello, %s!", str);
    }


    /**
     * Print a matrix of size <b>(row)</b>, <b>(col)</b> uniformly filled w/ <b>(item)</b>.
     * <br>
     * Return a 2D array filled w/ (<b>item</b>).
     * @param item Object
     * @param row int
     * @param col int
     * @return Object
     */
    public Object[][] printMatrix(Object item, int row, int col) {
        Object[][] matrix = new Object[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = item;
                print(item + " ", 1);
            }
            newline();
        }
        newline();
        return matrix;
    }


    /**
     * Basic calculator that returns the result of the operation specified
     * by <b>(operator)</b>.
     * <br><br>
     * v0.1 === Currently only supports Addition, Subtraction, Multiplication, Division.
     * @param operator String _ math operation
     * @param x double _ operand 1
     * @param y double _ operand 2
     * @return double _ result of math operation
     */
    public double myCalculator(String operator, double x, double y) {
        return switch (operator) {
            case "+", "plus", "Plus", "add", "Add", "addition", "Addition":
                yield x + y;
            case "-", "minus", "Minus", "subtract", "Subtract", "subtraction", "Subtraction":
                yield x - y;
            case "*", "times", "Times", "multiply", "Multiply", "multiplication", "Multiplication":
                yield x * y;
            case "/", "divide", "Divide", "division", "Division":
                if (y == 0) throw new IllegalArgumentException("Zero division error");
                yield x / y;
            default:
                throw new IllegalArgumentException("Unknown operator: %s".formatted(operator));
        };
    }


}
