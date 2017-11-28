package homework;

class Rvariable{
	public static void isRightVariable(String str1){
		boolean result;
		char str2[]=str1.toCharArray();
		String word[] = {"abstract","assert","boolean","break","byte","case","catch",
				"char","class","const","continue","default","do","double","else",
				"extends","false","final","finally","float","for","goto","if","implements",
				"import","instanceof","int","interface","long","native","new","null",
				"package","private","protected","public","short","static",
				"super","switch","synchronized","this","throw","throws","transient",
				"true","try","void","volatile","while"};
		if(str1.length()<=10){
			for(int i=0;i<word.length;i++){
				if(str1==word[i]){
					result=false;
					System.out.println(str1+" = "+result);
					return;
				}
				else {
					for(int j=0;j<str2.length;j++){
						if(true==Character.isUpperCase(str1.charAt(0))){
						result=false;
						System.out.println(str1+" = "+result);
						return;
					}
					else if(true!=Character.isJavaIdentifierStart(str1.charAt(0))){
						result=false;
						System.out.println(str1+" = "+result);
						return;
					}else if(true!=Character.isJavaIdentifierPart(str1.charAt(j))){
							result=false;
							System.out.println(str1+" = "+result);
							return;
						}
					}
				}
			}result=true;
				System.out.println(str1+" = "+result);
		}else System.out.println("변수명은 10글자 이하로 입력하셔야합니다!!");
	}
}
public class RightVariableTest{
	public static void main(String args[]){
		Rvariable.isRightVariable("9aaa");
		Rvariable.isRightVariable("las$@#!s");
		Rvariable.isRightVariable("las$@#!s0afkjw");
	}
}