package model;

import controller.AnswerViewController;
import controller.Main;
import controller.QuizViewController;

public class PopulateTextAreas {

	Main main;
	private AnswerViewController answerViewController;
	private QuizViewController quizViewController;
	private char userGrade;
	private String userScore;
	public void setMain(Main main, AnswerViewController answerViewController,QuizViewController quizViewController) {
		this.main = main;
		this.answerViewController = answerViewController;
		this.quizViewController = quizViewController;
	}
	Answers answers = quizViewController.answers;
	

	public String populateArea1(){
		translateGrade(answers.getAnswer1());
		String answer = ("You responded "+answers.getAnswer1()+". That would make the grade "+userGrade+". Or "+userScore+" as a percentage.");
		return answer;
	}
	
	public String populateArea2(){
		translateGrade(answers.getAnswer2());
		String answer = ("You responded "+answers.getAnswer2()+". That would make the grade "+userGrade+". Or "+userScore+" as a percentage.");
		return answer;
	}
	
	public String populateArea3(){
		translateGrade(answers.getAnswer3());
		String answer = ("You responded "+answers.getAnswer3()+". That would make the grade "+userGrade+". Or "+userScore+" as a percentage.");
		return answer;
	}
	
	public String populateArea4(){
		translateGrade(answers.getAnswer4());
		String answer = ("You responded "+answers.getAnswer4()+". That would make the grade "+userGrade+". Or "+userScore+" as a percentage.");
		return answer;
	}
	
	public void translateGrade(String answer){
		switch(answer){
			case "Excellent": 
				userGrade='A';
				userScore="100%";
			case "Okay":
			case "Poor":
			case "Didn't Try":
		}
	}
}
