package pl.truecolourz;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
 /  Projekt 3 so0168 2020
 */
public class Main extends Application {


    ImageView wolfvw;
    ImageView wolfvw2;
    ImageView wolfvw3;
    ImageView wolfvw4;


    @Override
    public void start(Stage primaryStage) throws Exception {
        // controls
        Button btn1= new Button("S");
        Button btn2= new Button("X");
        Button btn3= new Button("K");
        Button btn4= new Button("M");

        Button btn5 = new Button("");
        Button btn6 = new Button("");
        Button btn7 = new Button("");
        // game a b info buttons
        Label label1 = new Label("игра A");
        Label label2 = new Label("игра B");
        Label label3 = new Label("Инфо");

        Arc arc = new Arc(80,80,40,40,195,330);
        arc.setType(ArcType.OPEN);
        arc.setStroke(Color.rgb(55,55,55));
        arc.setFill(null);
        arc.setStrokeWidth(6);
       // arc.setFill(Color.BLACK);
        Polygon polyline = new Polygon( 10,328,
                                                59,340,
                                                48,363);

        Polygon polyline2 = new Polygon(10,490,
                48,460,
                59,483);




        Wolf wolf = new Wolf();                     // inicjowanie wilka
        wolf.setPosition(Position.LEFTDOWN);

        Text text = new Text("386");
        text.setFont(Font.loadFont("file:src/pl/truecolourz/res/Ticking.ttf",40));
        text.setX(477);
        text.setY(184);
        text.setLayoutY(2);


        btn1.setLayoutX(70);
        btn1.setLayoutY(339);
        btn1.getStyleClass().add("controlButtons");

        btn2.setLayoutX(70);
        btn2.setLayoutY(420);
        btn2.getStyleClass().add("controlButtons");

        btn3.setLayoutX(750);
        btn3.setLayoutY(339);
        btn3.getStyleClass().add("controlButtons");

        btn4.setLayoutX(750);
        btn4.setLayoutY(420);
        btn4.getStyleClass().add("controlButtons");

        btn5.setLayoutX(767);
        btn5.setLayoutY(50);
        btn5.setMaxSize(60,20);
        btn5.getStyleClass().add("settButtons");

        btn6.setLayoutX(767);
        btn6.setLayoutY(120);
        btn6.setMaxSize(60,20);
        btn6.getStyleClass().add("settButtons");

        btn7.setLayoutX(767);
        btn7.setLayoutY(190);
        btn7.setMaxSize(60,20);
        btn7.getStyleClass().add("settButtons");

        label1.setLayoutX(772);
        label1.setLayoutY(85);

        btn1.setOnAction( event -> {
                    System.out.println("dziala");
                });
        //
        //String strPath = Main.class.
        Image image  = new Image("file:src/pl/truecolourz/res/panelCons2.jpg");
        Image image2 = new Image("file:src/pl/truecolourz/res/mainView.png");
        Image hareBell = new Image("file:src/pl/truecolourz/res/bell.png");
        Image wolf1 = new Image("file:src/pl/truecolourz/res/wolfLeftUp.png");
        Image wolf2 = new Image("file:src/pl/truecolourz/res/wolfLeftDown.png");
        Image wolf3 = new Image("file:src/pl/truecolourz/res/wolfRightUP.png");
        Image wolf4 = new Image("file:src/pl/truecolourz/res/wolfRightDown.png");
        Image chick = new Image("file:src/pl/truecolourz/res/lives.png");
        Image egg = new Image("file:src/pl/truecolourz/res/egg.png");



        ImageView imageView = new ImageView(image);
        ImageView imageView2 = new ImageView(image2);
        ImageView imgVwHar = new ImageView(hareBell);
         wolfvw = new ImageView(wolf1);
         wolfvw2 = new ImageView(wolf2);
         wolfvw3 = new ImageView(wolf3);
         wolfvw4 = new ImageView(wolf4);
        ImageView lives = new ImageView(chick);
        ImageView eggVw = new ImageView(egg);
        // Wolfinits
        setWolf(Position.LEFTDOWN);

        // EGG
        eggVw.setPreserveRatio(true);
        eggVw.setFitWidth(22);
        eggVw.setX(271);
        eggVw.setY(215);

        //ImageView imgVwHar = new ImageView(hareBell);

        imageView.setOpacity(0.9);
        imageView2.setOpacity(0.8);

        imageView.setFitWidth(900);
        imageView.setFitHeight(535);


        imageView2.setFitWidth(415);
        imageView2.setPreserveRatio(true);
        imageView2.setX(237);
        imageView2.setY(140);

        imgVwHar.setPreserveRatio(true);
        imgVwHar.setFitWidth(90);
        imgVwHar.setX(305); //zajaczek
        imgVwHar.setY(162); //zajaczek

        wolfvw.setX(340);
        wolfvw.setY(249);
        wolfvw.setFitWidth(99);
        wolfvw.setPreserveRatio(true);

        wolfvw2.setX(334);
        wolfvw2.setY(250);
        wolfvw2.setFitWidth(105);
        wolfvw2.setPreserveRatio(true);

        wolfvw3.setX(460);
        wolfvw3.setY(250);
        wolfvw3.setFitWidth(99);
        wolfvw3.setPreserveRatio(true);

        wolfvw4.setX(460);
        wolfvw4.setY(251);
        wolfvw4.setFitWidth(105);
        wolfvw4.setPreserveRatio(true);

        lives.setX(460);
        lives.setY(190);
        lives.setFitWidth(20);
        lives.setPreserveRatio(true);

        Pane pane1=new Pane();
        Pane pane2=new Pane();
        StackPane stackPane = new StackPane();

        // sterowanie

        btn1.setOnAction(event -> {
            //le
            setWolf(Position.LEFTUP);
        });
        btn2.setOnAction(event ->{
            // Left Up
            setWolf(Position.LEFTDOWN);
        });
        btn3.setOnAction(event ->{
            // Right up
            setWolf(Position.RIGHTUP);
        });
        btn4.setOnAction(event ->{
            // Right down
            setWolf(Position.RIGHTDOWN);

        });

        pane1.getChildren().add(imageView);

        pane1.getChildren().add(text);

        pane2.getChildren().add(imageView2);
        pane2.getChildren().addAll(imgVwHar,label1,arc,polyline,polyline2);
        pane2.getChildren().addAll(wolfvw, wolfvw2,wolfvw3,wolfvw4);
        pane2.getChildren().addAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7);
        pane2.getChildren().add(lives);
        pane2.getChildren().add(eggVw);

        stackPane.getChildren().addAll(pane1,pane2);

        Scene scene = new Scene(stackPane,900,535);
        scene.getStylesheets().add("file:src/pl/truecolourz/res/style.css");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Ну, погоди! Ява е х гра");
        primaryStage.show();


        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
                                  @Override
                                  public void handle(KeyEvent event) {

                                      switch (event.getCode()){
                                          case A:
                                              setWolf(Position.LEFTUP);
                                              break;
                                          case Z:
                                              setWolf(Position.LEFTDOWN);
                                              break;
                                          case K:
                                              setWolf(Position.RIGHTUP);
                                              break;
                                          case M:
                                              setWolf(Position.RIGHTDOWN);
                                              break;
                                      }

                                  }
                              });


    }

    void setWolf(Position position) {
        switch (position){
            case LEFTUP:
                wolfvw.setVisible(true);
                wolfvw2.setVisible(false);
                wolfvw3.setVisible(false);
                wolfvw4.setVisible(false);
                break;
            case LEFTDOWN:
                wolfvw.setVisible(false);
                wolfvw2.setVisible(true);
                wolfvw3.setVisible(false);
                wolfvw4.setVisible(false);
                break;
            case RIGHTUP:
                wolfvw.setVisible(false);
                wolfvw2.setVisible(false);
                wolfvw3.setVisible(true);
                wolfvw4.setVisible(false);
                break;
            case RIGHTDOWN:
                wolfvw.setVisible(false);
                wolfvw2.setVisible(false);
                wolfvw3.setVisible(false);
                wolfvw4.setVisible(true);
                break;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
