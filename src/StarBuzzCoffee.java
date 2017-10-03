import java.text.NumberFormat;

public class StarBuzzCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage b1 = new Espresso();
		System.out.print(b1.getDescription() + " ");
		NumberFormat numFormat = NumberFormat.getCurrencyInstance();
		String priceb1 = numFormat.format(b1.cost());
		System.out.println(priceb1);
		
		Beverage b2 = new HouseBlend();
		b2 = new Mocha(b2);
		b2 = new Whip(b2);
		System.out.print(b2.getDescription() + " ");
		String priceb2 = numFormat.format(b2.cost());
		System.out.println(priceb2);
		
		Beverage b3 = new Decaf();
		b3 = new StreamedMilk(b3);
		b3 = new Soy(b3);
		b3 = new Whip(b3);
		System.out.print(b3.getDescription() + " ");	
		String priceb3 = numFormat.format(b3.cost());
		System.out.println(priceb3);
		
		Beverage b4 = new DarkRoast();
		b4 = new Mocha(b4);
		b4 = new Soy(b4);
		System.out.print(b4.getDescription() + " ");
		String priceb4 = numFormat.format(b4.cost());
		System.out.println(priceb4);
	}

}
