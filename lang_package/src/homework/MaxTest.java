package homework;

import java.util.Arrays;

public class MaxTest{
	// �迭 ���� ���ϰ� ����� ����
	public static void max_v(int[] number){
		int max=-2147483648; // int�� �ּڰ�
		Arrays.sort(number);
		for(int i=0;i<number.length;i++){
			if(max<number[i])
			max=number[i];
		}System.out.println("�ִ밪"+max);
	}
	public static void main(String args[]){
		MaxTest.max_v(1,6,3,56,53);
	}
}