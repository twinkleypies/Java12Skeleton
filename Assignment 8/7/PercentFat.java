
//imports everything needed in this program
import javafx.beans.value.*;
import javafx.event.ActionEvent;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import java.net.URL;
import javafx.scene.control.TextField;

public class PercentFat extends Application {
    // makes the two text fields
    @FXML
    private TextField caloriesField;

    @FXML
    private TextField fatField;
    @FXML
    private TextField outputField;

    public void calculateButtonAction(ActionEvent event) {

        try {
            Double calories = Double.valueOf(caloriesField.getText());
            Double fat = Double.valueOf(caloriesField.getText());

            Double percent = fat * 9 / calories * 100;
            outputField.setText(String.valueOf(percent));
        } catch (Exception e) {
            fatField.setText("WRONG INPUT");
        }

    }

    // creates the text field and shows label
    @Override
    public void start(Stage primaryStage) throws Exception {
        URL fxmlURL = PercentFat.class.getResource("Main.fxml");

        primaryStage.setTitle("Text text field Change this...");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(fxmlURL);
        FlowPane flowPane = loader.load();

        Scene scene = new Scene(flowPane);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}