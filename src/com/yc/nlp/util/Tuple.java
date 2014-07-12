package com.yc.nlp.util;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * extends arraylist to change the toString() method
 * 
 * @author uohzoaix
 * 
 * @param <E>
 */
public class Tuple<E> extends ArrayList<E> {

	private static final long serialVersionUID = -2183616577654310036L;

	public Tuple() {
		super();
	}

	public static Tuple<String> fromStr(String ele) {
		Tuple<String> strs = new Tuple<String>();
		String[] strArr = ele.split("-");
		for (String str : strArr) {
			strs.add(str);
		}
		return strs;
	}

	@Override
	public Tuple<E> subList(int fromIndex, int toIndex) {
		Tuple<E> tuple = new Tuple<E>();
		tuple.addAll(super.subList(fromIndex, toIndex));
		return tuple;
	}

	@Override
	public String toString() {
		Iterator<E> it = iterator();
		if (!it.hasNext())
			return "";

		StringBuilder sb = new StringBuilder();
		for (;;) {
			E e = it.next();
			sb.append(e == this ? "" : e);
			if (!it.hasNext())
				return sb.toString();
			sb.append('-');
		}
	}
}
