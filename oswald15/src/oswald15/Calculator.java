/* Leah Oswald
 * Spc ID# 2420610
 * Program that accepts user inputs and calculates a future value.
 */
package oswald15;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application {
	
	//Create textfields to hold user input.
	private TextField tfInvestmentAmount = new TextField();
	private TextField tfYears = new TextField();
	private TextField tfAnnualInterestRate = new TextField();
	private TextField tfFutureValue = new TextField();
	//Create calculate button.
	private Button btCalculate = new Button("Calculate");
	
	@Override
	public void start(Stage primaryStage) {
		//Create pane.
		GridPane pane = new GridPane();
		//Set gaps between nodes in pane.
		pane.setHgap(5);
		pane.setVgap(5);
		//Add labels to gridpane.
		pane.add(new Label("Investment Amount:"), 0, 0);
		pane.add(tfInvestmentAmount, 1, 0);
		pane.add(new Label("Number of Years:"), 0, 1);
		pane.add(tfYears, 1, 1);
		pane.add(new Label("Annual Interest Rate:"), 0, 2);
		pane.add(tfAnnualInterestRate, 1, 2);
		pane.add(new Label("Future Value:"), 0, 3);
		pane.add(tfFutureValue, 1, 3);
		//Add button to gridpane.
		pane.add(btCalculate, 1, 4);
		
		//Align pane
		pane.setAlignment(Pos.CENTER);
		//Align textfields.
		tfInvestmentAmount.setAlignment(Pos.BOTTOM_RIGHT);
		tfYears.setAlignment(Pos.BOTTOM_RIGHT);
		tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
		tfFutureValue.setAlignment(Pos.BOTTOM_RIGHT);
		//Block user input.
		tfFutureValue.setEditable(false);
		//Align calculate button.
		GridPane.setHalignment(btCalculate,  HPos.RIGHT);
		
		//Call method when calculate button is used.
		btCalculate.setOnAction(e->calculateFutureValue());
		
		//Create scene and add pane.
		Scene scene = new Scene(pane, 400, 250);
		//Set title.
		primaryStage.setTitle("Investment Calculator");
		//Set scene of stage.
		primaryStage.setScene(scene);
		//Display stage.
		primaryStage.show();
	}
	
	private void calculateFutureValue() {
		//Holds interest rate from textfield.
		double interest = Double.parseDouble(tfAnnualInterestRate.getText());
		//Holds years from textfield.
		int year = Integer.parseInt(tfYears.getText());
		//Holds investment amount from textfield.
		double investmentAmount = Double.parseDouble(tfInvestmentAmount.getText());
		//Calculate and assign value to variable.
		double futureValue = investmentAmount * Math.pow(1 + (interest / 1200), year * 12);
		//Format and set futurevalue to textfield.
		tfFutureValue.setText(String.format("$%.2f", futureValue));
	}
	

	public static void main(String[] args) {
		launch(args);

	}



}
