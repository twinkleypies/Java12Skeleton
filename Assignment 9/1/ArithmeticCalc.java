
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

public class ArithmeticCalc extends Application {
    // makes the two text fields
    @FXML
    private TextField inputField;

    @FXML
    private TextField inputFieldtwo;

    @FXML
    private TextField outputField;

    // sub button
    // makes sure you have to put in a number value for the input
    public void SubButtonAction(ActionEvent event) {
        // does math to convert fahrenheit to celsius
        try {
            // get the values stored in both input fields
            Double x = Double.valueOf(inputField.getText());
            Double y = Double.valueOf(inputFieldtwo.getText());
            double sub = x - y;
            // output the result to the output field
            outputField.setText(String.valueOf(sub));
        } catch (Exception e) {
            outputField.setText("WRONG INPUT");
        }
    }

    // sum button
    public void SumButtonAction(ActionEvent event) {

        try {
            // get the values stored in both input fields
            double x = Double.valueOf(inputField.getText());
            double y = Double.valueOf(inputFieldtwo.getText());
            double sum = x + y;
            // output the result to the output field
            outputField.setText(String.valueOf(sum));
        } catch (Exception e) {
            outputField.setText("WRONG");
        }
    }

    public void MultiplyButtonAction(ActionEvent event) {

        try {
            // get the values stored in both input fields
            double x = Double.valueOf(inputField.getText());
            double y = Double.valueOf(inputFieldtwo.getText());
            double Multiply = x * y;
            // output the result to the output field
            outputField.setText(String.valueOf(Multiply));
        } catch (Exception e) {
            //says it's wrong if the wrong input is put in
            outputField.setText("WRONG");
        }
    }

    public void DivideButtonAction(ActionEvent event) {

        try {
            // get the values stored in both input fields
            double x = Double.valueOf(inputField.getText());
            double y = Double.valueOf(inputFieldtwo.getText());
            // divides the two variables
            double Divide = x/y;
            outputField.setText(String.valueOf(Divide));
              // makes sure u can't divide by zero
            if (y == 0) {
                throw new ArithmeticException();

            }

        } catch (ArithmeticException e) {
            outputField.setText("can't divide by zero, dummie.");

        } catch (Exception e) {
            outputField.setText("WRONG");
        }
    }

    // clears the two fields
    public void clearButtonAction(ActionEvent event) {
        inputField.clear();
        outputField.clear();
    }

    // creates the text field and shows label
    @Override
    public void start(Stage primaryStage) throws Exception {
        URL fxmlURL = ArithmeticCalc.class.getResource("Main.fxml");

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