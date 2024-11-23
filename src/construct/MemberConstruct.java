package construct;

public class MemberConstruct {
	String name;
	int age;
	int grade;

	// 추가 -> 생성자는 오버로딩 가능하다.
	MemberConstruct( String name , int age ){

		/**
		 * 	this()
		 * 	자기자신의 생성자를 호출하는 것이며, 생성자 안에서만 사용할 수 있다.
		 * 	코드의 첫줄에서만 사용할 수 있다.
		 */
		this( name , age , 50 );
	}

	// 생성자
	MemberConstruct( String name, int age, int grade ){
		System.out.println("생성자 호출 name="+ name+" age="+age +" grade="+ grade);
		this.name = name;
		this.grade = grade;
		this.age = age;
	}
}
