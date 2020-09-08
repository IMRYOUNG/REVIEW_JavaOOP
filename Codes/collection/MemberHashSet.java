package collection;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

		private HashSet<Member> hashSet;
		
		public MemberHashSet() {
			hashSet = new HashSet<Member>();//HashSet이 하나 만들어졌다.
		}
		
		public void addMember(Member member) {
			hashSet.add(member);
		}
		
		public boolean removeMember(int memberId) { //memberId를 하나씩 확인하여 일치하는 memberId를 삭제하는 메소드
			Iterator<Member> ir = hashSet.iterator();
			while(ir.hasNext()) {
				Member member = ir.next();
				if(member.getMemberId()==memberId) {
					hashSet.remove(member);
					return true;
				}
			}
			System.out.println(memberId+" 번호가 존재하지 않습니다.");
			return false;
		}
		public void showAllMember() {
			for(Member member : hashSet) {
				System.out.println(member);//Member클래스의 toString메소드를 구현해뒀기때문에 member는 toString이 호출되면서 구현될것이다.
			}
		}

	

}
