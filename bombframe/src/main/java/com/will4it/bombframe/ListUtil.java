package com.will4it.bombframe;

import java.util.Collection;

/**
 * author will date 10/10/2016.
 */

public class ListUtil {

	/**
	 * 判断list是否为null或者size为0
	 * 
	 * @param list
	 * @param <T>
	 * @return
	 */
	public static <T> boolean isEmpty(Collection<T> list) {
		if (list == null || list.size() == 0) {
			return true;
		}
		return false;
	}

	/**
	 * 获取list的size
	 * 
	 * @param list
	 * @param <T>
	 * @return
	 */
	public static <T> int size(Collection<T> list) {
		if (list == null) {
			return 0;
		}
		return list.size();
	}

}
