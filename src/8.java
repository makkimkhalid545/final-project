import java.util.*;

public class RandomNumber {
    public static void main(String[] args) {
        System.out.println("Random number: " + getRandomNumber());
    }

    private static int getRandomNumber() {
        return new Random().nextInt(10);
    }
}
