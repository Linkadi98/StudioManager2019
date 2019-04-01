package Controllers;

import com.jfoenix.controls.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
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
    public HBox menuBar;
    public Circle avatar;
    public javafx.scene.image.ImageView overViewImage;
    public JFXButton overViewButton;
    public javafx.scene.image.ImageView employeeImage;
    public JFXButton employeeButton;
    public javafx.scene.image.ImageView customerPartnerImage;
    public JFXButton customerPartnerButton;
    public javafx.scene.image.ImageView packageImage;
    public JFXButton packageButton;
    public javafx.scene.image.ImageView orderImage;
    public JFXButton orderButton;
    public javafx.scene.image.ImageView formImage;
    public JFXButton formButton;
    public javafx.scene.image.ImageView reportImage;
    public JFXButton reportButton;

    private Delta delta = new Delta();
    private ScrollPane overViewScrollPane;
    private ScrollPane employeeScrollPane;
    private JFXDrawersStack drawersStack;
    private JFXDrawer customerPartner;
    private List<ImageView> imageViewList;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        drawersStack = new JFXDrawersStack();
        customerPartner = new JFXDrawer();
        Pane contentPane = new Pane();
        imageViewList = new ArrayList<>();
        contentPane.setPrefSize(100, 100);
        Pane sidePane = new Pane();

        try {
            initPanes();
        } catch (IOException e) {
            e.printStackTrace();
        }

        drawersStack.setContent(stackPane);
        borderPane.setCenter(drawersStack);
        customerPartner.setResizeContent(true);
        customerPartner.setDirection(JFXDrawer.DrawerDirection.LEFT);
        customerPartner.setCache(true);
        customerPartner.setDefaultDrawerSize(100);
        customerPartner.setSidePane(sidePane);

        imageViewList.add(orderImage);
        imageViewList.add(overViewImage);
        imageViewList.add(customerPartnerImage);
        imageViewList.add(employeeImage);
        imageViewList.add(formImage);
        imageViewList.add(packageImage);
        imageViewList.add(reportImage);

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
        showPane(overViewScrollPane, stackPane);
    }

    public void onInfoAction(ActionEvent actionEvent) {

    }

    public void employeeOnAction(ActionEvent actionEvent) {
        showPane(employeeScrollPane, stackPane);
    }

    public void customerPartnerOnAction(ActionEvent actionEvent) {
        drawersStack.toggle(customerPartner);
    }

    public void packageOnAction(ActionEvent actionEvent) {
    }

    public void orderOnAction(ActionEvent actionEvent) {
    }

    public void formOnAction(ActionEvent actionEvent) {
    }

    public void reportOnAction(ActionEvent actionEvent) {
        drawersStack.toggle(customerPartner);
    }

    class Delta {
        double x, y;
    }

    private void initPanes () throws IOException {
        overViewScrollPane = new ScrollPane();
        employeeScrollPane = new ScrollPane();
        List<Pair<ScrollPane, String> > scrollPanes = new ArrayList<>();
        Pair<ScrollPane, String> pair1 = new Pair<>(overViewScrollPane, "/View/UIOverview.fxml");
        Pair<ScrollPane, String> pair2 = new Pair<>(employeeScrollPane, "/View/UIEmployee.fxml");
        scrollPanes.add(pair1);
        scrollPanes.add(pair2);
        for(Pair<ScrollPane, String> temp: scrollPanes) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(temp.getValue()));
            Pane tempPane = new Pane();
            tempPane.getChildren().add(loader.load());
            temp.getKey().setContent(tempPane);
            temp.getKey().getStylesheets().add(getClass().getResource("/Css/ScrollPaneStyleSheet.css").toExternalForm());
            stackPane.getChildren().add(temp.getKey());
        }

        for(Node node: stackPane.getChildren()) {
            node.setVisible(false);
        }
    }

    private void showPane (ScrollPane pane, StackPane stackPane) {
        for(Node temp: stackPane.getChildren()) {
            if(pane == temp) {
                temp.setVisible(true); // showing content
            }
            else {
                temp.setVisible(false);
            }
        }
    }

    private void changeColor(ImageView imageView, String url, List<ImageView> imageViewList) {
        Image image = new Image(url);
        imageView.setImage(image);
    }

    private void rechangeColor(ImageView imageView, String url) {
        Image image = new Image(url);
        imageView.setImage(image);
    }

}
