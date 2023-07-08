package day1;

public class Useshirt {
public static void main (String []agrs) {
	Shirt shirt_1 = new Shirt();
	shirt_1.brand = "alaya";
	shirt_1.colour= "white";
	shirt_1.size = 43;
	shirt_1.price= 600;
	shirt_1.dis_percentage = 10;
	shirt_1.netprice= shirt_1.price - (shirt_1.price*shirt_1.dis_percentage/100);
	System.out.println(shirt_1.netprice);
	Shirt shirt_2 = new Shirt();
	shirt_2.brand= "ramraj";
	shirt_2.colour= "red";
	shirt_2.size = 35;
	shirt_2.price = 800;
	shirt_2.dis_percentage = 10;
	shirt_2.netprice = shirt_2.price -(shirt_2.price*shirt_2.dis_percentage/100);
	System.out.println(shirt_2.netprice);
	Shirt shirt_3 = new Shirt();
	shirt_3.brand = "alaya";
	shirt_3.colour="blue";
	shirt_3.size= 23;
	shirt_3.price = 700;
	shirt_3.dis_percentage = 10;
	shirt_3.netprice = shirt_3.price - (shirt_3.price*shirt_3.dis_percentage/100);
	System.out.println(shirt_3.netprice);
	
	
}
}
