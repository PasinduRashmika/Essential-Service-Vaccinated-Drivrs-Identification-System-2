package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class MessageMarkController {
	 @FXML
	    private AnchorPane MessageBack;

	    @FXML
	    private Circle SuccessCircle;

	    @FXML
	    private Button OKbtn;

	    @FXML
	    void WarningOKbtn(ActionEvent event) {
	    	OKbtn.getScene().getWindow().hide();
	    }
}
