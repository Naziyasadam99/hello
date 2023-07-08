package day1;

public class UseBag {
	public static void main (String[]args) {
	Bag bag1 = new Bag();
	bag1.brand = "abc";
	bag1.colour= " black";
	bag1.number_of_zip = 5;
	bag1.price = 1000;
	System.out.println(bag1.brand);
	System.out.println(bag1.colour);
	System.out.println(bag1.number_of_zip);
	System.out.println(bag1.price);
	Bag bag2 =new Bag();
	bag2.brand = "abc";
	bag2.price = 2000;
	bag2.colour = "white";
	bag2.number_of_zip = 4;
	System.out.println(bag2.brand);
	System.out.println(bag2.colour);
	System.out.println(bag2.price);
	System.out.println(bag2.number_of_zip);
	Bag bag3 =new Bag();
	bag3.brand = " abc";
	bag3.colour = "white";
	bag3.price= 400;
	bag3.number_of_zip=4;
	System.out.println(bag3.brand);
	System.out.println(bag3.number_of_zip);
	System.out.println(bag3.price);
	System.out.println(bag3.colour);
	
	}

}
