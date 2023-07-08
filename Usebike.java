package day1;

public class Usebike {
public static void main (String[] args) {
	Bike hondabike = new Bike();
	hondabike.brand = "honda";
	hondabike.colour= "blue";
	hondabike.price= 7000;
	hondabike.disAmount = 2000;
	hondabike.netPrice = hondabike.price - hondabike.disAmount;
	System.out.println("hondabike details");
	System.out.println(hondabike.netPrice);
	Bike abc_bike =new Bike();
	abc_bike.brand ="abc";
	abc_bike.colour="red";
	abc_bike.price = 6000;
	abc_bike.disAmount=1000;
	abc_bike.netPrice = abc_bike.price - abc_bike.disAmount;
	System.out.println(abc_bike.netPrice);
	Bike tvs_bike =new Bike();
	tvs_bike.brand ="abc";
	tvs_bike.colour="white";
	tvs_bike.price = 12000;
	tvs_bike.disAmount=5000;
	tvs_bike.netPrice = tvs_bike.price - tvs_bike.disAmount;
	System.out.println(tvs_bike.netPrice);
}
}
