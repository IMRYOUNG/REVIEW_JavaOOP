package collection;

import java.util.Iterator;
import java.util.TreeMap;


public class MemberTreeMap {

	private TreeMap<Integer, Member> treeMap;

	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}

	public void addMember(Member member) {// member가 매개변수로 넘어오도록하는 메소드를 만든다.
		treeMap.put(member.getMemberId(), member);
	}

	public boolean removeMember(int memberId) {// int와 Integer는 서로 변환이 가능하므로
		if (treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		System.out.println("회원 번호가 없습니다.");
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
