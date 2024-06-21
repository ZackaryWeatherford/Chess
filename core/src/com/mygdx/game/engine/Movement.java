package com.mygdx.game.engine;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;

public class Movement {

    public enum Direction {LEFT, RIGHT, UP, DOWN}

    /** */
    public Vector2 moveRight(Vector2 position, float speed){
        return new Vector2(position.x + getDeltaSpeed(speed),position.y);
    }

    /** */
    public Vector2 moveLeft(Vector2 position, float speed){
        return new Vector2(position.x - getDeltaSpeed(speed),position.y);
    }

    /** */
    public Vector2 moveUp(Vector2 position, float speed){
        return new Vector2(position.x, position.y + getDeltaSpeed(speed));
    }

    /** */
    public Vector2 moveDown(Vector2 position, float speed){
        return new Vector2(position.x, position.y - getDeltaSpeed(speed));
    }

    /** */


    /** */
    public static float getDeltaSpeed(float speed){
        return speed * Gdx.graphics.getDeltaTime();
    }


}
