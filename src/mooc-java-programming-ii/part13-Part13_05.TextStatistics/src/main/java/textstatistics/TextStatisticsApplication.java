package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    public BorderPane maakLayout() {
        BorderPane layout = new BorderPane();
        HBox doos = new HBox();
        doos.setSpacing(20);
        doos.getChildren().add(new Label("Letters: 0"));
        doos.getChildren().add(new Label("Words: 0"));
        doos.getChildren().add(new Label("The longest word is:"));

        layout.setBottom(doos);
        layout.setCenter(new TextArea());

        return layout;
    }

    public void start(Stage stage) {
        Scene scene = new Scene(maakLayout());

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
