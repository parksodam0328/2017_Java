package wrapper;

public class Exception_Equals_test {
//오류와 예외는 다르다. 예외는 컴파일을 되나 실행이 되지 않는 것이다!
	public static void main(String[] args) {
		try{//예외가 없는 경우
			Integer i1 = new Integer("10");
			Integer i2 = new Integer("10.0");
		
			if(i1.equals(i2)){ //값 비교 오버라이딩
			System.out.println("값이 같습니다.");
			}else {
			System.out.println("값이 다릅니다.");
			}
		}catch(NumberFormatException e){ //예외처리 
			System.out.println("숫자 포맷이 틀립니다.");
		}

	}

}
