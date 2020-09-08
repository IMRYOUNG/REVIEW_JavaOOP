package collection;

import java.util.Iterator;
import java.util.TreeMap;


public class MemberTreeMap {

	private TreeMap<Integer, Member> treeMap;

	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}

	public void addMember(Member member) {// member�� �Ű������� �Ѿ�������ϴ� �޼ҵ带 �����.
		treeMap.put(member.getMemberId(), member);
	}

	public boolean removeMember(int memberId) {// int�� Integer�� ���� ��ȯ�� �����ϹǷ�
		if (treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		System.out.println("ȸ�� ��ȣ�� �����ϴ�.");
		return false;
	}

	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);

		}
		System.out.println();
	}

}
