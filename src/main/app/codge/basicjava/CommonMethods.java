/**
 *
 */
package app.codge.basicjava;


import static app.codge.utilities.Utils.print;
import static app.codge.utilities.Utils.newline;

/**
 * Class of methods that contain common methods for unique types.
 */
public class CommonMethods {

    public void stringMethods() {
        String str = "   Hello, World! ";

        /* return boolean */
        str.isEmpty();   //--> false

        str.equals("   hello, world! ");                        //--> false
        str.equalsIgnoreCase("   hello, world! ");   //--> true

        /* return int */
        str.length();        //--> 17
        str.indexOf('l');    //--> 5

        /* return char */
        str.charAt(3);       //--> 'H'

        /* return String */
        str.toLowerCase();   //--> "   hello, world! "
        str.toUpperCase();   //--> "   HELLO, WORLD! "
        str.trim();          //--> "Hello, World!"
        str.replace('l', 'f');   //--> "   Heffo, Worfd! "

    }

}
