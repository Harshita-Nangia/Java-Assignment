import java.util.*;

public class TrimList {
    static void trimList(List<String> strings) {
        for (ListIterator<String> L = strings.listIterator(); L.hasNext(); ) {
            L.set(L.next().trim());
        }
    }

    public static void main(String[] args) {
        List<String> l = Arrays.asList("Hello   ", "  this ", " is" , "  Harshita Nangia   ");
        trimList(l);
        for (String s : l) {
            System.out.format("\"%s\"%n", s);
        }
    }
}