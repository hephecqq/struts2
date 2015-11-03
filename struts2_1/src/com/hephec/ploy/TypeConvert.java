package com.hephec.ploy;

public class TypeConvert {
	
	public static void main(String[] args) {
		Animal animal=new Animal();
		Dog dog=new Dog();
		//父类指向子类对象
		//animal=dog;
		//强制转换将父类对象转换为子类对象
		//编译时为Dog对象
		
		if(dog instanceof Animal){
			System.out.println("--->");
			dog=(Dog) animal;
			dog.eat();
		}
	
		
		//dog.eat();
		
		
	}
}
