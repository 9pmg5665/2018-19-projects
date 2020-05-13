package ultima;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
public class Ultimatum extends Application
{
 private Text text = new Text(60, 240, "Hello");

 public void start (Stage stage)
 {
 text.setFont(Font.font ("Verdana", 25));
 text.setFill(Color.BLUE);
 VBox root = new VBox();
 root.setBackground(Background.EMPTY);
 root.setAlignment(Pos.CENTER);
 root.getChildren().add(text);
 Scene scene = new Scene(root, 200, 200);
 stage.setScene(scene);
 stage.setTitle("Hello-Goodbye");
 stage.show();
 begin(stage);
 }

 private void begin(Stage stageIn)
 {
 Thread thread1 = new Thread(new Task<Void>()
 {
 @Override
 protected Void call()
 {
 /* While the stage is showing, send the thread to sleep for 1000 milliseconds and change. */
     while(stageIn.isShowing()){
        try{
            Thread.sleep(1000);
            }
        catch(InterruptedException e){}
     if(text.getText()=="Goodbye"){
        text.setText("Hello");
     } else{
        text.setText("Goodbye");
     }
    }
     return null;
 }
 });
 thread1.start();
 }
 public static void main(String[] args)
 {
 launch(args);
 }
}