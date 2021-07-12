/*Leah Oswald
 * SPC ID # 2420610
 * Program that rotates a rectangle when a button is clicked.*/
package oswald15;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Rotate extends Application {


	@Override
	public void start(Stage primaryStage) {

		//Create new rectangle.
		Rectangle rectangle = new Rectangle(0, 0, 35, 70);
		//Style the rectangle.
		rectangle.setStyle("-fx-stroke: black;fx-stroke-width: 1;-fx-fill: white;");
		

		//Create new button.
		Button btRotate = new Button("Rotate");	

		//Create new pane.
		BorderPane pane = new BorderPane();
		//Align button to the center.
		BorderPane.setAlignment(btRotate, Pos.CENTER);
		//Add space around button.
		BorderPane.setMargin(btRotate, new Insets(12,12,12,12));
		//Add rectangle and button to pane.
		pane.setCenter(rectangle);
		pane.setBottom(btRotate);

		//Bind top/left y coordinate to half of pane width coordinate.
		rectangle.yProperty().bind(pane.widthProperty().divide(2));
		//Bind top/left x coordinate to half of pane height coordinate.
		rectangle.xProperty().bind(pane.heightProperty().divide(2));




		//Links action of button click to rectangle
		//rotates 15 degrees around the center of the rectangle node.
		btRotate.setOnAction( e -> rectangle.setRotate(rectangle.getRotate() + 15));		

		//Create scene and add pane with dimensions.
		Scene scene = new Scene(pane, 275, 150);
		//Set Title of stage.
		primaryStage.setTitle("Rotate Rectangle");
		//Set scene of stage.
		primaryStage.setScene(scene);
		//Display stage.
		primaryStage.show();

	}



	public static void main(String[] args) {
		launch(args);
	}
}
