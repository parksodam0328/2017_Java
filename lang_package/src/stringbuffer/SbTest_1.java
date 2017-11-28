package stringbuffer;

public class SbTest_1 {

	public static void main(String[] args) {
//		StringBuffer sb1 = new StringBuffer("java");
//		StringBuffer sb2 = new StringBuffer("java");
//		// StringBuffer클래스는 Object 클래스의 메소드를 오버라이딩 하지 않는다.
//		if(sb1==sb2){ //참조
//			System.out.println("같다");
//		}else{
//			System.out.println("다르다");
//		}
//		if(sb1.equals(sb2)){ //참조
//			System.out.println("같다");
//		}else{
//			System.out.println("다르다");
//		}
		StringBuffer st = new StringBuffer("방귀 뿡");
		st.setLength(10);
		System.out.println(st);
		st.setCharAt(9,'뿡');
		System.out.println(st);
		System.out.println(Math.round(3.6));
		System.out.println(Math.round(-21.5));
		System.out.println(Math.round(23.2));
		System.out.println(Math.rint(3.6));
		System.out.println(Math.rint(-21.5));
		System.out.println(Math.rint(23.2));
	}

}
