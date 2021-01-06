package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {

    public void start(Stage scherm) {
        Button button1 = new Button("Joke");
        Button button2 = new Button("Answer");
        Button button3 = new Button("Explanation");
        Label startTekst = new Label("What do you call a bear with no teeth?");

        VBox box = new VBox();
        box.setSpacing(10);
        box.getChildren().addAll(button1, button2, button3);

        box.setPadding(new Insets(10, 20, 10, 20));

        BorderPane layout = new BorderPane();
        layout.setPrefSize(200, 200);
        layout.setLeft(box);
        layout.setCenter(startTekst);

        button1.setOnAction((event) -> layout.setCenter(startTekst));
        button2.setOnAction((event) -> layout.setCenter(new Label("A gummy bear.")));
        button3.setOnAction((event) -> layout.setCenter(new Label("lulzzz")));

        Scene view = new Scene(layout);

        scherm.setScene(view);
        scherm.show();

    }

    public static void main(String[] args) {
        launch(JokeApplication.class);
    }
}