package com.hephec.ploy;

public class Initial {
	
	public static void main(String[] args) {
		//��������ÿ���ָ����Ķ���
		Animal obj1=new Animal();
		System.out.println(obj1);
		Animal obj2=new Dog();//��̬
		System.out.println(obj2);
		//���������������ָ���������
		//Dog dog=new Animal();
		//��ʱ���ಢû����д�����eat()����
		System.out.println(obj1.eat());
		System.out.println(obj2.eat());
		//��ʱ������д�˸����eat()����
		System.out.println();
		
	}
}