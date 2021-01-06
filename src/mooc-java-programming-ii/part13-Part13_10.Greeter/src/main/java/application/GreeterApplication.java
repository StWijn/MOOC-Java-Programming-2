package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    @Override
    public void start(Stage scherm) {
        GridPane pane = new GridPane();
        pane.setPrefSize(200, 180);
        pane.setAlignment(Pos.CENTER);
        pane.setVgap(10);
        pane.setHgap(10);
        //pane.setPadding(new Insets(20, 20, 20, 20));

        Label instructies = new Label("Wat is je naam?");
        TextField startVeld = new TextField();
        Button button = new Button("Ga verder");

        pane.add(instructies, 0, 0);
        pane.add(startVeld, 0, 1);
        pane.add(button, 0, 2);

        Label welkomTekst = new Label();

        BorderPane stack = new BorderPane();

        stack.setPrefSize(200, 180);
        //stack.getChildren().add(welkomTekst);
        stack.setCenter(welkomTekst);

        Scene startScherm = new Scene(pane);
        Scene welkomScherm = new Scene(stack);

        button.setOnAction((event) -> {
            welkomTekst.setText("Welcome " + startVeld.getText() + "!");

            scherm.setScene(welkomScherm);
        });

        scherm.setScene(startScherm);
        scherm.show();

    }

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}