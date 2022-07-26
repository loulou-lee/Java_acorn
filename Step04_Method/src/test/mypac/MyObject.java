package test.mypac;
/*
 *  [메소드를 만들때 고려 해야 하는것]
 *  1. 접근 지정자
 *  2. static or non static
 *  3. 리턴 type
 *  4. 메소드명
 *  5. 메소드에 전달하는 인자의 갯수와 데이터 type
 */
public class MyObject {
	/*
	 * public => 
	 * void =>
	 * walk => 메소드명
	 * walk() => 이 메소드는 어떤 인자를 받지 않는다
	 */
	
	public void walk() {
		System.out.println("걸음을 걸어요");
	}
	//int type 을 리턴해주는 메소드
	public int getNumber() {
		return 10;
	}
	//String type 을 리턴해주는 메소드
	public String getGreeting() {
		return "안녕하세요";
	}
	
	public Car getCar() {
		return new Car();
	}
}
