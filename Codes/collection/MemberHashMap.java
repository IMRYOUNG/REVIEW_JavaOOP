package collection;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;

	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}

	public void addMember(Member member) {// member�� �Ű������� �Ѿ�������ϴ� �޼ҵ带 �����.
		hashMap.put(member.getMemberId(), member);
	}

	public boolean removeMember(int memberId) {// int�� Integer�� ���� ��ȯ�� �����ϹǷ�
		if (hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println("ȸ�� ��ȣ�� �����ϴ�.");
		return false;
	}

	public void showAllMember() {
		// Ű�� ��ȯ�ϰų� ������ ��ȯ�ϰų� �� �� �ϳ��� �Ѵ�.
		Iterator<Integer> ir = hashMap.keySet().iterator(); // Ű�� ��ȯ
		// hashMap.values().iterator(); //������ ��ȯ
		while (ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);

		}
		System.out.println();
	}

}
