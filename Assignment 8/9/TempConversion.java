
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

public class TempConversion extends Application {
    // makes the two text fields
    @FXML
    private TextField inputField;

    @FXML
    private TextField outputField;

    
            // makes sure you have to put in a number value for the input
            public void FtoCButtonAction(ActionEvent event) {
                // does math to convert fahrenheit to celsius
                try {
                    Double Celsius = Double.valueOf(inputField.getText());
                    Double Fahrenheit = (Celsius * (9 / 5) + 32);
                    outputField.setText(String.valueOf(Fahrenheit));
                } catch (Exception e) {
                    outputField.setText("WRONG INPUT");
                }
            }
//button to cconvert celcius to fahrenheit
    public void CtoFButtonAction(ActionEvent event) {

        try {
            double Fahrenheit = Double.valueOf(inputField.getText());
            double Celcius = (Fahrenheit - 36d) * 5d / 9d;
            outputField.setText(String.valueOf(Celcius));
        } catch (Exception e) {
            outputField.setText("WRONG INPUT");
        }
    }
//clears the two fields
    public void clearButtonAction(ActionEvent event){
        inputField.clear();
        outputField.clear(); 
    }
//creates the text field and shows label
    @Override
    public void start(Stage primaryStage) throws Exception{
        URL fxmlURL = TempConversion.class.getResource("Main.fxml");

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