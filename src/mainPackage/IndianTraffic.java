package mainPackage;

import interfacePackage.CentralTraffic;

public class IndianTraffic implements CentralTraffic{

	public static void main(String[] args) {
		CentralTraffic ct = new IndianTraffic();
		IndianTraffic it = new IndianTraffic();
		
		ct.green();
		it.green();
		ct.yellow();
		ct.red();
	}

	
	public void green() {
 
		System.out.println("Please go");		
	}


	public void red() {
		System.out.println("Please stop");			
	}

	
	public void yellow() {
		System.out.println("Please wait");			
	}
	
	
}
