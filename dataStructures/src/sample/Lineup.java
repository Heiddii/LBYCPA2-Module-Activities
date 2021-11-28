package com.example.module1;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class Lineup {
    public static final float HEIGHT = 225;
    public static final float WIDTH = 225;
    public static final float PADDING = 20;

    public Group People(int x, int y, String z) {
        Group group = new Group();

        Circle circ = new Circle();
        circ.setRadius(PADDING);
        circ.setCenterX(WIDTH + x);
        circ.setCenterY(HEIGHT + y);
        circ.setFill(Color.GRAY);

        Label text = new Label(z);
        text.setFont(Font.font("Arial", 8));
        text.setLayoutX(x + WIDTH - 5);
        text.setLayoutY(y + HEIGHT  - 5);

        group.getChildren().addAll(circ, text);

        return group;
    }
}
