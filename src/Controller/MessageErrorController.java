package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class MessageErrorController {
	@FXML
    private AnchorPane MessageBack;

    @FXML
    private Circle SuccessCircle;

    @FXML
    private Button OKbtn;

    @FXML
    void ErrorOKbtn(ActionEvent event) {
    	OKbtn.getScene().getWindow().hide();
    }
}
