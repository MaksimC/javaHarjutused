package LoginDB;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by mtseljab on 22.11.15.
 */
public class LoginScreen {
    public LoginScreen() {

        Stage stage = new Stage();              //Setup stage
        VBox vbox = new VBox();                 //layout
        Scene scene = new Scene(vbox);              //Setup scene
        Label kasutajaLabel = new Label("Kasutajanimi");      //Scene1 elements
        Label parooliLabel = new Label("Parool");      //Scene1 elements
        TextField kasutajaInput = new TextField();
        TextField paroolInput = new TextField();
        Button logiButton = new Button("Logi sisse");
        Button registerButton = new Button("registreeri");

        vbox.getChildren().addAll(kasutajaLabel, kasutajaInput, parooliLabel, paroolInput, logiButton, registerButton);

        stage.setScene(scene);
        stage.show();

        registerButton.setOnAction(e -> {
            String kasutajaNimi = kasutajaInput.getText();
            String parool = kasutajaInput.getText();
        });

    }
}
