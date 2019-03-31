package Controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPopup;
import com.jfoenix.controls.JFXRippler;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Pair;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Stack;

public class MainController implements Initializable {
    public HBox tiltleBar;
    public StackPane stackPane;
    public BorderPane borderPane;
    public JFXButton information;
    private Delta delta = new Delta();
    private Pane overViewPane;
    private ScrollPane scrollPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        scrollPane = new ScrollPane();
        try {
            initPanes();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        borderPane.setCenter(stackPane);
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

    public void onOverViewAction(ActionEvent actionEvent) {
//        showPane(overViewPane, stackPane);
        scrollPane.setVisible(true);

    }

    public void onInfoAction(ActionEvent actionEvent) {
//        JFXRippler rippler = new JFXRippler(information, JFXRippler.RipplerMask.CIRCLE, JFXRippler.RipplerPos.BACK);
//        Pane pane = new Pane();
//        JFXPopup popup = new JFXPopup(pane);
//        rippler.setOnMouseClicked(e -> popup.show(rippler, JFXPopup.PopupVPosition.TOP, JFXPopup.PopupHPosition.LEFT));
    }

    class Delta {
        double x, y;
    }

    private void initPanes () throws IOException {
        overViewPane = new Pane();
        List<Pair<Pane, String> > panes = new ArrayList<>();
        Pair<Pane, String> pair1 = new Pair<>(overViewPane, "/View/UIOverview.fxml");
        panes.add(pair1);
        for(Pair<Pane, String> temp: panes) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(temp.getValue()));
            temp.getKey().getChildren().add(loader.load());
//            stackPane.getChildren().add(temp.getKey());
        }
        scrollPane.getStylesheets().add(getClass().getResource("/Css/ScrollPaneStyleSheet.css").toExternalForm());
        scrollPane.setContent(overViewPane);
        stackPane.getChildren().add(scrollPane);
        for(Node node: stackPane.getChildren()) {
            node.setVisible(false);
        }
    }

    private void showPane (Pane pane, StackPane stackPane) {
        for(Node temp: stackPane.getChildren()) {
            if(pane == temp) {
                temp.setVisible(true); // showing content
            }
            else {
                temp.setVisible(false);
            }
        }
    }
}
