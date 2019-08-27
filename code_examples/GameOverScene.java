package com.sb.fruitgame;

import com.sb.fruitgame.rotten.Apple;

public class LoseScene extends Scene
{
	public void collect(Apple apple) {
		apple.setStatus(this);
	}

	public String concatTen(String x) {
		x = x + 10;
		notifyChanged(x);
		return x;
	}
}

