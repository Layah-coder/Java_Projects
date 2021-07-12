/*Leah Oswald
 * SPC ID# 2420610
 * Program that converts distance units.
 */
package oswald16;
 

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DistanceConverter extends Application{
	//Constant used to calculate units.
	final double CONVERSION_RATE = 1.60934;
	//Create textfields.
	private TextField tfMiles = new TextField();
	private TextField tfKilometers = new TextField();

	@Override
	public void start(Stage primaryStage) {
		//Create new gridpane.
		GridPane pane = new GridPane();
		//Add labels to pane.
		pane.add(new Label("Mile:"), 0, 0);
		pane.add(tfMiles, 1, 0);
		pane.add(new Label("Kilometer:"), 0, 1);
		pane.add(tfKilometers, 1, 1);
		//Center pane alignments.
		pane.setAlignment(Pos.CENTER);
		//Align textfields to bottom right.
		tfMiles.setAlignment(Pos.BOTTOM_RIGHT);
		tfKilometers.setAlignment(Pos.BOTTOM_RIGHT);
		//When key is pressed.
		tfMiles.setOnKeyPressed(e -> {
			//Check if enter key is pressed and if there is text in miles textfield.
			if (e.getCode() == KeyCode.ENTER && tfMiles.getText().length() > 0) {
				//Assign string miles textfield to double miles.
				double miles = Double.parseDouble(tfMiles.getText());
				//Calculate and assign value to kilometers textfield.
				tfKilometers.setText(String.format("%.4f", miles * CONVERSION_RATE));
				
			}
		});
		//When key is pressed.
		tfKilometers.setOnKeyPressed(e -> {
			//Check if enter key is pressed and if there is text in kilometer textfield.
			if (e.getCode() == KeyCode.ENTER && tfKilometers.getText().length() > 0) {
				//Assing string kilometers textfield to double kilometers.
				double kilometers = Double.parseDouble(tfKilometers.getText());
				//Calculate and assign vale to miles textfield.
				tfMiles.setText(String.format("%.4f", kilometers / CONVERSION_RATE));
				
			}
		});
		//Create scene and add pane with dimensions.
		Scene scene = new Scene(pane, 230, 70);
		//Set Title of stage.
		primaryStage.setTitle("Distance Converter");
		//Set scene of stage.
		primaryStage.setScene(scene);
		//Display stage.
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}


}
