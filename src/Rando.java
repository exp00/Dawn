import java.util.Random;

public class Rando {
    public static  Random random = new Random();
    public static int r(int a, int b) {
        while(true) {
            int c = random.nextInt(a);
            if (c >= b) {
                return (c);
            }
        }
    }
}
