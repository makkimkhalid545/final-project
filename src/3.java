import java.util.Random;
class RandomUtil {
 public static int getRandomNumber(int min, int max) {
  Random rand = new Random();
  return rand.nextInt((max - min) + 1) + min;
 }
}
