/* Leah Oswald
 * SPC ID# 2420610
 * Program allows user to create various shapes and fill them.
 */
package oswald16;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

 

public class GeometricFigures extends Application {
	//Create stackpane.
	StackPane pane = new StackPane();
	//Create hbox.
	HBox hbox = new HBox();	
	//Create shapes.
	Circle circle = new Circle(75);
	Rectangle rectangle = new Rectangle(0, 0, 175, 75);
	Ellipse ellipse = new Ellipse(40, 90);
	
	//Create radioButtons and checkbox.
	RadioButton rbCircle = new RadioButton("Circle");
	RadioButton rbRectangle = new RadioButton("Rectangle");
	RadioButton rbEllipse = new RadioButton("Ellipse");
	CheckBox chkFill = new CheckBox("Fill");

	
	@Override
	public void start(Stage primaryStage) {
		
		//Create togglegroup for radiobuttons.
		ToggleGroup group = new ToggleGroup();
		//Add radiobuttons to togglegroup.
		rbCircle.setToggleGroup(group);
		rbRectangle.setToggleGroup(group);
		rbEllipse.setToggleGroup(group);
		
		//Set properties to hbox.
		hbox.setStyle("-fx-border-width: .5px; -fx-border-color: black; -fx-alignment: center; -fx-spacing: 10");
		//Add radiobuttons and checkbox to hbox.
		hbox.getChildren().addAll(rbCircle, rbRectangle, rbEllipse, chkFill);
		//Add border to objects.
		rectangle.setStroke(Color.BLACK);
		circle.setStroke(Color.BLACK);
		ellipse.setStroke(Color.BLACK);
		
		//Do when radiobutton circle is clicked.
		rbCircle.setOnAction(e -> {
			//Clear shapes from stackpane.
			pane.getChildren().clear();
			//Call fillshape method.
			fillShape();
			//If radiobutton circle is selected add circle to stackpane.
			if (rbCircle.isSelected()) {
				pane.getChildren().add(circle);
			}

		});
		//Do when radiobutton rectangle is clicked.
		rbRectangle.setOnAction(e -> {
			//Clear shapes from stackpane.
			pane.getChildren().clear();
			//Call fillShape method.
			fillShape();
			//If radiobutton rectangle is selected add rectangle to stackpane.
			if (rbRectangle.isSelected()) {
				pane.getChildren().add(rectangle);
			}

		});
		//Do when radiobutton ellipse is clicked.
		rbEllipse.setOnAction(e -> {
			//Clear shapes from stackpane.
			pane.getChildren().clear();
			//Call fillshape method.
			fillShape();
			//If radiobutton is selected add ellipse to stackpane.
			if (rbEllipse.isSelected()) {
				pane.getChildren().add(ellipse);
			}

		});
		//Do when check box is clicked.
		chkFill.setOnAction(e -> {
			//Call fillShape method.
			fillShape();
		});
		//Create borderpane.
		BorderPane borderpane = new BorderPane();
		//Put stackpane and hbox in borderpane.
		borderpane.setCenter(pane);
		borderpane.setBottom(hbox);
		
		//Create scene and add borderpane.
		Scene scene = new Scene(borderpane, 400, 250);
		//Set title.
		primaryStage.setTitle("Create Geometric Figures");
		//Set scene of stage.
		primaryStage.setScene(scene);
		//Display stage.
		primaryStage.show();
	}
	
	private void fillShape(){
		//When checkbox is selected color the shapes.
		if (chkFill.isSelected()) {
			ellipse.setFill(Color.LIGHTSEAGREEN);
			rectangle.setFill(Color.DEEPSKYBLUE);
			circle.setFill(Color.DEEPPINK);
		}
		//When checkbox is not selected, make shapes transparent.
		else {
			ellipse.setFill(Color.TRANSPARENT);
			rectangle.setFill(Color.TRANSPARENT);
			circle.setFill(Color.TRANSPARENT);
		}
		
	}
	 

	public static void main(String[] args) {
		launch(args);

	}


}
