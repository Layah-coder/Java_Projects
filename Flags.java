/* Leah Oswald
 * SPC ID# 2420610
 * Program that displays four flags.
 */

package oswald14;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.*;
import javafx.stage.Stage;

public class Flags extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a grid pane.
		GridPane pane = new GridPane();
		//Center pane alignment.
		pane.setAlignment(Pos.CENTER);
		//Add gap between nodes.	
		pane.setHgap(5);
		pane.setVgap(5);
		
		//Create images from file paths.
		Image image = new Image(getClass().getResourceAsStream("/resources/us.gif"));
		Image image1 = new Image(getClass().getResourceAsStream("/resources/china.gif"));
		Image image2 = new Image(getClass().getResourceAsStream("/resources/germany.gif"));
		Image image3 = new Image(getClass().getResourceAsStream("/resources/fr.gif"));
		
		//Create imageview with image.
		ImageView imageView1 = new ImageView(image1);
		//Place imageview in column, row.
		pane.add(imageView1, 0, 0);
		ImageView imageView2 = new ImageView(image2);
		pane.add(imageView2, 0, 1);
		ImageView imageView3 = new ImageView(image3);
		pane.add(imageView3, 1, 1);
		ImageView imageView = new ImageView(image);
		pane.add(imageView, 1, 0);
		
		// Create a scene and add gridplane to it.
		Scene scene = new Scene(pane, 400, 200);
		//Stage title.
		primaryStage.setTitle("Show Flags");
		//Place scene in stage.
		primaryStage.setScene(scene);
		//Display.
		primaryStage.show();
	}
	
	  public static void main(String[] args) {
		    launch(args);
		  }
}

