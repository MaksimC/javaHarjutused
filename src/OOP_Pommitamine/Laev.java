package OOP_Pommitamine;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by mtseljab on 21.11.15.
 */
public class Laev {
    private int laevaPikkus;
    private int[] koordinadid;

    public Laev(int pikkus, int lauaServaPikkus) {
        laevaPikkus = pikkus;
        genereeriKoordinadid(lauaServaPikkus);
    }

    private void genereeriKoordinadid(int lauaServaPikkus) {
        Random rand = new Random();
        int x = rand.nextInt(lauaServaPikkus);
        int y = rand.nextInt(lauaServaPikkus);
        koordinadid = new int[]{x, y};
        System.out.println(Arrays.toString(koordinadid));
    }
}
