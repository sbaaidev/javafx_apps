package testFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FirstFX  extends Application{
	Label lbltext;
	Button btn;
	public static void main(String[] args) {
		
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		lbltext=new Label("here is label:");
		btn=new Button("Click");
		
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
			lbltext.setText("Klickiiiiii");
				
			}
		});
		VBox root=new VBox();
		root.getChildren().add(lbltext);
		root.getChildren().add(btn);
		Scene scene=new Scene(root,500,500);
		stage.setScene(scene);
		scene.getStylesheets().add("testFX/style.css");
		stage.show();
	}

}
