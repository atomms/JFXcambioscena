package application;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Escena2Controller {

	Stage stage;
	Scene scene1;

	public void inicio(Stage stage, Scene scene1) {

		this.stage = stage;
		this.scene1 = scene1;
	}

	@FXML
	public void cambiarEscena() throws Exception {
		stage.setScene(scene1);
	}

}
