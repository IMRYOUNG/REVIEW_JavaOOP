package classPractice;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		/*
		 * Class cl=String.class;//�̷����ϸ� Class��� Ŭ������ ������ �� �ִ�.
		 * 
		 * String str= new String(); Class c2=str.getClass();//�̷����ص� Class��� Ŭ������ ������ ��
		 * �ִ�.
		 */

		Class c3 = Class.forName("java.lang.String");//�̷����ϸ� Ŭ������ ������ �����´�.
		//1. Ŭ������ Constructor�� �����´�.
		Constructor[] cons = c3.getConstructors();//�̷��� ���� Constructor�� array�� ��ȯ�ȴ�.
		for(Constructor con: cons) {
			System.out.println(con);
		}
		System.out.println();
		
		Method[] methods = c3.getDeclaredMethods();
		for(Method method : methods ) {
			System.out.println(method);
		}

	}

}
