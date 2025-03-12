import java.util.Random;
public class RandomCode {
	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(100) + 1;
		System.out.println(num);
	}
}