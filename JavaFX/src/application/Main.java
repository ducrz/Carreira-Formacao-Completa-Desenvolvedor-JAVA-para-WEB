package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			StackPane root = new StackPane();
			primaryStage.setTitle("Aplicação JavaFx");
			Button btn = new Button();
			btn.setText(“Say Hello World!");
			Label lb = new Label();
			btn.setOnAction(ev->lb.setText("\n\n\n Alo Pessoal"));
			root.getChildren().add(btn);
			root.getChildren().add(lb);
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
