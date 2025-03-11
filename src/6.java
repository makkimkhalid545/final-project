import java.util.*;
import java.lang.*;

class RandomJavaCode {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println("The random element is: " + list.get((int)(Math.random() * list.size())));
    }
}