package application;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    public static Map<Integer, Integer> maakMap(String file) {
        Map<Integer, Integer> mapje = new HashMap<>();

        //lees .txt bestand
        try {
            Files.lines(Paths.get(file)).forEach((rij) -> {
                String[] arr = rij.split(" ");
                mapje.put(Integer.valueOf(arr[0]), Integer.valueOf(arr[1]));
            });
        } catch (Exception exc) {
            exc.printStackTrace();
        }
        return mapje;
    }

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        NumberAxis x_As = new NumberAxis(2005, 2020, 4);
        NumberAxis y_As = new NumberAxis(50, 90, 4);

        x_As.setLabel("Year");
        y_As.setLabel("Ranking");

        LineChart<Number, Number> chart = new LineChart<>(x_As, y_As);

        //maak dataset aan om te laden in chart
        XYChart.Series data = new XYChart.Series();
        data.setName("TESTJE");

        //lees bestand, zet om in hashmap en laad in chart
        maakMap("universiteit_data.txt").entrySet().stream().forEach(hashMap_naar_data -> {
            data.getData().add(new XYChart.Data(hashMap_naar_data.getKey(), hashMap_naar_data.getValue()));
        });

        chart.getData().add(data);
        Scene view = new Scene(chart, 640, 480);
        stage.setScene(view);
        stage.show();
    }

}
