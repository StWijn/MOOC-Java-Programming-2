package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public void start(Stage scherm) {

        //view 1
        BorderPane layout1 = new BorderPane();
        Button knop = new Button("To the second view!");

        layout1.setTop(new Label("First view!"));
        layout1.setCenter(knop);

        //view 2
        VBox box = new VBox();
        Button knopV2 = new Button("To the third view!");
        box.getChildren().add(knopV2);
        box.getChildren().add(new Label("Second view!"));

        //view 3
        GridPane grid = new GridPane();
        Button knopV3 = new Button("To the first view!");
        grid.add(new Label("Third view!"), 0, 0);
        grid.add(knopV3, 1, 1);

        Scene scene1 = new Scene(layout1);
        Scene scene2 = new Scene(box);
        Scene scene3 = new Scene(grid);

        knop.setOnAction((event) -> scherm.setScene(scene2));
        knopV2.setOnAction((event) -> scherm.setScene(scene3));
        knopV3.setOnAction((event) -> scherm.setScene(scene1));

        scherm.setScene(scene1);
        scherm.show();

    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
