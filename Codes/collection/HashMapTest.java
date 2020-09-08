package collection;

public class HashMapTest {

	public static void main(String[] args) {
		MemberHashMap manager = new MemberHashMap();

		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(200, "Kim");
		Member memberPark = new Member(300, "Park");
		Member memberPark2 = new Member(300, "Park2");

		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		manager.addMember(memberPark2);/*이렇게하면 memberPark2가 hashMap에 들어가지 않는다. 
										*그 이유는 현재 key값이 Integer로 잡혀있는데 
										* key는 이미 hashCode와 equals가 구현되어있기때문이다.*/
		manager.showAllMember();
		System.out.println();
		manager.removeMember(100);
		manager.showAllMember();
	}

}
