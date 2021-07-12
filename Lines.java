/* Leah Oswald
 * SPC ID# 2420610
 * Program that creates a grid of lines*/

package oswald14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Lines extends Application {
	@Override
	public void start(Stage primaryStage)
	{
		//Create pane.
		Pane pane = new Pane();
		//Add title.
		primaryStage.setTitle("Grid Lines");
		//Set scene size.
		primaryStage.setScene(new Scene(pane, 250, 250));
		//Used to split pane up.
		double divider = 3;
		//Loops to create 2 lines.
		for (int i = 0; i < 2; i++)
		{
			//Create line.
			Line vertical = new Line();
			//Set color to red.
			vertical.setStroke(Color.RED);
			//Set line width.
			vertical.setStrokeWidth(3);
			//Bind line coordinates to allow lines to resize with window.
			//Use divide method to create even pane between lines.
			vertical.startXProperty().bind(pane.widthProperty().divide(divider));
			vertical.startYProperty().bind(pane.layoutYProperty());
			vertical.endXProperty().bind(vertical.startXProperty());
			vertical.endYProperty().bind(pane.heightProperty());
			//Add line to pane.
			pane.getChildren().add(vertical);
			//Make divider half.
			divider /= 2;
		}
		//Reset divide amount.
		divider = 3;
		for (int i = 0; i < 2; i++)
		{
			//Create line.
			Line horizontal = new Line();
			//Set color.
			horizontal.setStroke(Color.BLUE);
			//Set line width.
			horizontal.setStrokeWidth(3);
			//Bind coordinates to allow lines to resize with window.
			//Use divide method to create even pane between lines.
			horizontal.startXProperty().bind(pane.layoutXProperty());
			horizontal.startYProperty().bind(pane.heightProperty().divide(divider));			
			horizontal.endXProperty().bind(pane.widthProperty());
			horizontal.endYProperty().bind(pane.heightProperty().divide(divider));
			//Add line to pane.
			pane.getChildren().add(horizontal);
			//Make divider half.
			divider /= 2;
			
		}
		//Display stage.
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}
