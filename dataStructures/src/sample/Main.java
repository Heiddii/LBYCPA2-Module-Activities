package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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

        btn1.setOnAction(e -> {
           
            Locker locker = new Locker();

            textArea.setText("Static arrays can be thought of as school lockers, where they have a: \n" +
                    "(1) Fixed size, irrespective of the items being store, and whether it is full or not\n" +
                    "(2) Common 'data type' being stored, which are the school items\n" +
                    "(3) Finite count, irrespective of the student count\n" +
                    "(4) Locker number, which systematizes the students' locker location\n\n" +
                    "Access: Locker numbers are the main method of indexing\n\n"+
                    "Search: To find a specific item with an unknown locker number, lockers can be opened randomly and not necessarily in an ordinal way.\n\n" +
                    "Insert: The latest student who avails a locker must be successive to a locker that's been availed\n\n" +
                    "Delete: When a student removes an item, say in the middle, all succeeding items will be shifted to fill up the freed up space\n\n");
            root1.getChildren().setAll(btn1, btn2, btn3, btn4,btn5,btn6, btn7, btn8,
                    line_top, line_part, textArea,
                    locker.Locker(225, 150, "1"),
                    locker.Locker(400, 150, "2"),
                    locker.Locker(575, 150, "3"));
        });
        
        btn2.setOnAction(e -> {
            textArea.setText("Dynamic arrays is an array that when all the elements space is consumed its size will increase. " +
                            "There is no perfect analogy for dynamic array since the world is limited resources.\n\n" +
                            "College courses is one of the things that is the analogy chosen by the programmer.\n\n" +
                            "The reason this was chosen by the programmer because after classes are filled with students some students still have not their schedules will open more. \n\n" +
                            "The access, search, insert, and delete is the same as the static array.\n\n" +
                            "Except if you insert a data and it is the max capacity it will add more empty data.");
             Image sched = new Image("sample/schedule.png");
            final ImageView schedule= new ImageView();
            schedule.setImage(sched);
            schedule.setFitHeight(200);
            schedule.setFitWidth(400);
            schedule.setX(300);
            schedule.setY(150);
            root1.getChildren().setAll(btn1, btn2, btn3, btn4,btn5,btn6, btn7, btn8, line_top, line_part, textArea);
        });

        btn3.setOnAction(e -> {
            Clinic clinic = new Clinic();

            textArea.setText("Singly-Linked List can be related to a doctor's appointment (or a job interview), where in " +
                    "clients, or the patients must be called in an ordinal manner. For a patient to be reached and called-in " +
                    "preceding patients must first be accommodated or traversed\n\n" +
                    "Access: Patients can choose to sit anywhere, but is still sorted in an ordinal manner either by appointment or walk-in\n\n" +
                    "Search: The 'next' patient is called-in only after the previous one\n\n" +
                    "Insert: \n(1) At the front - the patient who originally have a scheduled appointment, and is right on time is prioritized over walk-ins." +
                    "\n(2) In the middle - the patient who originally have a scheduled appointment, but is earlier than expected, " +
                    "has no priority over earlier walk-ins but has so in later walk-ins" +
                    "\n(3) At the end - the walk-in patients\n\n" +
                    "Delete: A patient cancelling an appointment would free a time slot, and so it must shift all patients to an " +
                    "earlier call-in but still must respect the ordinal sorting.\n\n");
            root1.getChildren().setAll(btn1, btn2, btn3, btn4,btn5,btn6, btn7, btn8,
                    line_top, line_part, textArea,
                    clinic.clinic(), clinic.patients());
        });
        
        btn4.setOnAction(e -> {
            textArea.setText("A doubly-link list is creating a playlist\n\n"
                            + "To insert a data you can add it to the first or the last or after an element "
                            + "When the playlist is playing you can move backward or forward\n\n"
                            + "In deleting an element is similar in a sense since you can delete anything inside on the playlist"
                            + "Same as a playlist when searching a data it can see if the data is in or not"
                            + "Lastly the data in can be presented in a forward or backward manner which is also possible in a playlist");
            Image play = new Image("sample/play.jpg");
            final ImageView player= new ImageView();
            player.setImage(play);
            player.setFitHeight(200);
            player.setFitWidth(400);
            player.setX(300);
            player.setY(150);
            root1.getChildren().setAll(btn1, btn2, btn3, btn4,btn5,btn6, btn7, btn8,
                    line_top, line_part, textArea, player);
        });
        
        btn5.setOnAction(e -> {
            textArea.setText("Stack could be visualized as a stack of books, where anyone could add or remove a book " +
                    "but by first going through the topmost book, in order to not change the arrangement of the other books at the bottom.\n\n" +
                    "Access: To access a certain book, one would start at the top and remove others from the stack\n\n" +
                    "Search: Similar to accessing, it will start from the top and remove the other books to find the book\n\n" +
                    "Insert: Books can only be inserted at the top of the stack\n\n" +
                    "Delete: The book that will be removed first is the book at the top of the stack\n\n");
            root1.getChildren().setAll(btn1, btn2, btn3, btn4,btn5,btn6, btn7, btn8,
                    line_top, line_part, textArea,
                    Book.Container(325,95),
                    Book.Space(350,75),
                    Book.BookA(350,300), Book.number(305,290,"Book 1"),
                    Book.BookB(350,225), Book.number(305,290-75,"Book 2"),
                    Book.BookC(350,150), Book.number(305,290-150,"Book 3"));
        });

        btn6.setOnAction(e -> {
            textArea.setText(" Queue is the as lining up to an event because it follows the first in first out rule\n\n"
                            + "Access: Similar to lining up to an event the first one to go in will always be the first one who lined up\n\n" 
                            + "Insert: When inserting data it is always is behind the one who lined up first which is similar to lining up\n\n"
                            + "Delete: When deleting a data you will clear out the first one same with an event people lined up for the first one to go in is always the one in the front\n\n"
                            + "Search: When searching of data it is the same when accessing and deleting it you can only see the first data\n\n");
             Lineup line = new Lineup();
            root1.getChildren().setAll(btn1, btn2, btn3, btn4,btn5,btn6, btn7, btn8,
                    line_top, line_part, textArea,
                    line.People(20 , -20 , "1"), line.People(70 , -20 , "2"),
                    line.People(120 , -20 , "3"),
                    line.People(20 , 30 , "1"), line.People(70 , 30 , "2"),
                    line.People(120 , 30 , "3"), line.People(170 , 30 , "4"),
                    line.People(20 , 80 , "2"),
                    line.People(70 , 80 , "3"), line.People(120 , 80 , "4"));
        });

        btn7.setOnAction(e -> {
            textArea.setText("What is a binary search tree?\n" +
                    "\n" +
                    "\t- Think of it as dictionaries having keys and values\n" +
                    "\t- Blockchain technology can be considered a real life application" +
                    "\n" + "since it can be hard to hack and keys/values can be stored in a ledger." +
                    "\n" +
                    "Value of the key: left < parent (node) < right\n" +
                    "\n" +
                    "??? Search: Searches an element in a tree.\n" +
                    "Compare values against its roots (left||right) and parent (node)\n" +
                    "??? Insert: Inserts an element in a tree.\n" +
                    "??? Pre-order Traversal: Traverses a tree in a pre-order manner.\n" +
                    "??? In-order Traversal: Traverses a tree in an in-order manner.\n" +
                    "Post-order Traversal: Traverses a tree in a post-order manner.");


            Image blockchain = new Image("sample/blockchain.jpg");
            final ImageView blockandchain = new ImageView();
            blockandchain.setImage(blockchain);
            blockandchain.setX(300);
            blockandchain.setY(150);
            root1.getChildren().setAll(btn1, btn2, btn3, btn4,btn5,btn6, btn7, btn8,
                    line_top, line_part, textArea,blockandchain);
        });

        btn8.setOnAction(e -> {
            textArea.setText("A hash table is like a shopping list "
                            + "A hash table uses index which enumerate the data to numbers"
                            + "When inserting data it enumerates it to things alike.");
            Image list = new Image("sample\shopping list.png");
            final ImageView shoplist = new ImageView();
            shoplist.setImage(list);
            shoplist.setX(300);
            shoplist.setY(150);
            root1.getChildren().setAll(btn1, btn2, btn3, btn4,btn5,btn6, btn7, btn8,
                    line_top, line_part, textArea, shoplist);
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
