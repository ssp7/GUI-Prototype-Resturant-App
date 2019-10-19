package edu.unl.cse.csce361.gui_prototype;

import javafx.event.ActionEvent;

public class Controller {

	public int No_Hamburger = 0;
	public int No_CheeseBurger = 0;
	public int No_Fries = 0;
	public int No_FountainDrink = 0;
	public int No_Sundae = 0;



	public void removeHamburger(ActionEvent event) {

		if(No_Hamburger == 0) {
			No_Hamburger = 0;
		}
		else {
			No_Hamburger--;
		}
	}
	public void addHamburger(ActionEvent event) {
		No_Hamburger++;
	}



	public void removeCheeseburger(ActionEvent event) {

		if(No_CheeseBurger == 0) {
			No_CheeseBurger = 0;
		}
		else {
			No_CheeseBurger--;
		}
	}
	public void addCheeseburger(ActionEvent event) {
		No_CheeseBurger++;
	}


	public void removeFries(ActionEvent event) {

		if(No_Fries == 0) {
			No_Fries = 0;
		}
		else {
			No_Fries--;
		}
	}
	public void addFries(ActionEvent event) {
		No_Fries++;
	}


	public void removeFountainDrink(ActionEvent event) {

		if(No_FountainDrink == 0) {
			No_FountainDrink = 0;
		}
		else {
			No_FountainDrink--;
		}
	}
	public void addFountainDrink(ActionEvent event) {
		No_FountainDrink++;
	}

	public void removeSundae(ActionEvent event) {

		if(No_Sundae == 0) {
			No_Sundae = 0;
		}
		else {
			No_Sundae--;
		}
	}
	public void addSundae(ActionEvent event) {
		No_Sundae++;
	}

}
