/*�迭 ����
 * ���� �迭�� �����ϰ� ����� ������
 * �빮�ڸ� A-Z���� �迭�� �����ϰ� �̸� �ٽ� ����ϴ� ���α׷��� ����� ������*/
package arrayPractice;

public class CharArrayTest {

	public static void main(String[] args) {
		char[] alphabet=new char[26];	
		char ch='A';
		
		for(int i=0; i<alphabet.length; i++) {
			alphabet[i]=ch++; //���ĺ��� ������ ǥ�� �����ϹǷ� ++�� ������ �� �ִ�.
		}
		
		for(int i=0 ; i<alphabet.lenth; i++) {
			System.out.println(alphabet[i]);
		}
	
	}

}
