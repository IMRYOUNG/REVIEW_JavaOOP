package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		ArrayList<String> set = new ArrayList<String>();
		set.add("�̼���");
		set.add("������");
		set.add("������");
		set.add("�̼���");
		
		System.out.println(set);//[�̼���, ������, ������, �̼���]
		//�� ArrayList ����� �Է¼����� �ߺ��� ��� �ݿ�������,
		
		

		HashSet<String> set2 = new HashSet<String>();
		set2.add("�̼���");
		set2.add("������");
		set2.add("������");
		set2.add("�̼���");
		
		System.out.println(set2);//[������, ������, �̼���]
		//HashSet����� �Է� ������ �ߺ� �� �� �ݿ����� �ʴ´�.
		
		//[������, ������, �̼���]�� �ƴ϶� �ϳ��� �� ���ư��鼭 �� �� �ִ� ����� Iterator ����̴�.
		//Iterator �Լ��� ��� �ݷ��ǿ����� �θ�  �� �ִ�.
		Iterator<String> ir =set.iterator(); //Iterator�ڿ� <String>�� �ٿ��� ��ȸ�� ��Ҹ� ������ �� �ִ�.
		while(ir.hasNext()) {//���� ������Ʈ(���)�� �ִ��� Ȯ���ϰ�
			String str = ir.next(); //���� ��Ҹ� �����´�. <String> �صױ⋚���� ir.next()�� ��ȯ���� String Ÿ���̴�.
			System.out.println(str);
		}

	}

}
