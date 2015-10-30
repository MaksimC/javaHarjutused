package teema2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by mtseljab on 30.10.15.
 */
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

        genereeriLaud();
        paigutaLaevad();
        kysikasutajat();
        kontrollitabamist();
    }

    private static void kontrollitabamist() {
        int tabamus = (laud[xy[0]][xy[1]]);
        if (tabamus == 0) {
            System.out.println("laks mooda");

        } else if (tabamus == )
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
