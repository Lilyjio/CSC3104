package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;
//import javafx.geometry.Insets;
 
public class Admin_login extends Application{
	
	public void start(Stage primaryStage) {
		Label t1,t1_1,t2,t3,userName,passWord;
		TextField tfUserName, tfPassWord;
		Button b1,b2;
		
		t1 = new Label("Wonderful Moment");
		t1.setFont(Font.font("Arial", FontWeight.BOLD,40));
		t1_1 = new Label("Restaurant");
		t1_1.setFont(Font.font("Arial", FontWeight.BOLD,40));
		
		t2 = new Label("Admin Login");
		t2.setFont(Font.font("Arial",20));
		t2.setUnderline(true);
		t3 = new Label("Login");
		t3.setFont(Font.font("Arial", FontWeight.BOLD,25));
		
		userName = new Label("UserName:");
		userName.setFont(Font.font("Arial",20));
		passWord = new Label("Password:");
		passWord.setFont(Font.font("Arial",20));
		
		tfUserName = new TextField();
		tfUserName.setStyle("-fx-background-color:YELLOW");
		tfUserName.setMaxWidth(150);
		
		tfPassWord = new TextField();
		tfPassWord.setStyle("-fx-background-color:YELLOW");
		tfPassWord.setMaxWidth(150);
		
		b1 = new Button("Login");
		b1.setStyle("-fx-background-color:YELLOW; -fx-background-radius: 50; -fx-border-radius: 50; -fx-border-color: black; -fx-border-width: 1; -fx-font-size: 15;");
		b1.setMinWidth(100); // Set the minimum width of the button
		b1.setMinHeight(30); // Set the minimum height of the button
		
		b2 = new Button("Sign up");
		b2.setStyle("-fx-background-color:YELLOW; -fx-background-radius: 50; -fx-border-radius: 50; -fx-border-color: black; -fx-border-width: 1; -fx-font-size: 15;");
		b2.setMinWidth(100); // Set the minimum width of the button
		b2.setMinHeight(30); // Set the minimum height of the button
		
		// Set absolute position
		t1.setTranslateX(200); // X-coordinate
        t1.setTranslateY(30); // Y-coordinate
        
        t1_1.setTranslateX(250);  
        t1_1.setTranslateY(80);  
        
        t2.setTranslateX(650);  
        t2.setTranslateY(30);  
        
        t3.setTranslateX(220);  
        t3.setTranslateY(180);  
        
        userName.setTranslateX(220);  
        userName.setTranslateY(250);  
        
        tfUserName.setTranslateX(350);  
        tfUserName.setTranslateY(250);  
        
        passWord.setTranslateX(220);  
        passWord.setTranslateY(300);  
        
        tfPassWord.setTranslateX(350);  
        tfPassWord.setTranslateY(300);  
        
        b1.setTranslateX(450);  
        b1.setTranslateY(350); 
        
        b2.setTranslateX(450);  
        b2.setTranslateY(400);  
        
        
         // Create a Pane and add all the elements
        Pane pane = new Pane();
        pane.getChildren().addAll(t1,t1_1, t2, t3, userName, tfUserName, passWord, tfPassWord, b1, b2);
          
        Pane pane4 = new Pane();
        pane4.getChildren().addAll(pane);

        // Create the scene
        Scene scene = new Scene(pane4, 800, 500);

        primaryStage.setTitle("Admin Login");
        primaryStage.setScene(scene);
        primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}

