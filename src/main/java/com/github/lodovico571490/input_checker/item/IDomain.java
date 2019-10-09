package com.github.lodovico571490.input_checker.item;

import java.util.List;
import java.util.function.Function;

public interface IDomain {

	public String getNameL();

	public void setNameL(String nameL);

	public String getNameP();

	public void setNameP(String nameP);

	public String getValue();

	public void setValue(String value);

	public Function<IDomain, List<String>> getCheck1();

	public void setCheck1(Function<IDomain, List<String>> check1);

	public int getLength();

	public void setLength(int length);
}
