package com.simonbaars.fruitcollector;

import com.simonbaars.fruitcollector.fruits.rotten.Apple;
import com.simonbaars.fruitcollector.images.losing.*;

import com.musiclibrary.music.lowvolume.*;

public class GameOverScene extends GameScene
{
	protected final Player player;

	public GameOverScene(Player player)
	{
		super(player);
	}

	public String checkAppleCollected(Apple collectedApple) 
	{
		if(player.inventory.contains(collectedApple)){
			showImage(new PNGImage());
		}
		playSong(new MusicPlayer());
	}

	@Override
	public void playSong(MusicPlayer musicPlayer){
		musicPlayer.playSong("theme.mp3");
	}
}
