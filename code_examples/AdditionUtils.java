package com.sb.cryo.util;

import java.util.List;
import com.notificationlib.*;

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