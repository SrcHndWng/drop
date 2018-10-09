package com.myfirstgame.drop.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.myfirstgame.drop.Const;
import com.myfirstgame.drop.Drop;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Drop";
		config.width = (int)Const.Viewport.width;
		config.height = (int)Const.Viewport.height;
		new LwjglApplication(new Drop(), config);
	}
}
