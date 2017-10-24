package wrapper;

public class ParseDataExam {

	public static void main(String[] args) {
		String a="10", b="20";
		int sum=0;
		float average=0;
		System.out.println("input data : "+a+" "+b);
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		sum=c+d;
		average=sum/2;
		System.out.println(a+" + "+b+" = "+sum);
		System.out.println("평균 = "+average);
		int res = Integer.max(5,5);
		System.out.println("결과 : " + res);
		Integer i = new Integer("250");
		short num = i.shortValue();
		System.out.println("결과 : "+num);




	}

}
