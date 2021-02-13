package sample.pages;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private Button page_encrypt_btn;

    @FXML
    private Button page_calculator_btn;

    @FXML
    void initialize() {
        page_encrypt_btn.setOnAction(actionEvent -> {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/pages/encrypt/encryptionform.fxml"));
            try {
                loadForms(loader, "Encryption");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });


        page_calculator_btn.setOnAction(actionEvent -> {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/pages/calculation/smartcalculatorform.fxml"));

            try {
                loadForms(loader, "Calculator");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }


    public void loadForms(FXMLLoader loader, String nameWindow) throws IOException {
        loader.load();
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle(nameWindow);
        stage.showAndWait();
    }
}