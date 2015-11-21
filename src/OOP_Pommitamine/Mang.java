package OOP_Pommitamine;

/**
 * Created by mtseljab on 21.11.15.
 */
public class Mang {

    public Mang() {
        /*
*1. mangu seadistada
*2. mangu toos hoidmine
*3. kui mang on labi, mis saab
*/

        //1. Mangu seadistus
        Meri meri = new Meri(10);
        Mangija mangija = new Mangija();

       //2. mangu toos hoidmine
        /*hile (meri.laevuOnAlles()) {
            int[] lask = mangija.kuhuLasta();
            boolean pihtas = meri.saiPihta(lask);
            if (pihtas) {
                mangija.pihtas();
            } else {
                mangija.moodas();
            }
        }
        //3. Kui mang on labi, mis saab?
        mangija.gameover();*/
    }
}
