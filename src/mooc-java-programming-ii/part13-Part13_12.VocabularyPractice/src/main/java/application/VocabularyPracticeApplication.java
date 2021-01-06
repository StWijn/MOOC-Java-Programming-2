package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

// END SOLUTION
public class VocabularyPracticeApplication extends Application {

    private WoordenBoek boekje;

    @Override
    public void init() throws Exception {
        this.boekje = new WoordenBoek();
    }

    @Override
    public void start(Stage scherm) throws Exception {
        BorderPane volledigeLayout = new BorderPane();
        volledigeLayout.setPrefWidth(400);

        HBox hbox = new HBox();

        Button invoerButton = new Button("Enter new words");
        Button oefenButton = new Button("Practice");

        hbox.setSpacing(15);
        hbox.setPadding(new Insets(10, 10, 10, 10));

        hbox.getChildren().addAll(invoerButton, oefenButton);
        volledigeLayout.setTop(hbox);

        InvoerView view1 = new InvoerView(this.boekje);
        OefenView view2 = new OefenView(this.boekje);

        invoerButton.setOnAction((event) -> volledigeLayout.setCenter(view1.maakLayout()));
        oefenButton.setOnAction((event) -> {
            // je kan geen woorden oefenen zonder eerst woorden in te voeren
            if (this.boekje.getSizeLijst() >= 1) {
                volledigeLayout.setCenter(view2.maakLayout());
            }

        });

        volledigeLayout.setCenter(view1.maakLayout());

        Scene scene = new Scene(volledigeLayout);

        scherm.setScene(scene);
        scherm.setTitle("Oefen je taal, of faal!");
        scherm.show();
    }

    public static void main(String[] args) {
        launch(VocabularyPracticeApplication.class);
    }
}
