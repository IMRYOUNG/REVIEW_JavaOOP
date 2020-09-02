package singletonPatter;

public class Company {

	//아무것도 없는 생성자를 만든다. 
	private Company() {}
	
	// 자기자신  변수 인스턴스를 만든다. 얘는 내부에서 쓸 수 있는 생성자이다.
	//이 시스템 전체에서 이 instance가 유일한 것이다. 
	private static Company instance = new Company();
	
	//유일한 instance를  외부에서 가져다가사용하기 위해서 
	public Company getInstance() {
		if(instance==null) {
			instance=new Company();
		}
		return instance;
	}
}
