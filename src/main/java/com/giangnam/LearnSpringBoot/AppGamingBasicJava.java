
package com.giangnam.LearnSpringBoot;

import com.giangnam.LearnSpringBoot.game.GameRunner;
import com.giangnam.LearnSpringBoot.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();
	}

}
