import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rnd = new Random();
        int number = rnd.nextInt(10);
        System.out.println("Random Number: " + number);
    }
}