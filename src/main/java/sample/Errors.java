package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class Errors {
    public static void display(String title, String message) {

        Stage window =new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);

        Label textoferror=new Label();
        textoferror.setText(message);
        Button closeWindow=new Button("OK");
        closeWindow.setOnAction(e->window.close());

        VBox layoutofwindow=new VBox(10);
        layoutofwindow.getChildren().addAll(textoferror,closeWindow);
        layoutofwindow.setAlignment(Pos.CENTER);

        Scene scene=new Scene(layoutofwindow,200,150);

        window.setScene(scene);
        window.showAndWait();


    }
}
