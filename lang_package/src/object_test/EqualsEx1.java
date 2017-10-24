package object_test;

class Value {
	int number;
	public Value(int number){
		super();
		this.number=number;
	}
}
public class EqualsEx1 {

	public static void main(String[] args) {
		Value n1 = new Value(5); //primitive 아님 int n1 =5;. 인스턴스를 생성하고 n1에 5를 참조
		Value n2 = new Value(5);
		if(n1.equals(n2)){ // Object가 가지고 있는 equals() 메소드는 참조변수를 비교
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		System.out.println(n1.toString());
		System.out.println(n2.toString());
		n1=n2; // n2가 가지고 있는 참조값을 n1에 넣음
		if(n1.equals(n2)){ // Object가 가지고 있는 equals() 메소드는 참조변수를 비교
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		System.out.println(n1.toString());
		System.out.println(n2.toString());
	}
}
