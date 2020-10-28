package kr.co.ezen;

public class MethodTest {
	
	// 접근 제한자의 종류 4가지 public, protected, 디폴트, private
	
	int a;
	boolean b = true;
	
	public MethodTest() {
		
	}
	
	
	public void iamgrond(String name, int age) {
		System.out.println("안녕 내 이름은 "+name+"라고 해, 나이는 "+age+"살이야");
	}
	
	
	public void printScore(String name, int s) {
		System.out.println(name+" "+s+"점");
	}
	
	
	public void printDan(int n) {
		// n에 뭘 넣어도 곱하기 9까지는 연산된다.
		System.out.println(n+"x"+1+"="+(n*1));
		System.out.println(n+"x"+2+"="+(n*2));
		System.out.println(n+"x"+3+"="+(n*3));
		System.out.println(n+"x"+4+"="+(n*4));
		System.out.println(n+"x"+5+"="+(n*5));
		System.out.println(n+"x"+6+"="+(n*6));
		System.out.println(n+"x"+7+"="+(n*7));
		System.out.println(n+"x"+8+"="+(n*8));
		System.out.println(n+"x"+9+"="+(n*9));
	}
	
	
	public void callName(String name) {
		System.out.println("안녕하세요 "+ name);
	}
	
	
	public void sitDown() {
		System.out.println("그 자리에 즉시 앉음");
		sayHello();
	}
	
	
	public void stand() {
		System.out.println("무반환 무파람");
	}
	
	
	public void sayHello() {
		System.out.println("Hello~");
	}
	
	
	public void sleep() {
		System.out.println("public: 접근제한자로 프로젝트 전체에서 sleep메서드가 호출될 수 있음을 의미함");
		System.out.println("void: 반환형이라 하고, 이는 반환되는 데이터의 자료형을 의미한다. void는 반환되는 데이터가 없다는 것을 의미한다.");
		System.out.println("Sleep: 메서드의 이름이고, 나중에 메서드를 호출할 때 나중에 메서드를 호출할 때 그 이름을 적어 줌으로써 메서드 본문 안에 있는 코드를 실행하게 함");
		System.out.println("(): 파라미터, 매개변수 선언하는 곳으로 마치 변수를 선언하듯 작성하면 됨. 파라미터가 두 개 이상일 때는 ,를 구분자로 해서 구분을 해줌.");
		System.out.println("{}: 메서드의 본문..메서드 호출 때 실행하고 싶은 코드를 작성해줌.");
		System.out.println("메서드 호출: 메서드를 사용하는 것을 의미함. 사용법은 메서드명을 적고 소괄호를 칩니다. 그리고 소괄호 안에 파라미터의 자료형에 맞는 값을 넣어줍니다.");
	}

}
