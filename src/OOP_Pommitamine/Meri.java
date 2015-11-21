package OOP_Pommitamine;

/**
 * Created by mtseljab on 21.11.15.
 */
public class Meri {

    private int lauaServaPikkus;
    private Laev[] laevastik = new Laev[5];

    public Meri(int pikkus) {
        System.out.println("Construktor Meri");
        lauaServaPikkus = pikkus;
        tekiLaevastik();
    }

    private void tekiLaevastik() {
        for (int i = 0; i < laevastik.length; i++) {
            laevastik[i] = new Laev(i+1, lauaServaPikkus);

        }
    }
    public boolean laevuOnAlles() {
        for (int i = 0; i < laevastik.lenght; i++) {
            boolean elus = laevastik[i].oledElus();
            if (elus) {
                return true;
            }
        }
        return false;
    }
}
