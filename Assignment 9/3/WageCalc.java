
//imports everything needed in this program
import javafx.beans.value.*;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import java.net.URL;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class WageCalc extends Application {
    // makes the two text fields
    @FXML
    private TextField inputField;

    @FXML
    private TextField inputFieldtwo;

    @FXML
    private TextField outputField;


    public void DoMathsButtonAction(ActionEvent event) {

        
            // get the values stored in both input fields
            double Hours = Double.valueOf(inputField.getText());
            double HPay = Double.valueOf(inputFieldtwo.getText());
            // divides the two variables
            double multiply = Hours * HPay;
            outputField.setText(String.valueOf(multiply));
              // makes sure u can't divide by zero

        
    }

    // clears the two fields
    public void clearButtonAction(ActionEvent event) {
        inputField.clear();
        outputField.clear();
    }

    // creates the text field and shows label
    @Override
    public void start(Stage primaryStage) throws Exception {
        URL fxmlURL = WageCalc.class.getResource("Main.fxml");

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