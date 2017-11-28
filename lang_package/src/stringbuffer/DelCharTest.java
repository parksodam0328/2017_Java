package stringbuffer;

public class DelCharTest {
	public String delChar(String str1, String str2){
		StringBuffer result = new StringBuffer();
		/*for(int i=0;i<str1.length();i++){
			for(int j=0;j<str2.length();j++){
				if(str1.charAt(i)!=str2.charAt(j)){
					result.append(str1.charAt(i));
				}i++;break;
			}
		}
		return result.toString();
	}*/
		//for(int i=0;i<str1.length();i++){
			//char[] num=str1.toCharArray();
		
			for(int j=0;j<str1.length();j++){
				//char ch=str2.charAt(j);
				if(str2.indexOf(str1.charAt(j)) == -1){
				result.append(str1.charAt(j));
				
			} 
		}
		//}
		return result.toString();
	}

	public static void main(String[] args) {
		DelCharTest d = new DelCharTest();
		System.out.println(d.delChar("12!!!@!@!@!!!!@!!@3!45@","!@"));
	}
}
