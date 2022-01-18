package sample;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class Locker{
    public static final float HEIGHT = 225;
    public static final float WIDTH = 175;
    public static final float PADDING = 8;

    public Rectangle Locker(int x, int y){
        Rectangle rect = new Rectangle(WIDTH, HEIGHT);
        rect.setX(x);
        rect.setY(y);
        rect.setFill(Color.LIGHTGRAY);
        rect.setStroke(Color.BLACK);

        return rect;
    }

    public Rectangle inner_rect(int x, int y){
        Rectangle inner_rect = new Rectangle(WIDTH-PADDING*2, HEIGHT-PADDING*2);
        inner_rect.setX(x+PADDING);
        inner_rect.setY(y+PADDING);
        inner_rect.setFill(Color.LIGHTGRAY);
        inner_rect.setStroke(Color.BLACK);
        return inner_rect;
    }

    public Ellipse handle(int x, int y){
        Ellipse ellip = new Ellipse();
        ellip.setRadiusX(5);
        ellip.setRadiusY(25);
        ellip.setLayoutX(x+25);
        ellip.setLayoutY(y+125);
        return ellip;
    }

    public Label locker_number(int x, int y, String z){
        Label text = new Label(z);
        text.setFont(Font.font("Arial", 36));
        text.setLayoutX(x+WIDTH/2-PADDING);
        text.setLayoutY(y+25);

        return text;
    }
}
