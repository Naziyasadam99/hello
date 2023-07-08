package day1;

public class UseMobile {
public static void main(String[]args) {
	Mobile mobile_one = new Mobile();
	mobile_one.brand = "oppo";
	mobile_one.price= 9000;
	mobile_one.colour="black";
	System.out.println("oppo mobile details");
	System.out.println(mobile_one.brand+"\n"+ mobile_one.price+"\n"+mobile_one.colour);
	Mobile mobile_two =new Mobile();
	mobile_two.brand="vivo";
	mobile_two.price=9000;
	mobile_two.colour="white";
	System.out.println("vivo mobile details");
	System.out.println( mobile_two.price+"\n"+mobile_two.brand+"\n"+mobile_two.colour);
	Mobile mobile_three = new Mobile();
	mobile_three.brand = "MI";
	mobile_three.price=8000;
	mobile_three.colour= "black";
	System.out.println("MI mobile detail");
	System.out.println(mobile_three.brand);
	System.out.println(mobile_three.colour);
	System.out.println(mobile_three.price);
	
}
}
