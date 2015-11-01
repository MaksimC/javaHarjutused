package teema2;


import com.sun.org.apache.regexp.internal.REDebugCompiler;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



/**
 * 1. Joonista eesti lipp kasutades kolme Rectangle
 * 2. Joonista Jaapani lipp kasutades Rectangle ja Circle
 */



public class Harjutus1_lipud extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene stseen = new Scene(pane, 500, 500);
        primaryStage.setScene(stseen);
        stseen.setFill(Color.GRAY);

        Rectangle must = new Rectangle(100, 200, 300, 100);
        pane.getChildren().add(must);
        must.setFill(Color.BLACK);

        Rectangle sinine = new Rectangle(100, 100, 300, 100);
        pane.getChildren().add(sinine);
        sinine.setFill(Color.BLUE);

        Rectangle valge = new Rectangle(100, 300, 300, 100);
        pane.getChildren().add(valge);
        valge.setFill(Color.WHITE);

        primaryStage.show();

        Stage aken2 = new Stage();
        Pane pane2 = new Pane();
        Scene stseen2 = new Scene(pane2, 500, 500);
        stseen2.setFill(Color.WHITE);
        aken2.setScene(stseen2);

        Circle redring = new Circle (200, 200, 100);
        redring.setFill(Color.RED);
        pane2.getChildren().add(redring);

        aken2.show();

    }
}

