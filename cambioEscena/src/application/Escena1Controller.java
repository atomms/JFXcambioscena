package application;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Escena1Controller {

	Stage stage2;
	Scene scene2;

	public void inicio(Stage stage, Scene scene2) {
		this.stage2 = stage;
		this.scene2 = scene2;
	}

	@FXML
	public void cambiarEscena() throws Exception {
		stage2.setScene(scene2);
	}

}
