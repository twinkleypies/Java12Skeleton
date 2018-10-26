//imports things from main and stuff
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import java.net.URL;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class ButtonQuitter extends Application {
//accesses the code in main and defines the variable root
    @FXML
    private FlowPane root;

    //Quits program when button pressed
    public void handleButtonAction(ActionEvent event) {
        System.exit(0);
    }

    @Override
      //calls start function
    public void start(Stage primaryStage) throws Exception{
        URL fxmlURL = ButtonQuitter.class.getResource("Main.fxml");

        primaryStage.setTitle("ayyy lmao");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(fxmlURL);
        FlowPane flowpane = loader.load();
    //creates scene
        Scene scene = new Scene(flowpane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //calls start function
    public static void main(String[] args){
        launch(args);
    }


}