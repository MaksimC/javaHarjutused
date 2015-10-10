package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

/**
 * Täpselt nagu oli fooriga, on nüüd ristmikuga. Kuidas esiteks
 * ristmik üles ehitada loe Foori README.md-st: https://github.com/KristerV/javaHarjutused
 */
public class Peamurdja2_ristmik  extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Foor foor1 = new Foor(Foor.YLEMINE, primaryStage);
        foor1.vahetaPunast();
        foor1.paus(0.5);

        Foor foor2 = new Foor(Foor.ALUMINE, primaryStage);
        foor2.vahetaPunast();
        foor2.paus(0.5);
        Foor foor3 = new Foor(Foor.PAREM, primaryStage);
        foor3.vahetaPunast();
        foor3.paus(0.5);
        Foor foor4 = new Foor(Foor.VASAK, primaryStage);
        foor4.vahetaPunast();
        foor4.paus(0.5);

        roheliseks (foor1);
        roheliseks(foor1);
        roheliseks(foor1);
        roheliseks(foor1);

        public void roheliseks(Foor misiganes) {

    }
    }
    }

