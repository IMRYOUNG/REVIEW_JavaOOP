package classPractice;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		/*
		 * Class cl=String.class;//이렇게하면 Class라는 클래스를 가져올 수 있다.
		 * 
		 * String str= new String(); Class c2=str.getClass();//이렇게해도 Class라는 클래스를 가져올 수
		 * 있다.
		 */

		Class c3 = Class.forName("java.lang.String");//이렇게하면 클래스의 정보를 가져온다.
		//1. 클래스의 Constructor를 가져온다.
		Constructor[] cons = c3.getConstructors();//이렇게 쓰면 Constructor의 array가 반환된다.
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
