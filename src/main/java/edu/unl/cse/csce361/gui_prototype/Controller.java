package edu.unl.cse.csce361.gui_prototype;

import javafx.event.ActionEvent;

public class Controller {
	
	public int noOfItems = 0;
	
	public void removeButton(ActionEvent event) {
		
		if(noOfItems == 0) {
			noOfItems = 0;
		}
		else {
			noOfItems--;
		}
	}
	public void addButton(ActionEvent event) {
		noOfItems++;
	}
	
}
