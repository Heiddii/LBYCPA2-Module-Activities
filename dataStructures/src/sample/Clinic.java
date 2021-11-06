package sample;

import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

import java.util.Arrays;

public class Clinic{

    private static final int CLINIC_X = 208;
    private static final int CLINIC_Y = 50;

    public Group clinic(){
        Group group = new Group();

        Rectangle rect = new Rectangle();
        rect.setWidth(150);
        rect.setHeight(250);
        rect.setX(CLINIC_X);
        rect.setY(CLINIC_Y);
        rect.setFill(Color.PEACHPUFF);
        rect.setStroke(Color.BLACK);

        Label clinic_label = new Label("Clinic");
        clinic_label.setRotate(270);
        clinic_label.setLayoutX(CLINIC_X+45);
        clinic_label.setLayoutY(CLINIC_Y+115);
        clinic_label.setFont(Font.font("Arial", 24));

        Rectangle reception = new Rectangle();
        reception.setWidth(150);
        reception.setHeight(100);
        reception.setX(CLINIC_X);
        reception.setY(CLINIC_Y+250+8);
        reception.setFill(Color.PEACHPUFF);
        reception.setStroke(Color.BLACK);

        Label reception_label = new Label("Reception");
        reception_label.setLayoutX(CLINIC_X+20);
        reception_label.setLayoutY(CLINIC_Y+290);
        reception_label.setFont(Font.font("Arial", 24));

        group.getChildren().addAll(rect, reception, clinic_label, reception_label);

        return group;
    }

    public Group patients(){

        Circle[] patients = new Circle[9];
        Group group = new Group();

        int[] arr = shuffle();
        int mult = 0, mult2 = 0;

        for (int i = 0;i<8;i++) {
            patients[arr[i]] = new Circle();
            patients[arr[i]].setRadius(30);
            patients[arr[i]].setFill(Color.PEACHPUFF);
            patients[arr[i]].setStroke(Color.BLACK);

            if (i <= 3) {
                patients[arr[i]].setCenterX(500+mult*35);
                patients[arr[i]].setCenterY(80);
                mult+=2;
            }
            else{
                patients[arr[i]].setCenterX(500+mult2*35);
                patients[arr[i]].setCenterY(412);
                mult2+=2;
            }

            Label num = new Label(Integer.toString(arr[i]));
            num.setFont(Font.font("Arial", 24));
            num.setLayoutX(patients[arr[i]].getCenterX()-7);
            num.setLayoutY(patients[arr[i]].getCenterY()-12);
            
            group.getChildren().addAll(patients[arr[i]], num);
        }

        for(int i = 2; i<=8;i++){
            Line line = new Line();

            line.setStroke(Color.rgb(200,200,200,0.5));
            line.setStrokeWidth(5);
            line.setStartX(patients[i-1].getCenterX());
            line.setStartY(patients[i-1].getCenterY());
            line.setEndX(patients[i].getCenterX());
            line.setEndY(patients[i].getCenterY());
            line.toBack();
            group.getChildren().add(line);
        }

        return group;
    }

    public int[] shuffle(){
        int[] numbers = {1,2,3,4,5,6,7,8};

        int currentIndex = numbers.length;
        int randomIndex;
        int temp;

        while(currentIndex != 0){
            randomIndex = (int)Math.floor(Math.random() * currentIndex);
            currentIndex--;

            temp = numbers[currentIndex];
            numbers[currentIndex] = numbers[randomIndex];
            numbers[randomIndex] = temp;
        }

        return numbers;
    }
}
