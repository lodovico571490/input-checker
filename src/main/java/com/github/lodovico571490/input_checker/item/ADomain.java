package com.github.lodovico571490.input_checker.item;

import java.util.List;
import java.util.function.Function;

/**
 * domain abstract class
 *
 */
public abstract class ADomain implements IDomain {

	/** logical name */
	protected String nameL;
	/** physical name */
	protected String nameP;
	/** value */
	protected String value;
	/** value length */
	protected int length;
	/** input check 1 */
	protected Function<IDomain, List<String>> check1;

	public ADomain(String nameL, String nameP, String value, int length, Function<IDomain, List<String>> check1) {
		this.nameL = nameL;
		this.nameP = nameP;
		this.value = value;
		this.length = length;
		this.check1 = check1;
	}

	public String getNameL() {
		return nameL;
	}

	public void setNameL(String nameL) {
		this.nameL = nameL;
	}

	public String getNameP() {
		return nameP;
	}

	public void setNameP(String nameP) {
		this.nameP = nameP;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Function<IDomain, List<String>> getCheck1() {
		return check1;
	}

	public void setCheck1(Function<IDomain, List<String>> check1) {
		this.check1 = check1;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
