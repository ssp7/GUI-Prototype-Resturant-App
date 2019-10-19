package edu.unl.cse.csce361.gui_prototype;

import java.awt.event.ActionEvent;

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
	
}
