import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Test extends Application {

    public static void main(String[] args) {
        launch(args);
        System.out.println("dasdasdasd is here");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("example.fxml"));

        Pane pane=fxmlLoader.load();

        Scene scene=new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
