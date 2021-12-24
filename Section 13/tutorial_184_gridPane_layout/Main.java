package tutorial_184_gridPane_layout;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
		        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

//		        GridPane root = new GridPane();
//		        root.setAlignment(Pos.CENTER);
//		        root.setVgap(10);
//		        root.setHgap(10);
//		
//		        Label greeting = new Label("Welcome to JavaFX!");
//		        greeting.setTextFill(Color.GREEN);
//		        greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD, 70));
//		
//		        root.getChildren().add(greeting);

		        primaryStage.setTitle("Hello JavaFX!");
		        primaryStage.setScene(new Scene(root, 700, 275));
		        primaryStage.show();
		        
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
