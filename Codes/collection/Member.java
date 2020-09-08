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
		return memberName+"ȸ������ ���̵�� "+memberId+"�Դϴ�.";
	}

	
	//memberId�� �����ؾ��Ѵ�. �ٸ� �̸��� ����� ���� ���̵� ������ �ʾƾ����� �����ϱ����ؼ��� equals�� hashCode�� �������ϸ�ȴ�.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { 
			Member member =(Member)obj;
			return (this.memberId==member.memberId);
		}
		return false;
	}
	@Override
	public int hashCode() {//���� ����϶� ���� �ؽ��ڵ带 ������ override�Ѵ�.
		//�� �ּҰ��� memberId�� ���ع�����.
		return memberId;
	}
	
}
