package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window = new Stage();
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        window = primaryStage;
        window.setTitle("Embedding Layouts");

        //creating three buttons for top menu (horizontally)
        HBox topMenu = new HBox();
        Button buttonA = new Button("File");
        Button buttonB = new Button("Edit");
        Button buttonC = new Button("View");

        topMenu.getChildren().addAll(buttonA, buttonB, buttonC);
        topMenu.setAlignment(Pos.CENTER);

        //creating three buttons for left region (vertically)
        VBox leftMenu = new VBox();
        Button buttonD = new Button("D");
        Button buttonE = new Button("E");
        Button buttonF = new Button("F");

        leftMenu.getChildren().addAll(buttonD, buttonE, buttonF);

        //Then, we'll add the VBox and HBox layout to the BorderPane layout
        //using the functions <borderpane_layout>.setTop(), <borderpane_layout>.setLeft()
        //to embed the two layouts in borderpane layout.

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);

        Scene scene = new Scene(borderPane, 300, 250);
        window.setScene(scene);

        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
