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

public class TempConversion extends Application {
    //makes the two text fields
    @FXML
    private TextField firstField;

    @FXML
    private TextField secondField;

    @FXML
    public void initialize() {
        firstField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            //makes sure you have to put in a number value for the input
            public void changed(ObservableValue<? extends String> observable,
                    String oldValue, String newValue) {
        //does math to convert fahrenheit to celsius
                try{
                    Double Celsius = Double.valueOf(newValue);
                    Double Fahrenheit = (Celsius*(9/5) + 32);
                    secondField.setText(String.valueOf(Fahrenheit));
                } catch(Exception e){
                    secondField.setText("WRONG INPUT");
                }
            }
        });
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