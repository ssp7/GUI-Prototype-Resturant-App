package edu.unl.cse.csce361.gui_prototype;

import java.awt.Desktop.Action;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.zip.ZipInputStream;

import org.w3c.dom.events.EventListener;

import com.sun.glass.events.KeyEvent;

import java.awt.*;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

public class Controller {

	@FXML
	public Text Hamburger;
	public Text Cheeseburger;
	public Text Fries;
	public Text FountainDrinks;
	public Text Sundae;
	public Text Subtotal;
	public Text Salestax_ofItems;
	public Text Grandtotal;
	public TextField cardNo;
	public TextField expiration;
	public TextField CVV;
	public TextField Zip_Code;

	public EventListener save_event;

	public String cardNo_String;
	public String expiration_String;
	public String CVV_String;
	public String Zip_Code_String;

	

	public int No_Hamburger = 0;
	public int No_CheeseBurger = 0;
	public int No_Fries = 0;
	public int No_FountainDrink = 0;
	public int No_Sundae = 0;

	public double subTotal;
	public double salesTax;
	public double grandTotal;


	public void removeHamburger(ActionEvent event) {
        
		if(No_Hamburger == 0) {
			No_Hamburger = 0;
		}
		else {
			No_Hamburger--;
		}
		subTotal =  (5 * No_Hamburger) + (6 * No_CheeseBurger) + (2 * No_Fries) + (2 * No_FountainDrink) + (3 * No_Sundae);
		salesTax = subTotal * 0.075; 
		Hamburger.setText(Integer.toString(No_Hamburger));

		 Subtotal.setText("$"+Double.toString(subTotal));
		 salesTax =  (5 * No_Hamburger)*0.075 + (6 * No_CheeseBurger)*0.075 + (2 * No_Fries)*0.075 + (2 * No_FountainDrink)*0.075 + (3 * No_Sundae)*0.075;
		 String tax = String.format("%.2f", salesTax);
		 Salestax_ofItems.setText("$"+tax);  
		 grandTotal = subTotal + salesTax;
		  Grandtotal.setText("$"+Double.toString(grandTotal));

	
	}
	public void addHamburger(ActionEvent event) {
		
		No_Hamburger++;
		subTotal =  (5 * No_Hamburger) + (6 * No_CheeseBurger) + (2 * No_Fries) + (2 * No_FountainDrink) + (3 * No_Sundae);

		 Hamburger.setText(Integer.toString(No_Hamburger));
		 Subtotal.setText("$"+Double.toString(subTotal));
		 salesTax =  (5 * No_Hamburger)*0.075 + (6 * No_CheeseBurger)*0.075 + (2 * No_Fries)*0.075 + (2 * No_FountainDrink)*0.075 + (3 * No_Sundae)*0.075;
		 String tax = String.format("%.2f", salesTax);
		 Salestax_ofItems.setText("$"+tax); 
	        grandTotal = subTotal + salesTax;
		  Grandtotal.setText("$"+Double.toString(grandTotal));

	}



	public void removeCheeseburger(ActionEvent event) {

		if(No_CheeseBurger == 0) {
			No_CheeseBurger = 0;
		}
		else {
			No_CheeseBurger--;
		}
		subTotal =  (5 * No_Hamburger) + (6 * No_CheeseBurger) + (2 * No_Fries) + (2 * No_FountainDrink) + (3 * No_Sundae);
		Cheeseburger.setText(Integer.toString(No_CheeseBurger));
		Subtotal.setText("$"+Double.toString(subTotal));
		salesTax =  (5 * No_Hamburger)*0.075 + (6 * No_CheeseBurger)*0.075 + (2 * No_Fries)*0.075 + (2 * No_FountainDrink)*0.075 + (3 * No_Sundae)*0.075;

		 String tax = String.format("%.2f", salesTax);
		 Salestax_ofItems.setText("$"+tax); 

		grandTotal = subTotal + salesTax;
		Grandtotal.setText("$"+Double.toString(grandTotal));
	}
	public void addCheeseburger(ActionEvent event) {
		No_CheeseBurger++;
		subTotal =  (5 * No_Hamburger) + (6 * No_CheeseBurger) + (2 * No_Fries) + (2 * No_FountainDrink) + (3 * No_Sundae);
		Cheeseburger.setText(Integer.toString(No_CheeseBurger));
		Subtotal.setText("$"+Double.toString(subTotal));
		salesTax =  (5 * No_Hamburger)*0.075 + (6 * No_CheeseBurger)*0.075 + (2 * No_Fries)*0.075 + (2 * No_FountainDrink)*0.075 + (3 * No_Sundae)*0.075;

		 String tax = String.format("%.2f", salesTax);
		 Salestax_ofItems.setText("$"+tax); 

		grandTotal = subTotal + salesTax;
		Grandtotal.setText("$"+Double.toString(grandTotal));
	}


	public void removeFries(ActionEvent event) {

		if(No_Fries == 0) {
			No_Fries = 0;
		}
		else {
			No_Fries--;
		}
		Fries.setText(Integer.toString(No_Fries)); 
		subTotal =  (5 * No_Hamburger) + (6 * No_CheeseBurger) + (2 * No_Fries) + (2 * No_FountainDrink) + (3 * No_Sundae);
		Subtotal.setText("$"+Double.toString(subTotal));
		salesTax =  (5 * No_Hamburger)*0.075 + (6 * No_CheeseBurger)*0.075 + (2 * No_Fries)*0.075 + (2 * No_FountainDrink)*0.075 + (3 * No_Sundae)*0.075;

		 String tax = String.format("%.2f", salesTax);
		 Salestax_ofItems.setText("$"+tax); 

		grandTotal = subTotal + salesTax;
		Grandtotal.setText("$"+Double.toString(grandTotal));
	}
	public void addFries(ActionEvent event) {
		No_Fries++;
		Fries.setText(Integer.toString(No_Fries));
		subTotal =  (5 * No_Hamburger) + (6 * No_CheeseBurger) + (2 * No_Fries) + (2 * No_FountainDrink) + (3 * No_Sundae);
		Subtotal.setText("$"+Double.toString(subTotal));
		salesTax =  (5 * No_Hamburger)*0.075 + (6 * No_CheeseBurger)*0.075 + (2 * No_Fries)*0.075 + (2 * No_FountainDrink)*0.075 + (3 * No_Sundae)*0.075;

		 String tax = String.format("%.2f", salesTax);
		 Salestax_ofItems.setText("$"+tax); 
		grandTotal = subTotal + salesTax;
		Grandtotal.setText("$"+Double.toString(grandTotal));
	}


	public void removeFountainDrink(ActionEvent event) {

		if(No_FountainDrink == 0) {
			No_FountainDrink = 0;
		}
		else {
			No_FountainDrink--;
		}
		FountainDrinks.setText(Integer.toString(No_FountainDrink)); 
		subTotal =  (5 * No_Hamburger) + (6 * No_CheeseBurger) + (2 * No_Fries) + (2 * No_FountainDrink) + (3 * No_Sundae);
		Subtotal.setText("$"+Double.toString(subTotal));
		salesTax =  (5 * No_Hamburger)*0.075 + (6 * No_CheeseBurger)*0.075 + (2 * No_Fries)*0.075 + (2 * No_FountainDrink)*0.075 + (3 * No_Sundae)*0.075;

		 String tax = String.format("%.2f", salesTax);
		 Salestax_ofItems.setText("$"+tax); 
		grandTotal = subTotal + salesTax;
		Grandtotal.setText("$"+Double.toString(grandTotal));
	}
	public void addFountainDrink(ActionEvent event) {
		No_FountainDrink++;
		FountainDrinks.setText(Integer.toString(No_FountainDrink)); 
		subTotal =  (5 * No_Hamburger) + (6 * No_CheeseBurger) + (2 * No_Fries) + (2 * No_FountainDrink) + (3 * No_Sundae);

		Subtotal.setText("$"+Double.toString(subTotal));
		salesTax =  (5 * No_Hamburger)*0.075 + (6 * No_CheeseBurger)*0.075 + (2 * No_Fries)*0.075 + (2 * No_FountainDrink)*0.075 + (3 * No_Sundae)*0.075;

		 String tax = String.format("%.2f", salesTax);
		 Salestax_ofItems.setText("$"+tax); 
		grandTotal = subTotal + salesTax;
		Grandtotal.setText("$"+Double.toString(grandTotal));
	}

	public void removeSundae(ActionEvent event) {

		if(No_Sundae == 0) {
			No_Sundae = 0;

		}
		else {
			No_Sundae--;
		}

		  Sundae.setText(Integer.toString(No_Sundae));
			subTotal =  (5 * No_Hamburger) + (6 * No_CheeseBurger) + (2 * No_Fries) + (2 * No_FountainDrink) + (3 * No_Sundae);
		  Subtotal.setText("$"+Double.toString(subTotal));
		  salesTax =  (5 * No_Hamburger)*0.075 + (6 * No_CheeseBurger)*0.075 + (2 * No_Fries)*0.075 + (2 * No_FountainDrink)*0.075 + (3 * No_Sundae)*0.075;
			 String tax = String.format("%.2f", salesTax);
			 Salestax_ofItems.setText("$"+tax); 
		  grandTotal = subTotal + salesTax;
		  Grandtotal.setText("$"+Double.toString(grandTotal));

	}
	public void addSundae(ActionEvent event) {
		No_Sundae++;

		  Sundae.setText(Integer.toString(No_Sundae));
			subTotal =  (5 * No_Hamburger) + (6 * No_CheeseBurger) + (2 * No_Fries) + (2 * No_FountainDrink) + (3 * No_Sundae);
		  Subtotal.setText("$"+Double.toString(subTotal));
		  salesTax =  (5 * No_Hamburger)*0.075 + (6 * No_CheeseBurger)*0.075 + (2 * No_Fries)*0.075 + (2 * No_FountainDrink)*0.075 + (3 * No_Sundae)*0.075;
			 String tax = String.format("%.2f", salesTax);
			 Salestax_ofItems.setText("$"+tax); 
		  grandTotal = subTotal + salesTax;
		  Grandtotal.setText("$"+Double.toString(grandTotal));

	}

	public void No_Hamburger_String() { 

		System.out.println(Hamburger);
	}


	public void No_CheeseBurger_String() { 

		System.out.println(Cheeseburger);
	}

	public void No_Fries_String() { 

		System.out.println(Fries);
	}

	public void No_FountainDrink_String() { 

		System.out.println(FountainDrinks);
	}

	public void No_Sundae_String() { 

		System.out.println(Sundae);
	}

	public void Subtotal_String() { 

		System.out.println(Subtotal);
	}
	public void SalesTax_String() { 

		System.out.println(Salestax_ofItems);
	}

	public void GrandTotal_String() { 

		System.out.println(Grandtotal);
	}

	public void ChangeToPaymentPage(ActionEvent event) throws Exception {

		
		Parent paymentPage = FXMLLoader.load(getClass().getResource("payment.fxml"));
		Scene paymentScene = new Scene(paymentPage);
		Stage window = (Stage)(((Node) event.getSource()).getScene().getWindow());
		window.setTitle("Thank you for your business");
		window.setScene(paymentScene);
		window.show();
	}

	
	public void verify(ActionEvent event) throws NumberFormatException, IOException {
		boolean check = true;
	
		try {
			 Long.parseLong(cardNo.getText().toString());
			 Integer.parseInt(expiration.getText().toString());
			 Integer.parseInt(CVV.getText().toString());
			 Integer.parseInt(Zip_Code.getText().toString());
			
					
		} catch (NumberFormatException e) {
			Alert invalidCard2 = new Alert(AlertType.ERROR);
			invalidCard2.setHeaderText("Card Information Invalid");
			invalidCard2.setContentText("All values should be numeric");
			invalidCard2.showAndWait();
			check = false;
		}
		
		if (check) {
			if (cardNo.getText().length() == 16 && expiration.getText().length() == 4 && CVV.getText().length() == 3 && Zip_Code.getText().length() == 6) {
				Parent paymentPage = FXMLLoader.load(getClass().getResource("ThankYouPage.fxml"));
				Scene paymentScene = new Scene(paymentPage);
				Stage window = (Stage)(((Node) event.getSource()).getScene().getWindow());
				window.setTitle("Thank you for your business");
				window.setScene(paymentScene);
				window.show();
				System.exit(0);
			} else {
				Alert invalidCard = new Alert(AlertType.ERROR);
				invalidCard.setHeaderText("Card Information Invalid");
				invalidCard.setContentText("Card Number should be 16 digits, expiration 4 digits, CVV 3 digits, and Zip Code 5 digits");
				invalidCard.showAndWait();
			}
		}
	
	}

	
	public void back(ActionEvent event) throws IOException {
		
		Parent paymentPage = FXMLLoader.load(getClass().getResource("home.fxml"));
        Scene paymentScene = new Scene(paymentPage);
        Stage window = (Stage)(((Node) event.getSource()).getScene().getWindow());
        window.setScene(paymentScene);
        window.show();
	}
	

}



