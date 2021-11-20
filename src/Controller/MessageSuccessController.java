package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class MessageSuccessController {
	 @FXML
	    private AnchorPane MessageBack;

	    @FXML
	    private Button OKbtn;

	    @FXML
	    private Circle SuccessCircle;

	    @FXML
	    void SuccessOKbtn(ActionEvent event) {
	    	OKbtn.getScene().getWindow().hide();
	    }
}
