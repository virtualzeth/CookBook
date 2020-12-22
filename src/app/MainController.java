package app;

import component.Recipe;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    private List<Recipe> recipeList;

    @FXML
    private ListView recipeListView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // EXAMPLE Array
        Recipe[] recipes = {new Recipe("Te med ingefær, honning, citron og hvidløg", new String[]{"1 citron","3 dl vand",
                "5 cm ingefær","1 fed presset hvidløg"}, "1. Kom en hel citron skåret i fire både i en gryde fyldt " +
                "med 3 dl kogende vand. Tilsæt ca. 5 cm frisk ingefær. Lad blandingen koge op i 1 minuts tid. Tag " +
                "det af varmen og lad det hvile i 10 min. 1 fed presset hvidløg blandes i sammen med 1 spsk. honning.",
                "Du kan også variere teen og tilsætte en knivspids cayenne peber (for at løsne slim) eller komme andre " +
                        "lindrende krydderier i som f.eks. kanel eller nelliker."),
        new Recipe("Glasur", new String[]{"200 g flormelis","½ dl kogende vand"}, "1. Bland flormelis og kogende vand sammen i en skål.\n" +
                "2. Bland indtil du har en ensartet glasur.\n" +
                "3. Pynt din kage med glasuren.", "Kakaoglasur: Skift cirka ⅓ af flormelisen ud med usødet kakaopulver \n" +
                "Andre variationer: Du kan skifte vandet ud med frugtsaft – f.eks. citronsaft, appelsinsaft el. lign " +
                "eller du kan skifte vandet ud med f.eks. frugtfarve, så glasuren måske bliver rød eller grøn.")};

        // EXAMPLE ArrayList
        recipeList = new ArrayList<Recipe>();
        // EXAMPLE For loop
        for (int i = 0; i < recipes.length; i++) {
            recipeList.add(recipes[i]);
        }

        recipeListView.getItems().setAll(recipeList);
        recipeListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

    }
}
