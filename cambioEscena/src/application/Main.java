package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	Stage stage;
	FXMLLoader loader1, loader2;
	Scene scene1, scene2;

	@Override
	public void start(Stage primaryStage) {
		try {
			stage = primaryStage;
			loader1 = new FXMLLoader(getClass().getResource("escena1.fxml"));
			loader2 = new FXMLLoader(getClass().getResource("escena2.fxml"));
			mainWindow();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void mainWindow() throws Exception {

		BorderPane pane1 = loader1.load();
		scene1 = new Scene(pane1);

		BorderPane pane2 = loader2.load();
		scene2 = new Scene(pane2);

		Escena1Controller controller1 = loader1.getController();
		controller1.inicio(stage, scene2);

		Escena2Controller controller2 = loader2.getController();
		controller2.inicio(stage, scene1);

		stage.setScene(scene1);
		stage.initStyle(StageStyle.UNDECORATED);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
