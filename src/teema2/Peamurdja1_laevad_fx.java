package teema2;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Joonista laevade pommitamine kasutades JavaFXi.
 */
public class Peamurdja1_laevad_fx extends Application {
    Stage lava;
    GridPane laud;
    int laevaServaPikkus = 150;
    int lauaPikkus = 3;

    @Override

    public void start (Stage primaryStage) throws Exception {
        lava = primaryStage;
        seadistaLava();
        gereeriGrid();
        reageeriKlikidele();
        laevasidAlles();
        gameover();

    }

    private void gameover() {
        Label tekst = new Label ("tubli");
        maailm.getChildren().add(tekst);

    }

    private boolean laevasidAlles() {
        for (Node ruut : laud.getChildren()){
            if (ruut.getId().equals ("laev")) {
                return true;
            }
        }
        return false;
    }

    private void reageeriKlikidele() {
        laud.setOnMouseClicked(event -> {
            Rectangle ruut = (Rectangle) event.getTarget();
            String ruutId = ruut.getId();
            if (ruutId.equals ("laev")) {
                ruut.setFill(Color.RED);
                ruut.setId("pohjas");
                System.out.println("pihtas!");
            } else if (ruutId.equals("meri")); {
                ruut.setFill(Color.DARKBLUE);
                System.out.println("mooda!");
            } else if (ruutId.equals("pohjas"));{
                System.out.println("juba lasid sinna");
            }
            if (!laevasidAlles()) {
                System.out.println("GAME OVER");
                gameover();
            }
        });
    }

    private void gereeriGrid() {
        for (int i = 0; i < lauaPikkus; i++) {
            for (int j = 0; j < lauaPikkus; j++) {
                Rectangle ruut = new Rectangle(laud, laevaServaPikkus, laevaServaPikkus);
                int rand = (int) (Math.random() * 2);
                if (rand == 1) {
                    ruut.setId("meri");
                } else {
                    ruut.setId("laev");
                }
                ruut.setFill(Color.BLUE);
                ruut.setStroke(Color.BLACK);
                laud.add (ruut, i, j);
            }

        }

    }

    private void seadistaLava() {
        maailm = new StackPane;
        laud = new GridPane();
        maailm.getChildren
        Scene manguStseen = new Scene (maailm, lauaPikkus*lauaSer, lauaPikkus);
        lava.setScene(manguStseen);
        lava.show(); //naita aken
        lava.setOnCloseRequest(event -> {System.exit(0); }); //akna sulgedes laheb programm kinni
    }
}
