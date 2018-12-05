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

public class DistanceConverter extends Application {
    // creates input and output text field
    @FXML
    private TextField inputField;


    @FXML
    private TextField outputField;

    public void CtoIButtonAction(ActionEvent event) {
//creates button action for converting centimeters to inches
        try {
            // get the values stored in both input fields
            double x = Double.valueOf(inputField.getText());
            double divide = x / 2.54;
            // output the result to the output field
            outputField.setText(String.valueOf(divide));
        } catch (Exception e) {
            //says it's wrong if the wrong input is put in
            outputField.setText("WRONG");
        }
    }

    public void ItoCButtonAction(ActionEvent event) {

        
            // get the values stored in both input fields
            double x = Double.valueOf(inputField.getText());

            // does math so you can get what inputed inch is in cm
            double multiply = x*2.54;
            outputField.setText(String.valueOf(multiply));
         
           

        
    }

    // clears the two fields
    public void clearButtonAction(ActionEvent event) {
        inputField.clear();
        outputField.clear();
    }

    // creates the text field and shows label
    @Override
    public void start(Stage primaryStage) throws Exception {
        URL fxmlURL = DistanceConverter.class.getResource("Main.fxml");

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