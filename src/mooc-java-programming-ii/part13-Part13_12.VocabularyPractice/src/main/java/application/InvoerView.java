package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class InvoerView {

    private WoordenBoek boek;

    public InvoerView(WoordenBoek boekje) {
        this.boek = boekje;
    }

    public Parent maakLayout() {
        VBox box = new VBox();

        Label labelWoord = new Label("Woord");
        TextField textWoord = new TextField();
        Label labelVertaling = new Label("Vertaling");
        TextField textVertaling = new TextField();
        Button b = new Button("Voeg woord/vertaling combinatie toe");

        box.setSpacing(10);
        box.setPadding(new Insets(10, 10, 10, 10));
        box.setAlignment(Pos.CENTER);

        box.getChildren().addAll(labelWoord, textWoord, labelVertaling, textVertaling, b);

        b.setOnMouseClicked((event) -> {
            String ingevoerdWoord = textWoord.getText();
            String ingevoerdVertaling = textVertaling.getText();

            this.boek.add(ingevoerdWoord, ingevoerdVertaling);
            textWoord.clear();
            textVertaling.clear();
        });

        return box;

    }

}
