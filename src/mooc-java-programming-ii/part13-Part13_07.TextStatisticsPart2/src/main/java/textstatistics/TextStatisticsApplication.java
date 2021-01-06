package textstatistics;

import java.util.Arrays;
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
        doos.setSpacing(10);

        Label label1 = new Label("Karakters: 0");
        Label label2 = new Label("Woorden: 0");
        Label label3 = new Label("Langste woord: ");
        Label label4 = new Label("Karakters van langste woord: ");

        TextArea textRuimte = new TextArea();

        textRuimte.textProperty().addListener((change, oldValue, newValue) -> {

            int aantalKarakters = newValue.length();

            //optellen totaal aantal karakters
            label1.setText("Karakters: " + aantalKarakters);

            String[] parts = newValue.split(" ");
            int words = parts.length;

            //optellen aantal woorden
            label2.setText("Woorden: " + words);

            String langste = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            //weergeven langste woord
            label3.setText("Langste woord: " + langste);

            //weergeven aantal karakters van langste woord
            label4.setText("Karakters van langste woord: " + langste.length());
        });

        layout.setCenter(textRuimte);

        doos.getChildren().add(label1);
        doos.getChildren().add(label2);
        doos.getChildren().add(label3);
        doos.getChildren().add(label4);

        layout.setBottom(doos);

        return layout;
    }

    public void start(Stage stage) {
        Scene scene = new Scene(maakLayout());

        stage.setScene(scene);
        stage.setTitle("Teller");
        stage.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
