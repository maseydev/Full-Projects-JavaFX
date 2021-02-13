package sample.pages.encrypt;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class EncryptController {

    private Algorithm algorithm = new Algorithm();

    @FXML
    private TextArea def_enc_area;

    @FXML
    private TextArea def_dec_area;

    @FXML
    private TextArea out_enc_area;

    @FXML
    private TextArea out_dec_area;

    @FXML
    private TextField enc_key_field;

    @FXML
    private TextField dec_key_field;

    @FXML
    private Button enc_btn;

    @FXML
    private Button dec_btn;

    @FXML
    void initialize() {
        enc_btn.setOnAction(actionEvent -> {
            String encryptText = def_enc_area.getText();
            int key = Integer.parseInt(enc_key_field.getText());
            String outputEncrypt = algorithm.encrypt(encryptText, key);
            out_enc_area.setText(outputEncrypt);
        });

        dec_btn.setOnAction(actionEvent -> {
            String decryptText = def_dec_area.getText();
            int key = Integer.parseInt(dec_key_field.getText());
            String outputDecrypt = algorithm.decrypt(decryptText, key);
            out_dec_area.setText(outputDecrypt);
        });
    }
}