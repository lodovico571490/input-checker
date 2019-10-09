package com.github.lodovico571490.input_checker.item;

import java.util.List;
import java.util.function.Function;

public class DAddressCode extends ADomain {

	public DAddressCode(String nameL, String nameP, String value, int length, Function<IDomain, List<String>> check1) {
		super(nameL, nameP, value, length, check1);
	}

}
