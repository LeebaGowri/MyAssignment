package assignment1;

public class Mobilee {
	public void sendmsg()
	{
		String Model="OPPO";
		int Mobileweight=50;
		System.out.println("Mobile weight is"+Mobileweight);
		
	}
	private void makecall()
	{
		boolean isCharged=true;
		int MobileCost=30000;
		System.out.println("Mobile cost is"+MobileCost);
	}
	public static void main(String[] args) {
		Mobilee obj= new Mobilee();
		obj.sendmsg();
		obj.makecall();
		System.out.println("This my mobile");

}
}
