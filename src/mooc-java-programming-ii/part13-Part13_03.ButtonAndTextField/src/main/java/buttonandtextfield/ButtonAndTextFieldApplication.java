package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;

public class ButtonAndTextFieldApplication extends Application {

    public void start(Stage window) {
        Button b = new Button("Knop");
        TextField t = new TextField("Voer tekst in");

        FlowPane f = new FlowPane();
        f.getChildren().add(b);
        f.getChildren().add(t);

        Scene view = new Scene(f);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

}