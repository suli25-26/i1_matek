import java.util.Random;

public class Poker {
    public static void play() {
        machineThrow();
        humanThrow();
    }
    public static void machineThrow() {
        Random random = new Random();
        int kocka1 = random.nextInt(6) + 1;
        int kocka2 = random.nextInt(6) + 1;
        int kocka3 = random.nextInt(6) + 1;
        int kocka4 = random.nextInt(6) + 1;
        int kocka5 = random.nextInt(6) + 1;
        System.out.printf(
            "%6s: %d %d %d %d %d\n",
            "Gép",
            kocka1, kocka2, kocka3, kocka4, kocka5
        );
    }
    public static void humanThrow() {
        Random random = new Random();
        int kocka1 = random.nextInt(6) + 1;
        int kocka2 = random.nextInt(6) + 1;
        int kocka3 = random.nextInt(6) + 1;
        int kocka4 = random.nextInt(6) + 1;
        int kocka5 = random.nextInt(6) + 1;
        System.out.printf(
            "%6s: %d %d %d %d %d\n",
            "Ember",
            kocka1, kocka2, kocka3, kocka4, kocka5
        );
    }
}
