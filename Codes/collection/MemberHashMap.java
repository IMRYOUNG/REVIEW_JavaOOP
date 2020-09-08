package collection;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;

	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}

	public void addMember(Member member) {// member가 매개변수로 넘어오도록하는 메소드를 만든다.
		hashMap.put(member.getMemberId(), member);
	}

	public boolean removeMember(int memberId) {// int와 Integer는 서로 변환이 가능하므로
		if (hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println("회원 번호가 없습니다.");
		return false;
	}

	public void showAllMember() {
		// 키로 반환하거나 값으로 반환하거나 둘 중 하나만 한다.
		Iterator<Integer> ir = hashMap.keySet().iterator(); // 키로 반환
		// hashMap.values().iterator(); //값으로 반환
		while (ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);

		}
		System.out.println();
	}

}
