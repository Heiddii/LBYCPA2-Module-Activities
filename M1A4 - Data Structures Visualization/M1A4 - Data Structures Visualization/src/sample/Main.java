package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class Main extends Application {

    private static final int BTN_Y_PADDING = 8;
    private static final int BTN_X_PADDING = 8;
    private static final int BTN_HEIGHT = 25;
    private static final int SCENE_WIDTH = 775;
    private static final int SCENE_HEIGHT = 450;

    @Override
    public void start(Stage primaryStage) throws Exception{

        //Buttons
        Button btn1 = new Button("Static Array");
        btn1.setLayoutX(BTN_X_PADDING);
        btn1.setLayoutY(BTN_Y_PADDING);

        Button btn2 = new Button("Dynamic Array");
        btn2.setLayoutX(76+BTN_X_PADDING*2);
        btn2.setLayoutY(BTN_Y_PADDING);

        Button btn3 = new Button("Singly-Linked List");
        btn3.setLayoutX(169+BTN_X_PADDING*3);
        btn3.setLayoutY(BTN_Y_PADDING);

        Button btn4 = new Button("Doubly-Linked List");
        btn4.setLayoutX(277+BTN_X_PADDING*4);
        btn4.setLayoutY(BTN_Y_PADDING);

        Button btn5 = new Button("Stack");
        btn5.setLayoutX(391+BTN_X_PADDING*5);
        btn5.setLayoutY(BTN_Y_PADDING);

        Button btn6 = new Button("Queue");
        btn6.setLayoutX(435+BTN_X_PADDING*6);
        btn6.setLayoutY(BTN_Y_PADDING);

        Button btn7 = new Button("Binary Search Tree");
        btn7.setLayoutX(486+BTN_X_PADDING*7);
        btn7.setLayoutY(BTN_Y_PADDING);

        Button btn8 = new Button("Hash Table");
        btn8.setLayoutX(600+BTN_X_PADDING*8);
        btn8.setLayoutY(BTN_Y_PADDING);

        //Main Layout
        Pane root1 = new Pane();

        Line line_top = new Line();
        line_top.setStartX(BTN_X_PADDING);
        line_top.setStartY(BTN_HEIGHT + BTN_Y_PADDING * 2);
        line_top.setEndX(SCENE_WIDTH-BTN_X_PADDING);
        line_top.setEndY(BTN_HEIGHT + BTN_Y_PADDING * 2);

        Line line_part = new Line();
        line_part.setStartX(200);
        line_part.setStartY(BTN_HEIGHT + BTN_Y_PADDING * 2);
        line_part.setEndX(200);
        line_part.setEndY(SCENE_HEIGHT-BTN_Y_PADDING);

        TextArea textArea = new TextArea();
        textArea.setWrapText(true);
        textArea.setEditable(false);
        textArea.setMaxWidth(184);
        textArea.setPrefHeight(SCENE_HEIGHT-BTN_HEIGHT-BTN_Y_PADDING*5);
        textArea.setLayoutX(BTN_X_PADDING);
        textArea.setLayoutY(BTN_Y_PADDING*3+BTN_HEIGHT);

        root1.getChildren().setAll(btn1, btn2, btn3, btn4,btn5,btn6, btn7, btn8, line_top, line_part, textArea);

        /**
         * Usage: Code your objects, then add object at
         * root1.getChildren().setAll(btn1, btn2, btn3, btn4,text, your objects...,n);
         */
        btn1.setOnAction(e -> {
            // Lockers
            Locker locker = new Locker();

            textArea.setText("Static arrays can be thought of as school lockers, where there is a finite number of lockers which" +
                    "is or isn't enough for all the students.\n" +
                    "Access: Lockers are numbered, the primary system of allocation for students\n\n" +
                    "Search: To find a specific item with an unknown locker number, a locker and the succeeding lockers must be opened until it is located \n\n" +
                    "Insert: Students put items, ideally in a systematic back-to-front or left-to-right way\n\n" +
                    "Delete: When a student removes an item, say in the middle, all succeeding items will be shifted to fill up the freed up space\n\n");
            root1.getChildren().setAll(btn1, btn2, btn3, btn4,btn5,btn6, btn7, btn8,
                    line_top, line_part, textArea,
                    locker.Locker(225, 150), locker.inner_rect(225,150), locker.handle(225,150), locker.locker_number(225,150,"1"),
                    locker.Locker(400,150), locker.inner_rect(400,150), locker.handle(400,150), locker.locker_number(400, 150,"2"),
                    locker.Locker(575,150), locker.inner_rect(575,150), locker.handle(575,150), locker.locker_number(575, 150,"3"));
        });

        btn2.setOnAction(e -> {
            textArea.setText("Explanation for Dynamic Array");
            root1.getChildren().setAll(btn1, btn2, btn3, btn4,btn5,btn6, btn7, btn8, line_top, line_part, textArea);
        });

        btn3.setOnAction(e -> {
            textArea.setText("Explanation for Singly-Linked List");
            root1.getChildren().setAll(btn1, btn2, btn3, btn4,btn5,btn6, btn7, btn8,
                    line_top, line_part, textArea);
        });

        btn4.setOnAction(e -> {
            textArea.setText("Explanation for Doubly-Linked List");
            root1.getChildren().setAll(btn1, btn2, btn3, btn4,btn5,btn6, btn7, btn8,
                    line_top, line_part, textArea);
        });

        btn5.setOnAction(e -> {
            textArea.setText("Explanation for Stack");
            root1.getChildren().setAll(btn1, btn2, btn3, btn4,btn5,btn6, btn7, btn8,
                    line_top, line_part, textArea);
        });

        btn6.setOnAction(e -> {
            textArea.setText("Explanation for Queue");
            root1.getChildren().setAll(btn1, btn2, btn3, btn4,btn5,btn6, btn7, btn8,
                    line_top, line_part, textArea);
        });

        btn7.setOnAction(e -> {
            textArea.setText("Explanation for Binary Search Tree");
            root1.getChildren().setAll(btn1, btn2, btn3, btn4,btn5,btn6, btn7, btn8,
                    line_top, line_part, textArea);
        });

        btn8.setOnAction(e -> {
            textArea.setText("Explanation for Hash Table");
            root1.getChildren().setAll(btn1, btn2, btn3, btn4,btn5,btn6, btn7, btn8,
                    line_top, line_part, textArea);
        });

        Scene sceneStaticArray = new Scene(root1, 775,450);

        primaryStage.setTitle("Data Structures");
        primaryStage.setScene(sceneStaticArray);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}

