package collection;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

		private HashSet<Member> hashSet;
		
		public MemberHashSet() {
			hashSet = new HashSet<Member>();//HashSet�� �ϳ� ���������.
		}
		
		public void addMember(Member member) {
			hashSet.add(member);
		}
		
		public boolean removeMember(int memberId) { //memberId�� �ϳ��� Ȯ���Ͽ� ��ġ�ϴ� memberId�� �����ϴ� �޼ҵ�
			Iterator<Member> ir = hashSet.iterator();
			while(ir.hasNext()) {
				Member member = ir.next();
				if(member.getMemberId()==memberId) {
					hashSet.remove(member);
					return true;
				}
			}
			System.out.println(memberId+" ��ȣ�� �������� �ʽ��ϴ�.");
			return false;
		}
		public void showAllMember() {
			for(Member member : hashSet) {
				System.out.println(member);//MemberŬ������ toString�޼ҵ带 �����صױ⶧���� member�� toString�� ȣ��Ǹ鼭 �����ɰ��̴�.
			}
		}

	

}
