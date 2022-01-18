package sample;

import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class Locker{
    public static final float HEIGHT = 225;
    public static final float WIDTH = 175;
    public static final float PADDING = 8;

    public Group Locker(int x, int y, String z){
        Group group = new Group();

        Rectangle rect = new Rectangle(WIDTH, HEIGHT);
        rect.setX(x);
        rect.setY(y);
        rect.setFill(Color.LIGHTGRAY);
        rect.setStroke(Color.BLACK);

        Rectangle inner_rect = new Rectangle(WIDTH-PADDING*2, HEIGHT-PADDING*2);
        inner_rect.setX(x+PADDING);
        inner_rect.setY(y+PADDING);
        inner_rect.setFill(Color.LIGHTGRAY);
        inner_rect.setStroke(Color.BLACK);

        Ellipse ellip = new Ellipse();
        ellip.setRadiusX(5);
        ellip.setRadiusY(25);
        ellip.setLayoutX(x+25);
        ellip.setLayoutY(y+125);

        Label text = new Label(z);
        text.setFont(Font.font("Arial", 36));
        text.setLayoutX(x+WIDTH/2-PADDING);
        text.setLayoutY(y+25);

        group.getChildren().addAll(rect, inner_rect, ellip, text);

        return group;
    }
}
