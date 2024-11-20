package oop1;

public class ValueDataMain {
	public static void main(String[] args) {
		ValueData valueData = new ValueData();
		add(valueData);
		add(valueData);
		add(valueData);
		System.out.println("최종 숫자= "+ valueData.value);
	}
	static void add( ValueData valueData ){
		valueData.value++;
		System.out.println("숫자 증가 value= "+valueData.value);
	}
	/**
	 *  data가 있는 부분과 메서드가 분류되어 있다.
	 *  data와 기능이 떨어져 있음.
	 */
}
