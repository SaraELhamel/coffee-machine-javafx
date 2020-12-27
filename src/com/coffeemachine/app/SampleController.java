package com.coffeemachine.app;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class SampleController implements Initializable  {
	
	 @FXML private TextField NameTextField;
	  @FXML private TextField phoneTextField;
	  @FXML private TextField idrefTextField;
	  @FXML private TextField accesscodeTextField;
	  
	  
	  private void AddButton() {
		  System.out.println(list);
		  String name= NameTextField.getText();
		  list.add(name);
		  System.out.println(list);
		  String phone= phoneTextField.getText();
		  String idref= idrefTextField.getText();
		 		 
		  
		 
		  
	  }
	  ArrayList<String> list = new ArrayList<String>();
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
}
