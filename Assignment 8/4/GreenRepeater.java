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

public class GreenRepeater extends Application {
    //makes the two text fields
    @FXML
    private TextField FirstField;

    @FXML
    private TextField SecondField;

    @FXML
    public void initialize() {
        FirstField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable,
                    String oldValue, String newValue) {
        
                System.out.println(" Text Changed to  " + newValue + ")\n");
                //makes the value of the second text field to be the same as the first text field
                SecondField.setText(newValue);
            
            }
        });
//makes it unable for the user to type in the second text field
        SecondField.setEditable(false);
    }
    
//creates the text field and shows label
    @Override
    public void start(Stage primaryStage) throws Exception{
        URL fxmlURL = GreenRepeater.class.getResource("Main.fxml");

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