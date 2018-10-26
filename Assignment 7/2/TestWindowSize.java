
//imports application, scene, stage, and label
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
//imports timer and timer task 
import java.util.Timer;
import java.util.TimerTask;

public class TestWindowSize extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My First JavaFX App");
        // creates the size of the scene and puts the text in the scene
        Label label = new Label("Test Frame 1");
        Scene scene = new Scene(label, 200, 100);
        primaryStage.setScene(scene);

        primaryStage.show();
        // makes it gradually grows on the screen w delays
        Timer animeTimer = new Timer();
        animeTimer.scheduleAtFixedRate(new TimerTask() {
            int i = 0;

            // overrides timer task
            @Override
            public void run() {
                if (i < 100) {
                    // sets width of window
                    primaryStage.setWidth(primaryStage.getWidth() + 1);
                    primaryStage.setHeight(primaryStage.getHeight() + 1);
                } else {
                    // cancels once done 100 times
                    this.cancel();
                }
                i++;
            }
        }, 2000, 30);

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}