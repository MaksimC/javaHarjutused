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
        for (int i = 0; i < laevastik.length; i++) {
            boolean elus = laevastik[i].oledElus();
            if (elus) {
                return true;
            }
        }
        return false;
    }

    public boolean saiPihta(int[] lask) {
        for (Laev laev : laevastik) {
            boolean pihtas = laev.kasTabas(lask);
            if (pihtas) {
                return true;
            }
        }
        return false;
    }

    public void Kuvalaud() {
        for (int i = 0; i < lauaServaPikkus; i++) {
            for (int j = 0; j < lauaServaPikkus; j++) {
                boolean onLaev = kasLaevaOnSiin(i, j);
                if (onLaev){
                    System.out.print("O");
                } else {
                    System.out.print("~");
                }
            }
            System.out.println();
        }
    }

    private boolean kasLaevaOnSiin(int i, int j) {
        for (Laev laev : laevastik) {
            if (laev.oledSiin(i, j)) {
                return true;
            }
        }
        return false;
    }
}
