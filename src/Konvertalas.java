public class Konvertalas {
    public static void csinal() {
        String szoveg = "43";
        int szam = Integer.parseInt(szoveg);
        String szoveg2 = "43.15";
        double szam2 = Double.parseDouble(szoveg2);
        System.out.println(szam + " " + szam2);

        int egesz = 35;
        String egeszStr = String.valueOf(egesz);
        System.out.println(egeszStr);
    }
}
