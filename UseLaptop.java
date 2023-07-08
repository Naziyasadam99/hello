package day1;

public class UseLaptop {
	public static void main (String []args) {
		Laptop first_Laptop = new Laptop();
		first_Laptop.brand = "hp";
		first_Laptop.colour= "black";
		first_Laptop.price= 18000;
		System.out.println(first_Laptop.brand);
		System.out.println(first_Laptop.colour);
		System.out.println(first_Laptop.price);
		Laptop second_Lap = new Laptop();
		second_Lap.brand = "hp";
		second_Lap.colour= "white";
		second_Lap.price= 20000;
		System.out.println(second_Lap.brand);
		System.out.println(second_Lap.colour);
		System.out.println(second_Lap.price);
}

}
