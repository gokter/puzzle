package com.flyingh.puzzle;

import java.math.BigDecimal;
import java.util.AbstractMap;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class Demo {
	private enum Sex {
		MALE, FEMAIL;
	}

	@Test
	public void test2() {// JDK6
		System.out.println(size(new HashMap<Sex, Sex>()));// 2
		System.out.println(size(new EnumMap<Sex, Sex>(Sex.class)));// 1 //2
	}

	private int size(Map<Sex, Sex> map) {
		map.put(Sex.MALE, Sex.FEMAIL);
		map.put(Sex.FEMAIL, Sex.MALE);
		map.put(Sex.MALE, Sex.MALE);
		map.put(Sex.FEMAIL, Sex.FEMAIL);
		// return new HashSet<Map.Entry<Sex, Sex>>(map.entrySet()).size();
		Set<Entry<Sex, Sex>> set = new HashSet<Map.Entry<Sex, Sex>>();
		for (Map.Entry<Sex, Sex> me : map.entrySet()) {
			set.add(new AbstractMap.SimpleImmutableEntry<Sex, Sex>(me));
		}
		return set.size();
	}

	@Test
	public void test() {
		System.out.println(2.00 - 1.10);
		System.out.println(new BigDecimal(2.00).subtract(new BigDecimal(1.10)));
		System.out.println(BigDecimal.valueOf(2.00).subtract(
				BigDecimal.valueOf(1.10)));
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal(
				"1.10")));
		System.out
				.println("0.899999999999999911182158029987476766109466552734375"
						.length());
	}
}
