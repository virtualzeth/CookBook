package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import component.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("MainView.fxml"));
        primaryStage.setTitle("Cook Book");
        primaryStage.setScene(new Scene(root, 700, 675));
        Recipe recipe = new Recipe("Te med ingefær, honning, citron og hvidløg", new String[]{"1 citron","3 dl vand",
                "5 cm ingefær","1 fed presset hvidløg"}, "1. Kom en hel citron skåret i fire både i en gryde fyldt " +
                "med 3 dl kogende vand. Tilsæt ca. 5 cm frisk ingefær. Lad blandingen koge op i 1 minuts tid. Tag " +
                "det af varmen og lad det hvile i 10 min. 1 fed presset hvidløg blandes i sammen med 1 spsk. honning.",
                "Du kan også variere teen og tilsætte en knivspids cayenne peber (for at løsne slim) eller komme andre " +
                        "lindrende krydderier i som f.eks. kanel eller nelliker.");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
