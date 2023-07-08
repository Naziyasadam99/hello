package day1;

public class Usecar {
	public static void main(String[]args) {
		Car car1 = new Car();
		car1.brand = "bmw";
		car1.price = 40000;
		car1.colour = "black";
		car1.taxAmount = 10000;
		car1.netprice = car1.price + car1.taxAmount;
		System.out.println(car1.brand);
		System.out.println(car1.colour);
		System.out.println(car1.price);
		System.out.println(car1.taxAmount);
		System.out.println(car1.netprice);
		Car car2 = new Car();
		car2.brand = "bmw";
		car2.price = 60000;
		car2.colour = "white";
		car2.taxAmount = 10000;
		car2.netprice = car2.price + car2.taxAmount;
		System.out.println(car2.brand);
		System.out.println(car2.colour);
		System.out.println(car2.price);
		System.out.println(car2.taxAmount);
		System.out.println(car2.netprice);
		Car car3 = new Car();
		car3.brand = "bmw";
		car3.price = 80000;
		car3.colour = "black";
		car3.taxAmount = 10000;
		car3.netprice = car3.price + car3.taxAmount;
		System.out.println(car3.brand);
		System.out.println(car3.colour);
		System.out.println(car3.price);
		System.out.println(car3.taxAmount);
		System.out.println(car3.netprice);
	}

}
