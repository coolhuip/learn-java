/**
 * CITIZEN KANE
 * ------------
 * The Declaration of Principles is Foster Kane's partner in the dance of quantum entanglement.
 * <br>
 * In a literal sense, the Declaration of Principles is a declaration of principles.
 * In a truer sense, the Declaration of Principles is a limbo existence.
 * <br>
 * Let us grant the above axioms.
 * <br>
 * Kane's conscious decision to write the Declaration of Principles
 * is his subconscious decision to blossom into a rose.
 * <br>
 * Kane's conscious decision to rip up the Declaration of Principles
 * is his subconscious decision to wither a rosebud.
 */
import app.codge.basicjava.CommonMethods;
import app.codge.basicjava.JavaFundamentals;
import static app.codge.basicjava.JavaFundamentals.javaTypes;
import static app.codge.utilities.Utils.print;
import static app.codge.utilities.Utils.newline;



public class Main {

    public static void main(String[] args) {

        // When a class containing a static method is imported, you do NOT have to instantiate it to use its static method.
        // Instead, access the static method via class reference.
        JavaFundamentals.javaTypes();

        // If you want to skip the class reference altogether, make a STATIC IMPORT for the method you want to use.
        javaTypes();

        // If you want to use a non-static method, you MUST instantiate its class first.
        // See below:
        JavaFundamentals demo = new JavaFundamentals();
        double result = demo.myCalculator("divide", 3, 7);

        print(result + "   ", 1);  // Overloading can allow us to use the SAME method w/ DIFFERENT signatures.
        print(result);

//        demo.javaTypes();       //  *** WRONG ***  Do NOT access static members via instance reference.
//        demo.userInput();       //  *** WRONG ***  Do NOT access static members via instance reference.

        demo.javaArrays();
        newline();

        Object[][] yoMatrix = demo.printMatrix("yo", 2, 5);
        Object[][] zeroMatrix = demo.printMatrix(0, 7, 23);

//        for (int row = 0; row < zeroMatrix.length; row++) {
//            for (int col = 0; col < zeroMatrix[row].length; col++) {
//                print( zeroMatrix[row][col] + " ", 1);
//            }
//            newline();

        CommonMethods cm = new CommonMethods();
        cm.stringMethods();



    }
}


