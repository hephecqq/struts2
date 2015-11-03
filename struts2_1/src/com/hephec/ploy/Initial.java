package com.hephec.ploy;

public class Initial {
	
	public static void main(String[] args) {
		//父类的引用可以指向本类的对象
		Animal obj1=new Animal();
		System.out.println(obj1);
		Animal obj2=new Dog();//多态
		System.out.println(obj2);
		//不允许子类的引用指向父类的引用
		//Dog dog=new Animal();
		//此时子类并没有重写父类的eat()方法
		System.out.println(obj1.eat());
		System.out.println(obj2.eat());
		//此时子类重写了父类的eat()方法
		System.out.println();
		
	}
}