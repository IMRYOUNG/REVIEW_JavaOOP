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
		System.out.println(kind+" 택시의 승객은 "+riderTaxi+"명이고 수입은 "+incomeTaxi+"입니다.");
	}

}
