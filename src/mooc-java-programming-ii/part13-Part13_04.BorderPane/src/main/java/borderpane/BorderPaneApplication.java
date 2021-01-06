package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneApplication extends Application {

    public BorderPane layout() {
        BorderPane pane = new BorderPane();

        Label tekstN = new Label("NORTH");
        Label tekstE = new Label("EAST");
        Label tekstS = new Label("SOUTH");
        pane.setTop(tekstN);
        pane.setRight(tekstE);
        pane.setBottom(tekstS);

        return pane;
    }

    public void start(Stage scherm) {
        Scene scene = new Scene(layout());

        scherm.setTitle("Programmatje");
        scherm.setScene(scene);
        scherm.show();
    }

    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
    }

}
