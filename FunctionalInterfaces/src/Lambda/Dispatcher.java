package Lambda;

import java.util.*;
import java.util.stream.*;

public class Dispatcher {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        Stream s = c.parallelStream();
    }
}

// add(int a, int b) - structure - C, Basic, Pascal
// add(Object a, Object b) - objective - Java, Python
// a(Object c, FunctionalInterface fi) - functional