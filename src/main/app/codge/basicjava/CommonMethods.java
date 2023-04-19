/**
 *
 */
package app.codge.basicjava;


import java.util.ArrayList;

import static app.codge.utilities.Utils.print;
import static app.codge.utilities.Utils.newline;

/**
 * Class of methods that contain common methods for unique types.
 */
public class CommonMethods {

    /**
     * Method containing common String methods.
     */
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

    /**
     * Method containing common ArrayList methods
     */
    public void arrayListMethods() {
        String[] colors = {"green", "red", "orange"};
        int arrayLen = colors.length;

        ArrayList<String> foods = new ArrayList<>();
        int arrayListLen = foods.size();

        foods.add("kimchi");
        foods.add("chow-mein");
        foods.add("sushi");

        // foods.set(3, "mint");   *** IndexOutOfBoundsException ***
        foods.set(1, "kung pow chicken");

        for (int i = 0; i < foods.size(); i++) {
            print(foods.get(i));
        } newline();

        int index = 0;
        foods.remove(index);
        foods.clear();

    }

}
