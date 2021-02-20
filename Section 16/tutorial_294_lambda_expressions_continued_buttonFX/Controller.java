package tutorial_294_lambda_expressions_continued_buttonFX;



import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    private Button clickMeButton;

    public void initialize() {
        clickMeButton.setOnAction(event -> System.out.println("You clicked me!"));
    }
}
