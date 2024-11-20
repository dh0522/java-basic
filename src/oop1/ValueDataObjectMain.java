package oop1;

public class ValueDataObjectMain {
	public static void main(String[] args) {
		ValueData valueData = new ValueData();
		valueData.add();
		valueData.add();
		valueData.add();
		System.out.println("최종 숫자= "+ valueData.value);

	}

	/**
	 *  데이터가 있는 부분 (객체) 에 메서드가 포함되어 있다.
	 *  -> 응집력있게 딱 모여있음.
	 *  => 객체지향 프로그래밍 : 속성과 기능이 뭉쳐있음.
	 */

}
