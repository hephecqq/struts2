package com.hephec.ploy;

public class TypeConvert {
	
	public static void main(String[] args) {
		Animal animal=new Animal();
		Dog dog=new Dog();
		//����ָ���������
		//animal=dog;
		//ǿ��ת�����������ת��Ϊ�������
		//����ʱΪDog����
		
		if(dog instanceof Animal){
			System.out.println("--->");
			dog=(Dog) animal;
			dog.eat();
		}
	
		
		//dog.eat();
		
		
	}
}
