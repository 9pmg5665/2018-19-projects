package Week6;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
public class DrawRectangle extends Application
{
 @Override
 public void start(Stage stage)
 {
 final double WIDTH = 400;
 final double HEIGHT = 400;

 Rectangle rect = new Rectangle(100, 100);
 rect.setFill(Color.RED);

 VBox root = new VBox();
 root.getChildren().add(rect);
 root.setAlignment(Pos.TOP_LEFT);
 Scene scene = new Scene(root, WIDTH, HEIGHT);

 // method goes here
scene.setOnMouseDragged(e -> {
 rect.setWidth(e.getX());
 rect.setHeight(e.getY());
 }
 );

 stage.setScene(scene);
 stage.setTitle("Draw Rectangle");
 stage.show();
 }

 public static void main(String[] args)
 {
 launch(args);
 }
}