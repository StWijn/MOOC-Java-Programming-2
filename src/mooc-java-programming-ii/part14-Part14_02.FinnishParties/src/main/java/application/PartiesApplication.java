package application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    @Override
    public void start(Stage scherm) {
        //maak lineChart
        NumberAxis x_As = new NumberAxis(1968, 2008, 4);
        NumberAxis y_As = new NumberAxis(0, 30, 5);

        x_As.setLabel("Jaar");
        y_As.setLabel("Stemmen");

        //aanmaken chart
        LineChart<Number, Number> chart = new LineChart<>(x_As, y_As);
        chart.setTitle("Stemmen van politieke partijen");

        //aanmaken lijst van String arrays waar alle data in opgeslagen gaat worden, die op hun beurt ingeladen worden in de chart
        ArrayList<String[]> data = new ArrayList<>();

        // data inlezen van bestand
        try {
            Files.lines(Paths.get("partiesdata.tsv")).map(regel -> regel.split("\t")).forEach(dataInStringArrays -> data.add(dataInStringArrays));
        } catch (Exception exc) {
            exc.printStackTrace();
        }

        //ingelezen data (elke regel is een politieke partij met relatief aandeel in stemmen) inladen in chart
        for (int i = 1; i < data.size(); i++) {

            XYChart.Series dataPerRegel = new XYChart.Series<>();
            dataPerRegel.setName(data.get(i)[0]);

            //alle kolommen afgaan per regel
            for (int kolom = 1; kolom < data.get(i).length; kolom++) {

                //skip incorrecte data
                if (data.get(i)[kolom].equals("-")) {
                    continue;
                }

                dataPerRegel.getData().add(new XYChart.Data(Integer.valueOf(data.get(0)[kolom]), Double.valueOf(data.get(i)[kolom])));

            }

            chart.getData().add(dataPerRegel);
        }

        Scene scene = new Scene(chart, 400, 400);
        scherm.setScene(scene);
        scherm.show();
    }

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }
}
