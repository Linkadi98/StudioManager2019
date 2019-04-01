package Controllers;

import com.jfoenix.controls.JFXNodesList;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class EmployeeController implements Initializable {
    public JFXNodesList listButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listButton.setRotate(180);
        listButton.setSpacing(10);
    }
}
