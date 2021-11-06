package sample;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;


public class Book {
    public static final float HEIGHT = 75;
    public static final float WIDTH = 300;
    public static final float PADDING = 8;

    public static Rectangle Container(int x, int y){
        Rectangle cont = new Rectangle(350,300);
        cont.setX(x);
        cont.setY(y);
        cont.setFill(Color.BROWN);
        cont.setStroke(Color.BLACK);
        return cont;
    }

    public static Rectangle Space(int x, int y){
        Rectangle space = new Rectangle(WIDTH, HEIGHT);
        space.setX(x);
        space.setY(y);
        space.setFill(Color.WHITESMOKE);
        return space;
    }

    public static Rectangle BookA(int x, int y){
        Rectangle book1 = new Rectangle(WIDTH, HEIGHT);
        book1.setX(x);
        book1.setY(y);
        book1.setFill(Color.GREENYELLOW);
        book1.setStroke(Color.BLACK);
        return book1;
    }

    public static Rectangle BookB(int x, int y){
        Rectangle book1 = new Rectangle(WIDTH, HEIGHT);
        book1.setX(x);
        book1.setY(y);
        book1.setFill(Color.PALEGREEN);
        book1.setStroke(Color.BLACK);
        return book1;
    }

    public static Rectangle BookC(int x, int y){
        Rectangle book1 = new Rectangle(WIDTH, HEIGHT);
        book1.setX(x);
        book1.setY(y);
        book1.setFill(Color.TEAL);
        book1.setStroke(Color.BLACK);
        return book1;
    }

    public static Label number(int x, int y, String z){
        Label number = new Label(z);
        number.setFont(Font.font("Arial", 36));
        number.setLayoutX(x+WIDTH/2-PADDING);
        number.setLayoutY(y+25);

        return number;
    }


}
