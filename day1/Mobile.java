package week1.day1;

public class Mobile {
	
	String mobileModel="vivo";
	int mobileWieght=2;
	boolean isFullCharge= true;
	double mobileCost= 14500.65464;

	public void makeCall() {
		System.out.println("calling");

	}
	public void sendMsg() {
		System.out.println("texting");

	}
	public static void main(String[] args) {
	Mobile vivo = new Mobile();
	vivo.makeCall();
	vivo.sendMsg();
	System.out.println(vivo.mobileModel);
	System.out.println(vivo.mobileCost);
	System.out.println(vivo.isFullCharge);
	System.out.println(vivo.mobileWieght);

}
}
