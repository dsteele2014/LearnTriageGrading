package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import model.Answers;

public class AnswerViewController {

	private Main main;
	@FXML TextArea answer1TextArea;
	@FXML TextArea answer2TextArea;
	@FXML TextArea answer3TextArea;
	@FXML TextArea answer4TextArea;
	public Answers answers;
	
	public void setMain(Main main) {
		this.main=main;
		this.answer1TextArea = answer1TextArea;
		this.answer2TextArea = answer2TextArea;
		this.answer3TextArea = answer3TextArea;
		this.answer4TextArea = answer4TextArea;
	}
	
	
	@FXML
	public void handleMainMenuButton(){
		main.showWelcomeWindow();
	}
}
