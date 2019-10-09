package com.github.lodovico571490.input_checker.item;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.function.Function;

public class DDate extends ADomain {

	public DDate(String nameL, String nameP, String value, int length, Function<IDomain, List<String>> check1) {
		super(nameL, nameP, value, length, check1);
	}

	/**
	 * comapre date
	 * @param item
	 * @return
	 */
	@SuppressWarnings("finally")
	public boolean isGreaterEqualThan(DDate item) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		try {
			Date d1 = sdf.parse(this.value);
			Date d2 = sdf.parse(item.value);
			return d1.before(d2);
		} catch (ParseException e) {
		} finally {
			return false;
		}
	}
}
