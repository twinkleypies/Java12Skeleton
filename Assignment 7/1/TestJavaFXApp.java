//imports application, scene, stage, and label
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class TestJavaFXApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My First JavaFX App");
//creates the size of the scene and puts the text in the scene
        Label label = new Label("Test Frame 1");
        Scene scene = new Scene(label, 200, 100);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}