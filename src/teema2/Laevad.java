/**
package teema2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by mtseljab on 30.10.15.
 */
/**
public class Laevad {
    static int[][] laud;
    static int laualaius = 3;
    static int lauakorgus = 3;
    static Scanner sc = new Scanner(System.in);


    public static void main(String [] args){
        // genereeriLaud();
        // paigutaLaevad();
        // kysikasutajalt();
        // kontrollitabamust();
        // kasOnLaevaAlles();
        // gameover();
        // kysipommiasukohta();

        genereeriLaud();
        paigutaLaevad();
        kysikasutajat();
        kontrollitabamist();
        kysipommiasukohta();
    }

    private static int[] kysipommiasukohta() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("utle rea number");
            int x = sc.nextInt() - 1;
            System.out.println("utle veeru number");
            int y = sc.nextInt() -1;
            int[] xy = {x,y};
            return xy;
        }
        catch (Exception e) {
            System.out.println("Kirjuta number");
        }
        return kysipommiasukohta();
    }

    private static void kontrollitabamist(int[] xy) {
        int x = xy[0];
        int y = xy[1];
        int sihtpunkt = laud[y][x];
        if (sihtpunkt == 1) {
            System.out.println("Zavalil!");
            laud[y][x] = 2;
        } else if (sihtpunkt == 0) {
            System.out.println("Vmazal!");
        }

    }

    public static void genereeriLaud() {
        // System.out.println("jah, kaivitan");
        laud = new int[lauakorgus][laualaius];
    }

    private static void paigutaLaevad() {
        for (int i = 0; i < lauakorgus; i++) {
            for (int j = 0; j < laualaius; j++) {
                laud[i][j] =(int) Math.round(Math.random()*0.7);
            }
            System.out.println(Arrays.toString(laud[i]));
        }
    }
    private static int[] kysikasutajat() {
        System.out.println("Sisesta X ja Y koordinadid (tuhik vahel)");
        String sisestus = sc.nextLine(); //5 6
        int x = Integer.parseInt(sisestus.substring(0, 1));
        int y = Integer.parseInt(sisestus.substring(2, 3));
        System.out.println("Kasutaha sisestas x "+ x + " y " +y);
        int[] xy = new int[]{x, y};
        return xy;
    }
}
*/
