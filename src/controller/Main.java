package controller;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.PopulateTextAreas;

public class Main extends Application{
	
	 public static void main(String[] args){
		 launch(args);
	 }
	 
	 private Stage primaryStage;
	 private AnchorPane pane;
	 private QuizViewController quizViewController;
	 @Override
	 public void start(Stage primaryStage){
		 this.primaryStage = primaryStage;
		 showWelcomeWindow();
	 }
	 
	 private void setSceneDefault(){
	        Scene scene = new Scene(pane);
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }

	public void showWelcomeWindow(){
		try{
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("/view/WelcomeView.fxml"));
			pane = loader.load();
			WelcomeViewController welcomeViewController = loader.getController();
			welcomeViewController.setMain(this);
			setSceneDefault();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void showQuizWindow(){
		try{
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("/view/QuizView.fxml"));
			pane = loader.load();
			quizViewController = loader.getController();
			quizViewController.setMain(this);
			setSceneDefault();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void showAnswerWindow(){
		try{
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("/view/AnswerView.fxml"));
			pane = loader.load();
			AnswerViewController answerViewController = loader.getController();
			answerViewController.setMain(this);
			setSceneDefault();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void closeWindow(){
		primaryStage.close();
	}
}
