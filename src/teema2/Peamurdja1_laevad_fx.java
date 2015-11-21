/**
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
/**
public class Peamurdja1_laevad_fx extends Application {
    Stage stage;
    StackPane world;
    GridPane table;
    int shipSize = 150;
    int tableSize = 3;
    Image shipPicture = new Image("teema2/pirate.png");
    ImagePattern shipTemplate = new ImagePattern(shipPicture);


    @Override
    public void start (Stage primaryStage) throws Exception {
        stage = primaryStage;
        seadistaLava();
        gereeriGrid();
        reageeriKlikidele();
        laevasidAlles();
        gameover();
    }

    private void seadistaLava() {
        world = new StackPane();
        table = new GridPane();
        world.getChildren().add(table);
        Scene manguStseen = new Scene (world, shipSize*tableSize, shipSize*tableSize);
        stage.setScene(manguStseen);
        stage.show(); //naita aken
        stage.setOnCloseRequest(event -> {System.exit(0); }); //akna sulgedes laheb programm kinni
    }

    private void gereeriGrid() {
        for (int i = 0; i < tableSize; i++) {
            for (int j = 0; j < tableSize; j++) {
                Rectangle kvadrat = new Rectangle(shipSize, shipSize);
                int rand = (int) (Math.random() * 2);
                if (rand == 1) {kvadrat.setId("meri");
                } else {
                    kvadrat.setId("laev");
                }
                kvadrat.setFill(Color.BLUE);
                kvadrat.setStroke(Color.BLACK);
                table.add (kvadrat, i, j);
            }
        }
    }

    private void gameover() {
        Label tekst = new Label ("tubli");
        world.getChildren().add(tekst);
    }

    private boolean laevasidAlles() {
        for (Node kvadrat : table.getChildren()){
            if (kvadrat.getId().equals ("laev")) {
                return true;
            }
        }
        return false;
    }

    private void reageeriKlikidele() {
        table.setOnMouseClicked(event -> {
            Rectangle ruut = (Rectangle) event.getTarget();
            String ruutID = ruut.getId();
            if (ruutID.equals("laev")) {
                ruut.setFill(shipTemplate);
                ruut.setId("pohjas");
            } else if (ruutID.equals("meri")) {
                ruut.setFill(Color.DARKBLUE);
            } else if (ruutID.equals("pohjas")){
                System.out.println("juba lasid sinna");
            }
            if (!laevasidAlles());{
                gameover();
            }
        });
    }
<<<<<<< HEAD

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
*/
=======
}
>>>>>>> 44592773ad3885eb80bf62086b5d4c305b6bde4e
