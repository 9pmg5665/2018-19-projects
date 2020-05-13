/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 *
 * @author conno
 */
public class JavaFXApplication1 extends Application {
    
    
    public void start(Stage primaryStage) {
        Line oney = new Line(100,70,100,250);
        Line twoy = new Line(100,250,400,250);
        Line three = new Line(100,70,400,250);
        
        Group root = new Group(oney, twoy, three);
        
        
        Scene scene = new Scene(root, 600, 600);
        
        primaryStage.setTitle("Triangle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}