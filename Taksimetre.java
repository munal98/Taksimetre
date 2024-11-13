import java.util.Scanner;

public class Taksimetre {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("KM Verisini Giriniz : ");
		double km =sc.nextInt();
		double price =10+(km * 2.20);
		price = (price < 20) ? 20 : price;
		//if (price <20) price =20;
		System.out.println("Taksimetre : " + price);

	}

}
