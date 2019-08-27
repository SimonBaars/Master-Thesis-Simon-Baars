package com.sb.fruitgame;

import com.sb.fruitgame.Apple;

public class GameScene extends com.sb.fruitgame.Scene
{
	public void collect(com.sb.fruitgame.Apple apple) {
		((com.sb.fruitgame.Apple)apple).(com.sb.fruitgame.Scene.setStatus)((com.sb.fruitgame.Scene)this);
	}

	public int addTen(int x) {
		(int)x = (int)x + 10;
		com.sb.fruitgame.Scene.notifyChanged((int)x);
		return (int)x;
	}
}

