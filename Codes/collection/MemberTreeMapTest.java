package collection;

public class MemberTreeMapTest {
	//TreeMap�� ���� �뵵�� ���δ�. Integer�� key������ ���� �� Ŭ������ �̹� hashCode�� equals�� �����Ǿ� �ֱ� ������ ������ �ȰŴ�.

	public static void main(String[] args) {
		MemberTreeMap manager = new MemberTreeMap();

		Member memberPark = new Member(300, "Park");
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(200, "Kim");
		Member memberPark2 = new Member(400, "Park2");

		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		manager.addMember(memberPark2);/*�̷����ϸ� memberPark2�� hashMap�� ���� �ʴ´�. 
										*�� ������ ���� key���� Integer�� �����ִµ� 
										* key�� �̹� hashCode�� equals�� �����Ǿ��ֱ⶧���̴�.*/
		manager.showAllMember();
		System.out.println();
		manager.removeMember(100);
		manager.showAllMember();
	}

}
