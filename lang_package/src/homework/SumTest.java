package homework;

public class SumTest{
	
	public static void sum_v(int[] number){
		int sum=0;
		for(int i=0;i<number.length;i++){
			sum+=number[i];
		}System.out.println(sum);
	}
	public static void main(String args[]){
		SumTest.sum_v(new int[]{1,2,3,4,5,6,7,8,9,10});
	}
}
