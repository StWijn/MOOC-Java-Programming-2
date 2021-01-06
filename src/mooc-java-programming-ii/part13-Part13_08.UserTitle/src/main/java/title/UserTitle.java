package title;

import javafx.application.Application;
import javafx.application.Application.Parameters;
import javafx.stage.Stage;

public class UserTitle extends Application {

    @Override
    public void start(Stage scherm) {
        Parameters param = getParameters();
        String titel = param.getNamed().get("titel");

        scherm.setTitle(titel);
        scherm.show();
    }
}
