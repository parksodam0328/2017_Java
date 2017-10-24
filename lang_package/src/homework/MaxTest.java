package homework;

import java.util.Arrays;

public class MaxTest{
	// 배열 생성 안하고 만들어 보기
	public static void max_v(int[] number){
		int max=-2147483648; // int의 최솟값
		Arrays.sort(number);
		for(int i=0;i<number.length;i++){
			if(max<number[i])
			max=number[i];
		}System.out.println("최대값"+max);
	}
	public static void main(String args[]){
		MaxTest.max_v(1,6,3,56,53);
	}
}