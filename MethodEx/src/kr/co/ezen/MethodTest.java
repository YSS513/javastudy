package kr.co.ezen;

public class MethodTest {
	
	// ���� �������� ���� 4���� public, protected, ����Ʈ, private
	
	int a;
	boolean b = true;
	
	public MethodTest() {
		
	}
	
	
	public void iamgrond(String name, int age) {
		System.out.println("�ȳ� �� �̸��� "+name+"��� ��, ���̴� "+age+"���̾�");
	}
	
	
	public void printScore(String name, int s) {
		System.out.println(name+" "+s+"��");
	}
	
	
	public void printDan(int n) {
		// n�� �� �־ ���ϱ� 9������ ����ȴ�.
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
		System.out.println("�ȳ��ϼ��� "+ name);
	}
	
	
	public void sitDown() {
		System.out.println("�� �ڸ��� ��� ����");
		sayHello();
	}
	
	
	public void stand() {
		System.out.println("����ȯ ���Ķ�");
	}
	
	
	public void sayHello() {
		System.out.println("Hello~");
	}
	
	
	public void sleep() {
		System.out.println("public: ���������ڷ� ������Ʈ ��ü���� sleep�޼��尡 ȣ��� �� ������ �ǹ���");
		System.out.println("void: ��ȯ���̶� �ϰ�, �̴� ��ȯ�Ǵ� �������� �ڷ����� �ǹ��Ѵ�. void�� ��ȯ�Ǵ� �����Ͱ� ���ٴ� ���� �ǹ��Ѵ�.");
		System.out.println("Sleep: �޼����� �̸��̰�, ���߿� �޼��带 ȣ���� �� ���߿� �޼��带 ȣ���� �� �� �̸��� ���� �����ν� �޼��� ���� �ȿ� �ִ� �ڵ带 �����ϰ� ��");
		System.out.println("(): �Ķ����, �Ű����� �����ϴ� ������ ��ġ ������ �����ϵ� �ۼ��ϸ� ��. �Ķ���Ͱ� �� �� �̻��� ���� ,�� �����ڷ� �ؼ� ������ ����.");
		System.out.println("{}: �޼����� ����..�޼��� ȣ�� �� �����ϰ� ���� �ڵ带 �ۼ�����.");
		System.out.println("�޼��� ȣ��: �޼��带 ����ϴ� ���� �ǹ���. ������ �޼������ ���� �Ұ�ȣ�� Ĩ�ϴ�. �׸��� �Ұ�ȣ �ȿ� �Ķ������ �ڷ����� �´� ���� �־��ݴϴ�.");
	}

}
