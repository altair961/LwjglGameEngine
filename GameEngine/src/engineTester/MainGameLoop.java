package engineTester;

import org.lwjgl.opengl.Display;

import gameEngine.DisplayManager;

public class MainGameLoop {

	public static void main(String[] args) {
		
		
		DisplayManager.createDispaly();
		
		while(!Display.isCloseRequested()) {
			// game logic
			// render
			DisplayManager.updateDispaly();
		}

		DisplayManager.closeDispaly();
	}

}
