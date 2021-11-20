package Controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AboutUsController {
	@FXML
    private Pane AboutUspane1;

    @FXML
    private Button AboutUsBack;

    @FXML
    private Pane AboutUspane2;

    @FXML
    void AboutUsBackAction(ActionEvent event) throws IOException {
    	AboutUsBack.getScene().getWindow().hide();
    	Stage Login = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/Login.fxml"));
			Scene scene = new Scene(root);
			Login.setResizable(false);
			Login.setScene(scene);
			Login.show();
    }
}
