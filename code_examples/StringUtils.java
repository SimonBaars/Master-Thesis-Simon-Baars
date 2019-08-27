package com.sb.cryo.util;

import java.awt.List;

public class StringUtils
{
	public void addToList(List l) {
		l.add(getClass().getName());
	}

	public String concatTen(String x) {
		x = x + 10; // concat number
		Notifier.notifyChanged(x);
		return x;
	}
}