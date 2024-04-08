package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import Model.HopitalModel;

public class Controller {

    @FXML
    private TextField txtProbleme;

    @FXML
    private Button btnVerifier;

    @FXML
    private Label lblResultat;

    @FXML
    private void initialize() {
        btnVerifier.setOnAction(event -> {
            String probleme = txtProbleme.getText();
            boolean peutTraiter = HopitalModel.verifierTraitementDisponible(probleme);
            lblResultat.setText(peutTraiter ? "Le patient peut être traité" : "Le patient ne peut pas être traité");
        });
    }
}
