package wrapper;

public class ExIII_1 {

	public static void main(String[] args) {
		String s1="10", s2="20";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
		System.out.println((Integer.valueOf(s1)).intValue()+(Integer.valueOf(s2)).intValue());
		System.out.println(Double.valueOf(s1).doubleValue()+Double.valueOf(s2).doubleValue());

	}

}
