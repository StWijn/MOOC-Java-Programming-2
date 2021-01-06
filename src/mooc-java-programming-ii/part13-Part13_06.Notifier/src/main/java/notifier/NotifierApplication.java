package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {

    @Override
    public void start(Stage scherm) {

        TextField veld = new TextField();
        Button b = new Button("Kopieer");
        Label l = new Label();

        b.setOnAction((event) -> {
            l.setText(veld.getText());
        });

        VBox vDoos = new VBox();
        vDoos.setSpacing(5);
        vDoos.getChildren().addAll(veld, b, l);

        Scene scene = new Scene(vDoos);

        scherm.setScene(scene);
        scherm.show();
    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
