package Lab2;

import java.util.HashSet;
import java.util.Set;

public class Math_Lab {

    public static void union(Set a, Set b){
        Set c = new HashSet();

        c = a;

        c.addAll(b);

        System.out.println("Union set: " + c);
    }

    public static void intersection(Set a, Set b){
        Set c = new HashSet();

        c = a;

        c.retainAll(b);

        System.out.println("Intersection set: " + c);
    }

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

    @Override
    public String toString() {
        return super.toString();
    }
}
