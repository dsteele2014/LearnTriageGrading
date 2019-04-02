package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import model.Answers;

public class QuizViewController {

	private Main main;
	public Answers answers = new Answers();
	@FXML public RadioButton excellentButton1,excellentButton2,excellentButton3, excellentButton4;
	@FXML public RadioButton okayButton1, okayButton2, okayButton3, okayButton4;
	@FXML public RadioButton poorButton1, poorButton2, poorButton3, poorButton4;
	@FXML public RadioButton didntTryButton1, didntTryButton2, didntTryButton3, didntTryButton4;
	@FXML public Label errorLabel;
	
	public void setMain(Main main) {
		this.main=main;
	}
	
	@FXML
	public void handleExcellent1(){
		if(excellentButton1.isSelected()){
			okayButton1.setSelected(false);
			poorButton1.setSelected(false);
			didntTryButton1.setSelected(false);
			answers.setAnswer1("Excellent");
		}else{
			answers.setAnswer1("");
		}
	}
	@FXML
	public void handleExcellent2(){
		if(excellentButton2.isSelected()){
			okayButton2.setSelected(false);
			poorButton2.setSelected(false);
			didntTryButton2.setSelected(false);
			answers.setAnswer2("Excellent");
		}else{
			answers.setAnswer2("");
		}
	}
	@FXML
	public void handleExcellent3(){
		if(excellentButton3.isSelected()){
		okayButton3.setSelected(false);
		poorButton3.setSelected(false);
		didntTryButton3.setSelected(false);
		answers.setAnswer3("Excellent");
		}else{
			answers.setAnswer3("");
		}
	}
	@FXML
	public void handleExcellent4(){
		if(excellentButton4.isSelected()){
		okayButton4.setSelected(false);
		poorButton4.setSelected(false);
		didntTryButton4.setSelected(false);
		answers.setAnswer4("Excellent");
		}else{
			answers.setAnswer4("");
		}
	}
	@FXML
	public void handleOkay1(){
		if(okayButton1.isSelected()){
			excellentButton1.setSelected(false);
			poorButton1.setSelected(false);
			didntTryButton1.setSelected(false);
			answers.setAnswer1("Okay");
		}else{
			answers.setAnswer1("");
		}
	}
	@FXML
	public void handleOkay2(){
		if(okayButton2.isSelected()){
			excellentButton2.setSelected(false);
			poorButton2.setSelected(false);
			didntTryButton2.setSelected(false);
			answers.setAnswer2("Okay");
		}else{
			answers.setAnswer2("");
		}
	}
	@FXML
	public void handleOkay3(){
		if(okayButton3.isSelected()){
		excellentButton3.setSelected(false);
		poorButton3.setSelected(false);
		didntTryButton3.setSelected(false);
		answers.setAnswer3("Okay");
		}else{
			answers.setAnswer3("");
		}
	}
	@FXML
	public void handleOkay4(){
		if(okayButton4.isSelected()){

		excellentButton4.setSelected(false);
		poorButton4.setSelected(false);
		didntTryButton4.setSelected(false);
		answers.setAnswer4("Okay");
		}else{
			answers.setAnswer4("");
		}
	}
	@FXML
	public void handlePoor1(){
		if(poorButton1.isSelected()){

		excellentButton1.setSelected(false);
		okayButton1.setSelected(false);
		didntTryButton1.setSelected(false);
		answers.setAnswer1("Poor");
		}else{
			answers.setAnswer1("");
		}
	}
	@FXML
	public void handlePoor2(){
		if(poorButton2.isSelected()){

		excellentButton2.setSelected(false);
		okayButton2.setSelected(false);
		didntTryButton2.setSelected(false);
		answers.setAnswer2("Poor");
		}else{
			answers.setAnswer2("");
		}
	}
	@FXML
	public void handlePoor3(){
		if(poorButton3.isSelected()){

		excellentButton3.setSelected(false);
		okayButton3.setSelected(false);
		didntTryButton3.setSelected(false);
		answers.setAnswer3("Poor");
		}else{
			answers.setAnswer3("");
		}
	}
	@FXML
	public void handlePoor4(){
		if(poorButton4.isSelected()){

		excellentButton4.setSelected(false);
		okayButton4.setSelected(false);
		didntTryButton4.setSelected(false);
		answers.setAnswer4("Poor");
		}else{
			answers.setAnswer4("");
		}
	}
	@FXML
	public void handleDidntTry1(){
		if(didntTryButton1.isSelected()){

		excellentButton1.setSelected(false);
		okayButton1.setSelected(false);
		poorButton1.setSelected(false);
		answers.setAnswer1("Didn't Try");
		}else{
			answers.setAnswer1("");
		}
	}
	@FXML
	public void handleDidntTry2(){
		if(didntTryButton2.isSelected()){

		excellentButton2.setSelected(false);
		okayButton2.setSelected(false);
		poorButton2.setSelected(false);
		answers.setAnswer2("Didn't Try");
		}else{
			answers.setAnswer2("");
		}
	}
	@FXML
	public void handleDidntTry3(){
		if(didntTryButton3.isSelected()){

		excellentButton3.setSelected(false);
		okayButton3.setSelected(false);
		poorButton3.setSelected(false);
		answers.setAnswer3("Didn't Try");
		}else{
			answers.setAnswer3("");
		}
	}
	@FXML
	public void handleDidntTry4(){
		if(didntTryButton4.isSelected()){

		excellentButton4.setSelected(false);
		okayButton4.setSelected(false);
		poorButton4.setSelected(false);
		answers.setAnswer4("Didn't Try");
		}else{
			answers.setAnswer4("");
		}
	}
	
	@FXML
	public void handleSubmitButton(){
		System.out.println(answers.getAnswer1()+" "+answers.getAnswer2()+" "+answers.getAnswer3()+" "+answers.getAnswer4());
		if(answers.getAnswer1().equals("")||answers.getAnswer2().equals("")||answers.getAnswer3().equals("")||answers.getAnswer4().equals("")){
			errorLabel.setVisible(true);
		}else{
			main.showAnswerWindow();
		}
	}
	
	@FXML
	public void handleBackButton(){
		main.showWelcomeWindow();
	}
}
