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
        Foor foorYlemine = new Foor(Foor.YLEMINE, primaryStage);
        Foor foorAlumine = new Foor(Foor.ALUMINE, primaryStage);
        Foor foorParem = new Foor(Foor.PAREM, primaryStage);
        Foor foorVasak = new Foor(Foor.VASAK, primaryStage);
        tsykkel(foorYlemine, 0);
        tsykkel(foorAlumine, 0);
        tsykkel(foorParem, 1);
        tsykkel(foorVasak, 1);
    }

    public void tsykkel (Foor foor, int suund) {
        int count = suund;
        while (count<10){


            if (count !=0){
                foor.vahetaPunast();
                foor.paus(7.5);
                foor.vahetaKollast();
                foor.paus(0.5);
                foor.vahetaPunast();
                foor.vahetaKollast();
            }
                foor.vahetaRohelist();
                foor.paus(3);
                foor.vahetaRohelist();
                foor.paus(0.5);
                foor.vahetaRohelist();
                foor.paus(0.5);
                foor.vahetaRohelist();
                foor.paus(0.5);
                foor.vahetaRohelist();
                foor.paus(0.5);
                foor.vahetaRohelist();
                foor.vahetaKollast();
                foor.paus(0.5);
                foor.vahetaKollast();
            count++;
            }


    }
}
