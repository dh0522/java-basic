package construct;

public class MemberThis {
	String nameField;

	void initMember( String nameParameter ){
		nameField = nameParameter;
		// 앞에 this 생략되어 있음.
		// this가 없어도 멤버변수에 접근 가능.
	}
}
