package objectCooperation;

public class Bus {
	int busNum;
	int riderBus;
	int incomeBus;
	
	public  Bus(int busNum){
		this.busNum=busNum;	
	}
	
	public void takeBus(int incomeBus) {
		this.incomeBus+=incomeBus; //승차 method
		riderBus++;
	}
	
	public void showBusInfo(){
		System.out.println(busNum + " 번 버스의 승객은"+riderBus+" 이고 수입은 "+incomeBus+"이다.");
	}
}
