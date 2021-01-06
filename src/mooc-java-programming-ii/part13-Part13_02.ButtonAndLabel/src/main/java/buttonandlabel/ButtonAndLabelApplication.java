package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.util.concurrent.Flow;

public class ButtonAndLabelApplication extends Application {


    @Override
    public void start(Stage stage) {
        Button knopje = new Button("Knop");
        Label label = new Label("Dit is een label");

        FlowPane componenten = new FlowPane();
        componenten.getChildren().add(knopje);

        Scene scene = new Scene(componenten);

        stage.setTitle("Hallo, dit is een basis UI!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
       launch(ButtonAndLabelApplication.class);
    }

}
