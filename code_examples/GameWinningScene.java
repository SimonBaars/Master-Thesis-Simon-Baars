package com.sb.fruitgame;

import com.sb.fruitgame.Apple;

public class GameScene extends Scene
{
	public void collect(Apple apple) {
		apple.setStatus(this);
	}

	public int addTen(int x) {
		x = x + 10;
		notifyChanged(x);
		return x;
	}
}

