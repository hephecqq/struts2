package com.hephec.ploy;

public class CellPhone extends Telphone {

	@Override
	public void call() {
		System.out.println("我是智能机哦...");
	}

	@Override
	public void mesage() {
		System.out.println("我使用Android系统发短信哦...");
	}

}
