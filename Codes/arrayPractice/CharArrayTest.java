/*배열 문제
 * 문자 배열을 생성하고 출력해 보세요
 * 대문자를 A-Z까지 배열에 저장하고 이를 다시 출력하는 프로그램을 만들어 보세요*/
package arrayPractice;

public class CharArrayTest {

	public static void main(String[] args) {
		char[] alphabet=new char[26];	
		char ch='A';
		
		for(int i=0; i<alphabet.length; i++) {
			alphabet[i]=ch++; //알파벳도 정수로 표현 가능하므로 ++을 적용할 수 있다.
		}
		
		for(int i=0 ; i<alphabet.lenth; i++) {
			System.out.println(alphabet[i]);
		}
	
	}

}
