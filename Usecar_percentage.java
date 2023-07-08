package day1;

public class Usecar_percentage {
	public static void main (String[]args) {
		Car_percentage bmw_car =new Car_percentage();
		bmw_car.brand = "bmw";
		bmw_car.colour = "white";
		bmw_car.price = 40000;
		bmw_car.taxpercent = 20;
		bmw_car.netprice = bmw_car.price + (bmw_car.price *bmw_car.taxpercent/100);
		System.out.println("bmw car detail:"+"\n" + bmw_car.brand+"\n"+bmw_car.colour+"\n"+bmw_car.netprice);
		Car_percentage abc_car = new Car_percentage();
		abc_car.brand = "abc";
		abc_car.colour = "black";
		abc_car.price = 50000;
		abc_car.taxpercent= 10;
		abc_car.netprice = abc_car.price+(abc_car.price * abc_car.taxpercent/100);
		System.out.println("abc car detail:"+"\n" + abc_car.brand+"\n"+abc_car.colour+"\n"+abc_car.netprice);
		
		

		
	}

}
