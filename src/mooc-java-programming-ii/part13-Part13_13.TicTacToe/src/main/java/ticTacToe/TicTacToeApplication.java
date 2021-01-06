package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    @Override
    public void start(Stage scherm) {
        BorderPane borderPane = new BorderPane();
        GridPane grid = new GridPane();

        //label bovenin, wie is er aan de beurt?
        Label turnLabel = new Label("Turn: X");
        turnLabel.setFont(Font.font("Monospaced", 40));

        //buttons
        Button topLinks = new Button(" ");
        topLinks.setFont(Font.font("Monospaced", 40));

        Button topMidden = new Button(" ");
        topMidden.setFont(Font.font("Monospaced", 40));

        Button topRechts = new Button(" ");
        topRechts.setFont(Font.font("Monospaced", 40));

        Button midLinks = new Button(" ");
        midLinks.setFont(Font.font("Monospaced", 40));

        Button midMidden = new Button(" ");
        midMidden.setFont(Font.font("Monospaced", 40));

        Button midRechts = new Button(" ");
        midRechts.setFont(Font.font("Monospaced", 40));

        Button onderLinks = new Button(" ");
        onderLinks.setFont(Font.font("Monospaced", 40));

        Button onderMidden = new Button(" ");
        onderMidden.setFont(Font.font("Monospaced", 40));

        Button onderRechts = new Button(" ");
        onderRechts.setFont(Font.font("Monospaced", 40));

        //add buttons aan grid
        grid.add(topLinks, 0, 0);
        grid.add(topMidden, 1, 0);
        grid.add(topRechts, 2, 0);
        grid.add(midLinks, 0, 1);
        grid.add(midMidden, 1, 1);
        grid.add(midRechts, 2, 1);
        grid.add(onderLinks, 0, 2);
        grid.add(onderMidden, 1, 2);
        grid.add(onderRechts, 2, 2);

        //functionaliteit buttons
        topLinks.setOnAction((event) -> {
            String[] split = turnLabel.getText().split(" ");
            String beurt = split[1];

            if (topLinks.getText().equals(" ")) {
                topLinks.setText(beurt);
                if (beurt.equals("X")) {
                    turnLabel.setText("Turn: O");
                } else if (beurt.equals("O")) {
                    turnLabel.setText("Turn: X");
                }
            }

            //Functionaliteit Einde van de Game
            if ((topLinks.getText().equals("X") && topMidden.getText().equals("X") && topRechts.getText().equals("X"))
                    || (topLinks.getText().equals("O") && topMidden.getText().equals("O") && topRechts.getText().equals("O"))
                    || (midLinks.getText().equals("X") && midMidden.getText().equals("X") && midRechts.getText().equals("X"))
                    || (midLinks.getText().equals("O") && midMidden.getText().equals("O") && midRechts.getText().equals("O"))
                    || (onderLinks.getText().equals("X") && onderMidden.getText().equals("X") && onderRechts.getText().equals("X"))
                    || (onderLinks.getText().equals("O") && onderMidden.getText().equals("O") && onderRechts.getText().equals("O"))
                    || (topLinks.getText().equals("X") && midMidden.getText().equals("X") && onderRechts.getText().equals("X"))
                    || (topLinks.getText().equals("O") && midMidden.getText().equals("O") && onderRechts.getText().equals("O"))
                    || (topRechts.getText().equals("X") && midMidden.getText().equals("X") && onderLinks.getText().equals("X"))
                    || (topRechts.getText().equals("O") && midMidden.getText().equals("O") && onderLinks.getText().equals("O"))
                    || (topLinks.getText().equals("X") && midLinks.getText().equals("X") && onderLinks.getText().equals("X"))
                    || (topLinks.getText().equals("O") && midLinks.getText().equals("O") && onderLinks.getText().equals("O"))
                    || (topMidden.getText().equals("X") && midMidden.getText().equals("X") && onderMidden.getText().equals("X"))
                    || (topMidden.getText().equals("O") && midMidden.getText().equals("O") && onderMidden.getText().equals("O"))
                    || (topRechts.getText().equals("X") && midRechts.getText().equals("X") && onderRechts.getText().equals("X"))
                    || (topRechts.getText().equals("O") && midRechts.getText().equals("O") && onderRechts.getText().equals("O"))) {
                turnLabel.setText("The end!");
            }

        });

        //topmidden
        topMidden.setOnAction((event) -> {
            String[] split = turnLabel.getText().split(" ");
            String beurt = split[1];

            if (topMidden.getText().equals(" ")) {
                topMidden.setText(beurt);
                if (beurt.equals("X")) {
                    turnLabel.setText("Turn: O");
                } else if (beurt.equals("O")) {
                    turnLabel.setText("Turn: X");
                }
            }
            //Functionaliteit Einde van de Game
            if ((topLinks.getText().equals("X") && topMidden.getText().equals("X") && topRechts.getText().equals("X"))
                    || (topLinks.getText().equals("O") && topMidden.getText().equals("O") && topRechts.getText().equals("O"))
                    || (midLinks.getText().equals("X") && midMidden.getText().equals("X") && midRechts.getText().equals("X"))
                    || (midLinks.getText().equals("O") && midMidden.getText().equals("O") && midRechts.getText().equals("O"))
                    || (onderLinks.getText().equals("X") && onderMidden.getText().equals("X") && onderRechts.getText().equals("X"))
                    || (onderLinks.getText().equals("O") && onderMidden.getText().equals("O") && onderRechts.getText().equals("O"))
                    || (topLinks.getText().equals("X") && midMidden.getText().equals("X") && onderRechts.getText().equals("X"))
                    || (topLinks.getText().equals("O") && midMidden.getText().equals("O") && onderRechts.getText().equals("O"))
                    || (topRechts.getText().equals("X") && midMidden.getText().equals("X") && onderLinks.getText().equals("X"))
                    || (topRechts.getText().equals("O") && midMidden.getText().equals("O") && onderLinks.getText().equals("O"))
                    || (topLinks.getText().equals("X") && midLinks.getText().equals("X") && onderLinks.getText().equals("X"))
                    || (topLinks.getText().equals("O") && midLinks.getText().equals("O") && onderLinks.getText().equals("O"))
                    || (topMidden.getText().equals("X") && midMidden.getText().equals("X") && onderMidden.getText().equals("X"))
                    || (topMidden.getText().equals("O") && midMidden.getText().equals("O") && onderMidden.getText().equals("O"))
                    || (topRechts.getText().equals("X") && midRechts.getText().equals("X") && onderRechts.getText().equals("X"))
                    || (topRechts.getText().equals("O") && midRechts.getText().equals("O") && onderRechts.getText().equals("O"))) {
                turnLabel.setText("The end!");
            }
        });

        //toprechts
        topRechts.setOnAction((event) -> {
            String[] split = turnLabel.getText().split(" ");
            String beurt = split[1];

            if (topRechts.getText().equals(" ")) {
                topRechts.setText(beurt);
                if (beurt.equals("X")) {
                    turnLabel.setText("Turn: O");
                } else if (beurt.equals("O")) {
                    turnLabel.setText("Turn: X");
                }
            }
            //Functionaliteit Einde van de Game
            if ((topLinks.getText().equals("X") && topMidden.getText().equals("X") && topRechts.getText().equals("X"))
                    || (topLinks.getText().equals("O") && topMidden.getText().equals("O") && topRechts.getText().equals("O"))
                    || (midLinks.getText().equals("X") && midMidden.getText().equals("X") && midRechts.getText().equals("X"))
                    || (midLinks.getText().equals("O") && midMidden.getText().equals("O") && midRechts.getText().equals("O"))
                    || (onderLinks.getText().equals("X") && onderMidden.getText().equals("X") && onderRechts.getText().equals("X"))
                    || (onderLinks.getText().equals("O") && onderMidden.getText().equals("O") && onderRechts.getText().equals("O"))
                    || (topLinks.getText().equals("X") && midMidden.getText().equals("X") && onderRechts.getText().equals("X"))
                    || (topLinks.getText().equals("O") && midMidden.getText().equals("O") && onderRechts.getText().equals("O"))
                    || (topRechts.getText().equals("X") && midMidden.getText().equals("X") && onderLinks.getText().equals("X"))
                    || (topRechts.getText().equals("O") && midMidden.getText().equals("O") && onderLinks.getText().equals("O"))
                    || (topLinks.getText().equals("X") && midLinks.getText().equals("X") && onderLinks.getText().equals("X"))
                    || (topLinks.getText().equals("O") && midLinks.getText().equals("O") && onderLinks.getText().equals("O"))
                    || (topMidden.getText().equals("X") && midMidden.getText().equals("X") && onderMidden.getText().equals("X"))
                    || (topMidden.getText().equals("O") && midMidden.getText().equals("O") && onderMidden.getText().equals("O"))
                    || (topRechts.getText().equals("X") && midRechts.getText().equals("X") && onderRechts.getText().equals("X"))
                    || (topRechts.getText().equals("O") && midRechts.getText().equals("O") && onderRechts.getText().equals("O"))) {
                turnLabel.setText("The end!");
            }
        });

        //midlinks
        midLinks.setOnAction((event) -> {
            String[] split = turnLabel.getText().split(" ");
            String beurt = split[1];

            if (midLinks.getText().equals(" ")) {
                midLinks.setText(beurt);
                if (beurt.equals("X")) {
                    turnLabel.setText("Turn: O");
                } else if (beurt.equals("O")) {
                    turnLabel.setText("Turn: X");
                }
            }

            //Functionaliteit Einde van de Game
            if ((topLinks.getText().equals("X") && topMidden.getText().equals("X") && topRechts.getText().equals("X"))
                    || (topLinks.getText().equals("O") && topMidden.getText().equals("O") && topRechts.getText().equals("O"))
                    || (midLinks.getText().equals("X") && midMidden.getText().equals("X") && midRechts.getText().equals("X"))
                    || (midLinks.getText().equals("O") && midMidden.getText().equals("O") && midRechts.getText().equals("O"))
                    || (onderLinks.getText().equals("X") && onderMidden.getText().equals("X") && onderRechts.getText().equals("X"))
                    || (onderLinks.getText().equals("O") && onderMidden.getText().equals("O") && onderRechts.getText().equals("O"))
                    || (topLinks.getText().equals("X") && midMidden.getText().equals("X") && onderRechts.getText().equals("X"))
                    || (topLinks.getText().equals("O") && midMidden.getText().equals("O") && onderRechts.getText().equals("O"))
                    || (topRechts.getText().equals("X") && midMidden.getText().equals("X") && onderLinks.getText().equals("X"))
                    || (topRechts.getText().equals("O") && midMidden.getText().equals("O") && onderLinks.getText().equals("O"))
                    || (topLinks.getText().equals("X") && midLinks.getText().equals("X") && onderLinks.getText().equals("X"))
                    || (topLinks.getText().equals("O") && midLinks.getText().equals("O") && onderLinks.getText().equals("O"))
                    || (topMidden.getText().equals("X") && midMidden.getText().equals("X") && onderMidden.getText().equals("X"))
                    || (topMidden.getText().equals("O") && midMidden.getText().equals("O") && onderMidden.getText().equals("O"))
                    || (topRechts.getText().equals("X") && midRechts.getText().equals("X") && onderRechts.getText().equals("X"))
                    || (topRechts.getText().equals("O") && midRechts.getText().equals("O") && onderRechts.getText().equals("O"))) {
                turnLabel.setText("The end!");
            }
        });

        //midMidden
        midMidden.setOnAction((event) -> {
            String[] split = turnLabel.getText().split(" ");
            String beurt = split[1];

            if (midMidden.getText().equals(" ")) {
                midMidden.setText(beurt);
                if (beurt.equals("X")) {
                    turnLabel.setText("Turn: O");
                } else if (beurt.equals("O")) {
                    turnLabel.setText("Turn: X");
                }
            }

            //Functionaliteit Einde van de Game
            if ((topLinks.getText().equals("X") && topMidden.getText().equals("X") && topRechts.getText().equals("X"))
                    || (topLinks.getText().equals("O") && topMidden.getText().equals("O") && topRechts.getText().equals("O"))
                    || (midLinks.getText().equals("X") && midMidden.getText().equals("X") && midRechts.getText().equals("X"))
                    || (midLinks.getText().equals("O") && midMidden.getText().equals("O") && midRechts.getText().equals("O"))
                    || (onderLinks.getText().equals("X") && onderMidden.getText().equals("X") && onderRechts.getText().equals("X"))
                    || (onderLinks.getText().equals("O") && onderMidden.getText().equals("O") && onderRechts.getText().equals("O"))
                    || (topLinks.getText().equals("X") && midMidden.getText().equals("X") && onderRechts.getText().equals("X"))
                    || (topLinks.getText().equals("O") && midMidden.getText().equals("O") && onderRechts.getText().equals("O"))
                    || (topRechts.getText().equals("X") && midMidden.getText().equals("X") && onderLinks.getText().equals("X"))
                    || (topRechts.getText().equals("O") && midMidden.getText().equals("O") && onderLinks.getText().equals("O"))
                    || (topLinks.getText().equals("X") && midLinks.getText().equals("X") && onderLinks.getText().equals("X"))
                    || (topLinks.getText().equals("O") && midLinks.getText().equals("O") && onderLinks.getText().equals("O"))
                    || (topMidden.getText().equals("X") && midMidden.getText().equals("X") && onderMidden.getText().equals("X"))
                    || (topMidden.getText().equals("O") && midMidden.getText().equals("O") && onderMidden.getText().equals("O"))
                    || (topRechts.getText().equals("X") && midRechts.getText().equals("X") && onderRechts.getText().equals("X"))
                    || (topRechts.getText().equals("O") && midRechts.getText().equals("O") && onderRechts.getText().equals("O"))) {
                turnLabel.setText("The end!");
            }
        });

        //midRechts
        midRechts.setOnAction((event) -> {
            String[] split = turnLabel.getText().split(" ");
            String beurt = split[1];

            if (midRechts.getText().equals(" ")) {
                midRechts.setText(beurt);
                if (beurt.equals("X")) {
                    turnLabel.setText("Turn: O");
                } else if (beurt.equals("O")) {
                    turnLabel.setText("Turn: X");
                }
            }

            //Functionaliteit Einde van de Game
            if ((topLinks.getText().equals("X") && topMidden.getText().equals("X") && topRechts.getText().equals("X"))
                    || (topLinks.getText().equals("O") && topMidden.getText().equals("O") && topRechts.getText().equals("O"))
                    || (midLinks.getText().equals("X") && midMidden.getText().equals("X") && midRechts.getText().equals("X"))
                    || (midLinks.getText().equals("O") && midMidden.getText().equals("O") && midRechts.getText().equals("O"))
                    || (onderLinks.getText().equals("X") && onderMidden.getText().equals("X") && onderRechts.getText().equals("X"))
                    || (onderLinks.getText().equals("O") && onderMidden.getText().equals("O") && onderRechts.getText().equals("O"))
                    || (topLinks.getText().equals("X") && midMidden.getText().equals("X") && onderRechts.getText().equals("X"))
                    || (topLinks.getText().equals("O") && midMidden.getText().equals("O") && onderRechts.getText().equals("O"))
                    || (topRechts.getText().equals("X") && midMidden.getText().equals("X") && onderLinks.getText().equals("X"))
                    || (topRechts.getText().equals("O") && midMidden.getText().equals("O") && onderLinks.getText().equals("O"))
                    || (topLinks.getText().equals("X") && midLinks.getText().equals("X") && onderLinks.getText().equals("X"))
                    || (topLinks.getText().equals("O") && midLinks.getText().equals("O") && onderLinks.getText().equals("O"))
                    || (topMidden.getText().equals("X") && midMidden.getText().equals("X") && onderMidden.getText().equals("X"))
                    || (topMidden.getText().equals("O") && midMidden.getText().equals("O") && onderMidden.getText().equals("O"))
                    || (topRechts.getText().equals("X") && midRechts.getText().equals("X") && onderRechts.getText().equals("X"))
                    || (topRechts.getText().equals("O") && midRechts.getText().equals("O") && onderRechts.getText().equals("O"))) {
                turnLabel.setText("The end!");
            }
        });

        //onderLinks
        onderLinks.setOnAction((event) -> {
            String[] split = turnLabel.getText().split(" ");
            String beurt = split[1];

            if (onderLinks.getText().equals(" ")) {
                onderLinks.setText(beurt);
                if (beurt.equals("X")) {
                    turnLabel.setText("Turn: O");
                } else if (beurt.equals("O")) {
                    turnLabel.setText("Turn: X");
                }
            }

            //Functionaliteit Einde van de Game
            if ((topLinks.getText().equals("X") && topMidden.getText().equals("X") && topRechts.getText().equals("X"))
                    || (topLinks.getText().equals("O") && topMidden.getText().equals("O") && topRechts.getText().equals("O"))
                    || (midLinks.getText().equals("X") && midMidden.getText().equals("X") && midRechts.getText().equals("X"))
                    || (midLinks.getText().equals("O") && midMidden.getText().equals("O") && midRechts.getText().equals("O"))
                    || (onderLinks.getText().equals("X") && onderMidden.getText().equals("X") && onderRechts.getText().equals("X"))
                    || (onderLinks.getText().equals("O") && onderMidden.getText().equals("O") && onderRechts.getText().equals("O"))
                    || (topLinks.getText().equals("X") && midMidden.getText().equals("X") && onderRechts.getText().equals("X"))
                    || (topLinks.getText().equals("O") && midMidden.getText().equals("O") && onderRechts.getText().equals("O"))
                    || (topRechts.getText().equals("X") && midMidden.getText().equals("X") && onderLinks.getText().equals("X"))
                    || (topRechts.getText().equals("O") && midMidden.getText().equals("O") && onderLinks.getText().equals("O"))
                    || (topLinks.getText().equals("X") && midLinks.getText().equals("X") && onderLinks.getText().equals("X"))
                    || (topLinks.getText().equals("O") && midLinks.getText().equals("O") && onderLinks.getText().equals("O"))
                    || (topMidden.getText().equals("X") && midMidden.getText().equals("X") && onderMidden.getText().equals("X"))
                    || (topMidden.getText().equals("O") && midMidden.getText().equals("O") && onderMidden.getText().equals("O"))
                    || (topRechts.getText().equals("X") && midRechts.getText().equals("X") && onderRechts.getText().equals("X"))
                    || (topRechts.getText().equals("O") && midRechts.getText().equals("O") && onderRechts.getText().equals("O"))) {
                turnLabel.setText("The end!");
            }
        });

        //onderMidden
        onderMidden.setOnAction((event) -> {
            String[] split = turnLabel.getText().split(" ");
            String beurt = split[1];

            if (onderMidden.getText().equals(" ")) {
                onderMidden.setText(beurt);
                if (beurt.equals("X")) {
                    turnLabel.setText("Turn: O");
                } else if (beurt.equals("O")) {
                    turnLabel.setText("Turn: X");
                }
            }

            //Functionaliteit Einde van de Game
            if ((topLinks.getText().equals("X") && topMidden.getText().equals("X") && topRechts.getText().equals("X"))
                    || (topLinks.getText().equals("O") && topMidden.getText().equals("O") && topRechts.getText().equals("O"))
                    || (midLinks.getText().equals("X") && midMidden.getText().equals("X") && midRechts.getText().equals("X"))
                    || (midLinks.getText().equals("O") && midMidden.getText().equals("O") && midRechts.getText().equals("O"))
                    || (onderLinks.getText().equals("X") && onderMidden.getText().equals("X") && onderRechts.getText().equals("X"))
                    || (onderLinks.getText().equals("O") && onderMidden.getText().equals("O") && onderRechts.getText().equals("O"))
                    || (topLinks.getText().equals("X") && midMidden.getText().equals("X") && onderRechts.getText().equals("X"))
                    || (topLinks.getText().equals("O") && midMidden.getText().equals("O") && onderRechts.getText().equals("O"))
                    || (topRechts.getText().equals("X") && midMidden.getText().equals("X") && onderLinks.getText().equals("X"))
                    || (topRechts.getText().equals("O") && midMidden.getText().equals("O") && onderLinks.getText().equals("O"))
                    || (topLinks.getText().equals("X") && midLinks.getText().equals("X") && onderLinks.getText().equals("X"))
                    || (topLinks.getText().equals("O") && midLinks.getText().equals("O") && onderLinks.getText().equals("O"))
                    || (topMidden.getText().equals("X") && midMidden.getText().equals("X") && onderMidden.getText().equals("X"))
                    || (topMidden.getText().equals("O") && midMidden.getText().equals("O") && onderMidden.getText().equals("O"))
                    || (topRechts.getText().equals("X") && midRechts.getText().equals("X") && onderRechts.getText().equals("X"))
                    || (topRechts.getText().equals("O") && midRechts.getText().equals("O") && onderRechts.getText().equals("O"))) {
                turnLabel.setText("The end!");
            }
        });

        //onderRechts
        onderRechts.setOnAction((event) -> {
            String[] split = turnLabel.getText().split(" ");
            String beurt = split[1];

            if (onderRechts.getText().equals(" ")) {
                onderRechts.setText(beurt);
                if (beurt.equals("X")) {
                    turnLabel.setText("Turn: O");
                } else if (beurt.equals("O")) {
                    turnLabel.setText("Turn: X");
                }
            }

            //Functionaliteit Einde van de Game
            if ((topLinks.getText().equals("X") && topMidden.getText().equals("X") && topRechts.getText().equals("X"))
                    || (topLinks.getText().equals("O") && topMidden.getText().equals("O") && topRechts.getText().equals("O"))
                    || (midLinks.getText().equals("X") && midMidden.getText().equals("X") && midRechts.getText().equals("X"))
                    || (midLinks.getText().equals("O") && midMidden.getText().equals("O") && midRechts.getText().equals("O"))
                    || (onderLinks.getText().equals("X") && onderMidden.getText().equals("X") && onderRechts.getText().equals("X"))
                    || (onderLinks.getText().equals("O") && onderMidden.getText().equals("O") && onderRechts.getText().equals("O"))
                    || (topLinks.getText().equals("X") && midMidden.getText().equals("X") && onderRechts.getText().equals("X"))
                    || (topLinks.getText().equals("O") && midMidden.getText().equals("O") && onderRechts.getText().equals("O"))
                    || (topRechts.getText().equals("X") && midMidden.getText().equals("X") && onderLinks.getText().equals("X"))
                    || (topRechts.getText().equals("O") && midMidden.getText().equals("O") && onderLinks.getText().equals("O"))
                    || (topLinks.getText().equals("X") && midLinks.getText().equals("X") && onderLinks.getText().equals("X"))
                    || (topLinks.getText().equals("O") && midLinks.getText().equals("O") && onderLinks.getText().equals("O"))
                    || (topMidden.getText().equals("X") && midMidden.getText().equals("X") && onderMidden.getText().equals("X"))
                    || (topMidden.getText().equals("O") && midMidden.getText().equals("O") && onderMidden.getText().equals("O"))
                    || (topRechts.getText().equals("X") && midRechts.getText().equals("X") && onderRechts.getText().equals("X"))
                    || (topRechts.getText().equals("O") && midRechts.getText().equals("O") && onderRechts.getText().equals("O"))) {
                turnLabel.setText("The end!");
            }

        });

        borderPane.setTop(turnLabel);
        borderPane.setCenter(grid);
        borderPane.setPadding(new Insets(10, 10, 10, 10));

        Scene scene = new Scene(borderPane);
        scherm.setScene(scene);
        scherm.show();
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);

    }

}
