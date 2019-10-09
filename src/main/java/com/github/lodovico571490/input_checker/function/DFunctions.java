package com.github.lodovico571490.input_checker.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.github.lodovico571490.input_checker.item.IDomain;

public class DFunctions {

	private static DFunctions instance;

	public static DFunctions func() {
		if (instance == null) {
			instance = new DFunctions();
		}
		return instance;
	}

	public Function<IDomain, List<String>> checkDate = new Function<IDomain, List<String>>() {

		@Override
		public List<String> apply(IDomain arg0) {

			List<String> errors = new ArrayList<>();

			Pattern p = Pattern.compile("[0-9]{8}");
			Matcher m = p.matcher(arg0.getValue());

			if (m.matches()) {
				errors.add("Date check error");

			}

			return errors;
		}

	};



	public Function<IDomain, List<String>> checkCarRegistrationNumber = new Function<IDomain, List<String>>() {

		@Override
		public List<String> apply(IDomain arg0) {

			List<String> errors = new ArrayList<>();

			Pattern p = Pattern.compile("[0-9]{7}");
			Matcher m = p.matcher(arg0.getValue());

			if (m.matches()) {
				errors.add("car registration check error");

			}

			return errors;
		}

	};


	public Function<IDomain, List<String>> checkAddressCode = new Function<IDomain, List<String>>() {

		@Override
		public List<String> apply(IDomain arg0) {

			List<String> errors = new ArrayList<>();

			Pattern p = Pattern.compile("[0-9]{20}");
			Matcher m = p.matcher(arg0.getValue());

			if (m.matches()) {
				errors.add("car address code check error");

			}

			return errors;
		}

	};

}
