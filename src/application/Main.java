package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			carregaMain(primaryStage);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void carregaMain(Stage primaryStage) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/main/MainView.fxml"));
		ScrollPane scrollPane = loader.load();
		
		scrollPane.setFitToHeight(true);
		scrollPane.setFitToWidth(true);
		
		Scene mainScene = new Scene(scrollPane);
		primaryStage.setScene(mainScene);
		primaryStage.setTitle("Sample JavaFX application");
		primaryStage.show();
		primaryStage.setMaximized(true);
		primaryStage.centerOnScreen();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
