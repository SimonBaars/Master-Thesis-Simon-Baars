package com.simonbaars.fruitcollector;

import com.simonbaars.fruitcollector.fruits.winning.Apple;
import com.simonbaars.fruitcollector.images.winning.*;

import com.musiclibrary.music.highvolume.*;

public class GameWinningScene extends GameScene
{
	protected final Player player;

	public GameScene(Player player)
	{
		this.player = player;
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
