package OOP_Pommitamine;

import java.util.Scanner;

/**
 * Created by mtseljab on 21.11.15.
 */
public class Mangija {
    private Scanner sc = new Scanner(System.in);

    public int[] kuhuLasta() {
        System.out.println("sisesta koordinadid kuhu lasta formaadis xxx-yyy");
        String[] input = sc.nextLine().split("-");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        return new int[0];
    }

    public void pihtas() {
        System.out.println("sai pihta");
    }

    public void moodas() {
        System.out.println("sai mooda");
    }

    public void gameover() {
        System.out.println("game over");
    }
}
