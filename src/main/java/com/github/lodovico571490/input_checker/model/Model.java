package com.github.lodovico571490.input_checker.model;

import static com.github.lodovico571490.input_checker.function.DFunctions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.github.lodovico571490.input_checker.item.DAddressCode;
import com.github.lodovico571490.input_checker.item.DCarRegistrationNumber;
import com.github.lodovico571490.input_checker.item.DDate;
import com.github.lodovico571490.input_checker.item.DName;
import com.github.lodovico571490.input_checker.item.IDomain;
import com.github.lodovico571490.input_checker.item.Item;

public class Model {

	/** regist date */
	@Item
	DDate date = new DDate("regist date", "date", "", 8, func().checkDate);
	/** user name */
	@Item
	DName name = new DName("regist date", "date", "", 25, func().checkDate);

	/** car registration number */
	DCarRegistrationNumber carRegistrationNumber = new DCarRegistrationNumber("regist date", "date", "", 7,
			func().checkDate);;

	/** address code */
	DAddressCode addressCode = new DAddressCode("regist date", "date", "", 10, func().checkDate);;

	List<IDomain> fieldList = new ArrayList<>();

	public void init() {
		fieldList.add(date);
		fieldList.add(name);
		fieldList.add(carRegistrationNumber);
		fieldList.add(addressCode);
	}

	public List<String> checkItem() {
		List<String> errors = new ArrayList<>();
		//
		fieldList.stream().forEach(d -> errors.addAll(d.getCheck1().apply(d)));

		return errors;
	}

	public List<String> checkLength() {
		List<String> errors = new ArrayList<>();
		//
		fieldList.stream().forEach(new Consumer<IDomain>() {
			@Override
			public void accept(IDomain d) {
				if (d.getLength() >= d.getValue().length()) {
					errors.add("input error of " + d.getNameL() + "(" + d.getNameP() + ")");
				}
			}
		});

		return errors;
	}
}
