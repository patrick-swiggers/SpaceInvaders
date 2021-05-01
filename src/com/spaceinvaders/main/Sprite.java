package com.spaceinvaders.main;

/**
 *
 * @author Patrick
 */
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class Sprite extends Rectangle {
    boolean dead = false;
    final String type;

    Sprite(int x, int y, int w, int h, String type) {
        super(w, h);

        this.type = type;
        setTranslateX(x);
        setTranslateY(y);

        switch(type) {
            case "enemy":
                Image invadrImg = new Image ("file:invader.png");
                setFill(new ImagePattern(invadrImg));
                break;
            case "player":
                Image canonImg = new Image ("file:canon.png");
                setFill(new ImagePattern(canonImg));
                break;
            case "enemybullet": case "playerbullet":
                setFill(Color.RED);
                break;
        }
    }

    void moveLeft() {
        setTranslateX(getTranslateX() - 5);
    }

    void moveRight() {
        setTranslateX(getTranslateX() + 5);
    }

    void moveUp() {
        setTranslateY(getTranslateY() - 5);
    }

    void moveDown() {
        setTranslateY(getTranslateY() + 5);
    }
}
