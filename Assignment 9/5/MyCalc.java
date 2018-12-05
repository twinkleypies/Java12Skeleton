
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

public class MyCalc extends Application {
    // makes the Text Fields
    @FXML
    private TextField inputField;

    @FXML
    private TextField inputFieldtwo;

    @FXML
    private TextField outputField;


    public void DoMathsButtonAction(ActionEvent event) {

        try {
            // get the values stored in both input fields
            double BirthYear = Double.valueOf(inputField.getText());
            double CurrentYear = Double.valueOf(inputFieldtwo.getText());
            // divides the two variables
            //makes it so you can't enter a larger birthyear than the current year
            if (BirthYear>CurrentYear) {
                throw new ArithmeticException();

            }

            double subtract = CurrentYear-BirthYear;
            outputField.setText(String.valueOf(subtract));
           


        } catch (ArithmeticException e) {
            outputField.setText("Error.");

        } catch (Exception e) {
            outputField.setText("WRONG");
        }
    }


    // creates the text field and shows label
    @Override
    public void start(Stage primaryStage) throws Exception {
        URL fxmlURL = MyCalc.class.getResource("Main.fxml");

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