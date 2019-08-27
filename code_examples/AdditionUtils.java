package com.sb.cryo.addition;

import com.notificationlib.*;
import java.util.List;

public class AdditionUtils
{
	public void addToList(List l) {
		l.add(getClass().getName());
	}

	public int addTen(int x) {
		x = x + 10; // add number
		Notifier.notifyChanged(x);
		return x;
	}
}