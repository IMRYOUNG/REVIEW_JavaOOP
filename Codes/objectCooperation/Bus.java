package objectCooperation;

public class Bus {
	int busNum;
	int riderBus;
	int incomeBus;
	
	public  Bus(int busNum){
		this.busNum=busNum;	
	}
	
	public void takeBus(int incomeBus) {
		this.incomeBus+=incomeBus; //���� method
		riderBus++;
	}
	
	public void showBusInfo(){
		System.out.println(busNum + " �� ������ �°���"+riderBus+" �̰� ������ "+incomeBus+"�̴�.");
	}
}
