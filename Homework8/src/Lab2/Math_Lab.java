package Lab2;

import java.util.HashSet;
import java.util.Set;

public class Math_Lab {
    /**
     * takes in two different sets and gets the union
     * in a new set "c"
     * @param a
     * @param b
     */
    public static void union(Set a, Set b){
        Set c = new HashSet();

        c = a;

        c.addAll(b);

        System.out.println("Union set: " + c);
    }

    /**
     * Takes in two sets and finds the intersection between the two sets
     * @param a
     * @param b
     */
    public static void intersection(Set a, Set b){
        Set c = new HashSet();

        c = a;

        c.retainAll(b);

        System.out.println("Intersection set: " + c);
    }

    /**
     * gets the difference between the two sets that are passed in
     * from the user
     * @param a
     * @param b
     */
    public static void difference(Set a, Set b){
        Set c = new HashSet();

        c = a;

        c.removeAll(b);

        System.out.println("Difference are: " + c);
    }
    
    public static void subset(Set a, Set b){
        Set c = new HashSet();

        if (b.containsAll(a)){
            c = a;
        }
        else {
            c = b;
        }
        System.out.println("Subset : " + c);
    }

    /**
     * to string method
     * @return
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
