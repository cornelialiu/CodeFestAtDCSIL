package com.torbird.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.torbird.game.TBGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Toronto Bird";
		config.width = 272;
		config.height = 408;
		new LwjglApplication(new TBGame(), config);
	}
}
