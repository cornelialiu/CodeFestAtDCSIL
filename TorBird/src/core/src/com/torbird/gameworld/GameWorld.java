package com.torbird.gameworld;

/**
 * Created by Sola on 3/13/2016.
 */

import com.badlogic.gdx.Gdx;
import com.torbird.gameobjects.Bird;
import com.torbird.gameobjects.ScrollHandler;


public class GameWorld {

    private Bird bird;
    private ScrollHandler scroller;

    public GameWorld(int midPointY) {
        //init bird here
        bird = new Bird(33,midPointY - 5, 17, 12);
        scroller = new ScrollHandler(midPointY + 66);
    }
    public void update(float delta) {
        bird.update(delta);
        scroller.update(delta);
    }

    public Bird getBird() {

        return bird;
    }
    public ScrollHandler getScroller() {

        return scroller;
    }

}
