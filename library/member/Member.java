package library.member;

public class Member {

	String memberName;

	String memberId;

	public Member(String memberName, String memberId) {
		super();
		this.memberName = memberName;
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

}
