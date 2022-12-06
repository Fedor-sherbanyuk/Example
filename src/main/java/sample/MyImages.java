package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MyImages extends Application {
    String url = "my_foto.jpg";
    Image image = new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT23HR2PMvibAtzOtTp1F9Mdb5TCccJGOIfbGtYfDFA4v23pi0EDQ7lmIMVRSKSjRQSApc&usqp=CAU");

    @Override
    public void start(Stage primaryStage) {
        ImageView colorView = new ImageView(image);
        ImageView bhView = new ImageView(image);

        ColorAdjust colorAdjust = new ColorAdjust();
        colorAdjust.setBrightness(-0.8);
        colorAdjust.setContrast(-0.7);

        bhView.setEffect(colorAdjust);

        primaryStage.setScene(new Scene(new VBox(colorView, bhView)));
        primaryStage.setTitle("Image");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}