package classPractice;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

		Person person = new Person("James"); //이 방법이 가장 간단한 방법으로, 이 클래스가 로컬에 있으면 이걸 쓰고 그게 아니라면 아래의 방법을 쓴다.
		System.out.println(person);

		Class c1 = Class.forName("classPractice.Person");
		Person person1 = (Person) c1.newInstance();// .newInstance()는 Person클래스의 디폴트 생성자를 호출한다.
		System.out.println(person1);
		
		Class[] parameterTypes= {String.class};
		Constructor cons=c1.getConstructor(parameterTypes);//String 한개짜리 Constructor를 가져온것임
		
		Object[] initargs= {"김유신"};
		Person personLee=(Person)cons.newInstance(initargs);
		System.out.println(personLee);
	}

}
