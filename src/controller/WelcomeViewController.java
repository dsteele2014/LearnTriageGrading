package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class WelcomeViewController {

	@FXML private Button takeQuizButton;
	@FXML private Button quitButton;
	private Main main;
	

	public void setMain(Main main) {
		this.main=main;
	}
	
	@FXML
	public void handleTakeQuizButton(){
		main.showQuizWindow();
	}
	
	@FXML
	public void handleQuitButton(){
		main.closeWindow();
	}

	
	
}
