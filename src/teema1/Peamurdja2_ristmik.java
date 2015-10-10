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
        roheliseks(foor1);

    }

    public void roheliseks(Foor misiganes) {

        misiganes.vahetaPunast();
        misiganes.paus(0.5);
        misiganes.vahetaKollast();
        misiganes.paus(0.5);
        misiganes.vahetaPunast();
        misiganes.vahetaKollast();
        misiganes.vahetaRohelist();

    }
}

