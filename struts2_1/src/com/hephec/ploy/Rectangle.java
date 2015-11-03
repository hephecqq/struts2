package com.hephec.ploy;

public class Rectangle extends Shape{

	@Override
	public double getZhouchang() {
		return 2*(super.chang+super.kuan);
	}

	@Override
	public double getMianji() {
		return super.chang*super.kuan;
	}
	

}
