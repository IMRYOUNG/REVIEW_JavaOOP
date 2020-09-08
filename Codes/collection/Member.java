package collection;

public class Member {
	private int memberId;
	private String memberName;
	
	public Member() {}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public Member(int memberId, String memberName) {
		this.memberId=memberId;
		this.memberName=memberName;
	}
	public String toString() {
		return memberName+"회원님의 아이디는 "+memberId+"입니다.";
	}

	
	//memberId는 유일해야한다. 다른 이름의 사람이 같은 아이디를 가지지 않아야함을 구현하기위해서는 equals와 hashCode를 재정의하면된다.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { 
			Member member =(Member)obj;
			return (this.memberId==member.memberId);
		}
		return false;
	}
	@Override
	public int hashCode() {//같은 멤버일때 같은 해시코드를 갖도록 override한다.
		//즉 주소값을 memberId로 정해버린다.
		return memberId;
	}
	
}
