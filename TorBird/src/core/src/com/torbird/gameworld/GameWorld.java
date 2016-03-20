package com.torbird.gameworld;

/**
 * Created by Sola on 3/13/2016.
 */

import com.badlogic.gdx.Gdx;
import com.torbird.gameobjects.Bird;


public class GameWorld {

    private Bird bird;

    public GameWorld(int midPointY) {
        //init bird here
        bird = new Bird(33,midPointY - 5, 17, 12);
    }
    public void update(float delta) {
        bird.update(delta);
    }

    public Bird getBird() {
        return bird;
    }

}
