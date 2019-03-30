package Controllers;

import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    public HBox tiltleBar;
    public StackPane stackPane;
    private Delta delta = new Delta();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public void drag(MouseEvent mouseEvent) {
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow() ;
        stage.setX(mouseEvent.getScreenX() + delta.x);
        stage.setY(mouseEvent.getScreenY() + delta.y);
    }


    public void titileBarOnMousePressed(MouseEvent mouseEvent) {
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        delta.x = stage.getX() - mouseEvent.getScreenX();
        delta.y = stage.getY() - mouseEvent.getScreenY();
    }

    public void minimize(MouseEvent mouseEvent) {
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow() ;
        stage.setIconified(true);
    }

    public void close(MouseEvent mouseEvent) {
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();
    }

    class Delta {
        double x, y;
    }
}
