package arrayPractice;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<String>();//ArrayList�ȿ� � Ÿ���� �� �������� �˷��ִ� <>�� ���ʸ��̶���Ѵ�.
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(int i=0; i<list.size();i++) {//array�� .length�� ����߾��µ� ArrayList�� .size()�� ����.
			/*.size()�� ������Ʈ�� �� �������� ��ȯ�ϰ�
			 * .lenght�� ����Ʈ ��ü ������ ���̸� ��ȯ�Ѵ�. */
			String str=list.get(i);
			System.out.println(str);
		}
		
	}

}
