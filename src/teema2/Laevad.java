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
    private static void kysikasutajat() {
        System.out.println("Sisesta X ja Y koordinadid (tuhik vahel)");
        String sisestus = sc.nextLine(); //5 6
        int x = (int) sisestus.charAt(0);
        int y = (int) sisestus.charAt(2);
        System.out.println("Kasutaha sisestas x "+ x + " y " +y);
    }
}
