import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;

@override
public class BigFrame extends Application {
    public static void Start(Stage primaryStage) throws exception {
        primaryStage.setTitle("hi world");

        //creates words that will appear in a container

        Label hellowWorldLabel = new Label("Hello world!");
        Scene scene = new Scene(helloWorldLabel, 400, 400);

        //makes primary stage not resizable 
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    
    }
    public static void main(String[]args){
        Application.launch(args);
    }
}