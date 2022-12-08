import java.util.Scanner;
class tax{
     public static void main(String[] args)
	 {
	    int product;
		float tax,price;
		String item_name;
		Scanner in=new Scanner(System.in);
		System.out.println("1.Stationery");
		System.out.println("2.Electronics");
		System.out.println("3.Grocery");
		product=in.nextInt();
		switch(product)
		{
			case 1:
				 System.out.println("\nEnter rhe price of the item:");
				 price=in.nextFloat();
				 tax=price*8/100;
				 price=price+tax;
				 System.out.println("Including tax the price is:"+price);
				 break;
		    case 2:
				 System.out.println("\nEnter rhe price of the item:");
				 price=in.nextFloat();
				 tax=price*10/100;
				 price=price+tax;
				 System.out.println("Including tax the price is:"+price);
				 break;
		    case 3:
				 System.out.println("\nEnter rhe price of the item:");
				 price=in.nextFloat();
				 tax=price*3/100;
				 price=price+tax;
				 System.out.println("Including tax the price is:"+price);
				 break;
		    default:
			     System.out.println("\nSorry products are not in the list");
		}
		
	 }
}