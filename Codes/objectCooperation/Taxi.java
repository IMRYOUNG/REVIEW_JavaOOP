package objectCooperation;

public class Taxi {
	int incomeTaxi;
	String kind;
	int riderTaxi;
	
	public void Taxi(String kind) {
		this.kind=kind;
	}
	
	public void take(int incomeTaxi) {
		this.incomeTaxi=incomeTaxi;
		riderTaxi++;
	}
	
	public void infoTaxi(String kind) {
		System.out.println(kind+" �ý��� �°��� "+riderTaxi+"���̰� ������ "+incomeTaxi+"�Դϴ�.");
	}

}
