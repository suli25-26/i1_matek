import java.util.Random;

public class Veletlen {
    public static void csinald() {
        Random random = new Random();
        int szam = random.nextInt(3);
        System.out.println(szam);

        int kocka = random.nextInt(6)+1;
        System.out.println("Kocka: " + kocka);
    }
}
