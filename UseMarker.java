package day1;

public class UseMarker {
	public static void main (String []args) {
		Marker m1 = new Marker();
		m1.colour ="black";
		m1.brand ="camlin";
		m1.price=50;
		m1.height=2.4f;
		m1.shape="round";
		System.out.println(m1.colour);
		System.out.println(m1.brand);
		System.out.println(m1.price);
		Marker m2 = new Marker();
		m2.colour="red";
		m2.price = 70;
		m2.brand="natraj";
		m2.height=3.3f;
		Marker m3= new Marker();
		m3.colour="black";
		m3.brand="parker";
		m3.price=90;
		m3.height=5.4f;
		System.out.println(m2.colour+" "+m2.price+" "+m2.brand+m2.height);
		System.out.println(m3.colour+"\n"+m3.brand+"\n"+m3.price+"\n"+m3.height);
	}

}
