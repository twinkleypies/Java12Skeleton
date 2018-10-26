//Create a JavaFX app with TWO buttons inside a FlowPane. One button will set the window background to red, the other to green.
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import java.net.URL;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class TwoButtons extends Application {
//accesses the code in main and defines the variable root
    @FXML
    private FlowPane root;

    //changes colour of the background when grabbing it from main
    public void GreenButtonAction(ActionEvent event) {
        root.setStyle("-fx-background-color:#38ee00;");
    }

    //changes colour of the background when grabbing it from main
    public void RedButtonAction(ActionEvent event) {
        root.setStyle("-fx-background-color:#800000;");
    }

    @Override
    //gets stuff from main folder
    public void start(Stage primaryStage) throws Exception{
        URL fxmlURL = TwoButtons.class.getResource("Main.fxml");

        primaryStage.setTitle("YEET");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(fxmlURL);
        FlowPane flowpane = loader.load();
    //creates scene
        Scene scene = new Scene(flowpane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args){
        launch(args);
    }

}
    