package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class OefenView {

    private WoordenBoek boek;
    private String randomWoord;

    public OefenView(WoordenBoek boekje) {
        this.boek = boekje;
        //this.randomWoord = boek.getRandom();
    }

    public Parent maakLayout() {
        //maak labels en textvelden
        this.randomWoord = boek.getRandom();
        Label vertaalLabel = new Label("Vertaal het woord: \"" + this.randomWoord + "\"");
        TextField vertaalField = new TextField();
        Button b = new Button("Controleer");
        Label controleerLabel = new Label("");

        VBox box = new VBox();
        box.setSpacing(10);
        box.setPadding(new Insets(10, 10, 10, 10));
        box.setAlignment(Pos.CENTER);

        box.getChildren().addAll(vertaalLabel, vertaalField, b, controleerLabel);

        b.setOnMouseClicked((event) -> {
            String ingevoerdWoord = vertaalField.getText();

            if (this.boek.get(this.randomWoord).equals(ingevoerdWoord)) {
                controleerLabel.setText("Correct!");
            } else {
                controleerLabel.setText("Fout! De vertaling van het woord \"" + this.randomWoord + "\" is: " + this.boek.get(this.randomWoord) + ".");
            }

            this.randomWoord = this.boek.getRandom();
            vertaalLabel.setText("Vertaal het woord " + this.randomWoord);
            vertaalField.clear();
        });

        return box;
    }
}
