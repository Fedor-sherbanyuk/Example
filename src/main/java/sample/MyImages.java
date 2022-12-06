package sample;

import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.*;



public class MyImages extends Application {

    Image image = new Image("res/my_foto.jpg");

    @Override
    public void start(Stage primaryStage) {
        ImageView colorView = new ImageView(image);
        ImageView bhView = new ImageView(image);

        ColorAdjust colorAdjust = new ColorAdjust();
        colorAdjust.setBrightness(-1);
        bhView.setEffect(colorAdjust);

        primaryStage.setScene(new Scene(new VBox(colorView, bhView)));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
//public class MyImages {
//
//    public static void main(String[] args) {
//        BufferedImage blackAndWhiteImage = new BufferedImage(
//                dWidth.intValue(),
//                dHeight.intValue(),
//                BufferedImage.TYPE_BYTE_BINARY);
//        Graphics2D graphics = blackAndWhiteImage.createGraphics();
//        graphics.drawImage(colourImage, 0, 0, null);
//
//        return blackAndWhiteImage;
////       launch(args);
////        extends Application
//    }



//    @Override
//    public void start(Stage stage) throws Exception {
//        stage.setTitle("My photo");
//        FlowPane flowPane=new FlowPane();
//        flowPane.setAlignment(Pos.CENTER);
//        Scene scene=new Scene(flowPane,400,300);
//        stage.setScene(scene);
//        Image image=new Image("../res/my_foto.jpg");
//        ImageView imageView=new ImageView(image);
//        flowPane.getChildren().add(imageView);
//        stage.show();
//
//    }
