package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class FruitController {

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Cantaloupe cantaloupe = new Cantaloupe();
    JavaChip javaChip = new JavaChip();
    Matcha matcha = new Matcha();
    Strawberry strawberry = new Strawberry();
    WhiteMocha whiteMocha = new WhiteMocha();

    public void initialize() {

        cantaloupe.setIngredient("melon syrup and cream");
        cantaloupe.setTaste("very sweet and creamy");

        javaChip.setIngredient("roast coffee and mocha");
        javaChip.setTaste("bitter sweet");

        matcha.setIngredient("matcha powder and espresso roast");
        matcha.setTaste("grassy and slightly bitter");

        strawberry.setIngredient("acai berries and lemonade");
        strawberry.setTaste("fruity and slightly tangy");

        whiteMocha.setIngredient("roast coffee and milk");
        whiteMocha.setTaste("creamy white chocolate");

    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Cantaloupe Melon Cream contains " + cantaloupe.getIngredient() + ", and tastes " + cantaloupe.getTaste());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Java Chip Frappuccino contains " + javaChip.getIngredient() + ", and tastes " + javaChip.getTaste());
        }

        if (sourceButton == btn3) {
            alert.setContentText("Iced Matcha and Espresso Fusion contains " + matcha.getIngredient() + ", and tastes " + matcha.getTaste());
        }

        if (sourceButton == btn4) {
            alert.setContentText("Strawberry Açaí with Lemonade contains " + strawberry.getIngredient() + ", and tastes " + strawberry.getTaste());
        }

        if (sourceButton == btn5) {
            alert.setContentText("White Mocha Frappuccino contains " + whiteMocha.getIngredient() + ", and tastes " + whiteMocha.getTaste());
        }

        alert.showAndWait();

    }
}
