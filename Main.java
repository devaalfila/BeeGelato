import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner scan = new Scanner(System.in);
	ArrayList<Integer> listOrder = new ArrayList<>();
	ArrayList<Integer> listType = new ArrayList<>();
	ArrayList<Integer> listConesundae= new ArrayList<>();
	ArrayList<Integer> listTopping = new ArrayList<>();
	ArrayList<Integer> listQuantity = new ArrayList<>();
	
	public void Menuorder() {
		
		int order = 0;
		do {
			System.out.println("Input 'No Order' [1 - 10000]									: ");
			try { 
				order = scan.nextInt();
			}catch (Exception e) {
			
			}
			scan.nextLine();
			if(order >= 1 && order <= 10000) {
				break;
			}
		}while (true);
		listOrder.add(order);
		
		int type = 0;
		do {
			System.out.println("Type (1. Strawberry 2. Coklat 3. Vanilla 4. Durian 5. Blueberry): ");
			try { 
				type = scan.nextInt();
			}catch (Exception e) {
			
			}
			scan.nextLine();
			if(type >= 1 && type <= 5) {
				break;
			}
		}while (true);
		listType.add(type);
		
		int conesundae = 0;
		do {

			System.out.println("Cone/Sundae (1. Cone 2. Sundae)									: ");
			try { 
				conesundae = scan.nextInt();
			}catch (Exception e) {
				
			}
			scan.nextLine();
			if(conesundae >= 1 || conesundae <= 2) {
				break;
			}
		}while (true);
		listConesundae.add(conesundae);
		
		int topping = 0;
		do {
			System.out.println("Topping (0. No Topping 1. Almond 2. Nut 3. Oreo 4. Messes)		: ");
			try { 
				topping = scan.nextInt();
			}catch (Exception e) {
			
			}
			scan.nextLine();
			if(topping >= 0 && topping <= 4) {
				break;
			}
		}while (true);
		listTopping.add(topping);
		
		int quantity = 0;
		do {
			System.out.println("Quantity														: ");
			try { 
				quantity = scan.nextInt();
			}catch (Exception e) {
			
			}
			scan.nextLine();
			if(quantity >= 1 && quantity <= 10000) {
				break;
			}
		}while (true);
		listQuantity.add(quantity);
		
	}
	
	public void Menuorderhistory() {
		
	}
	
	public Main () {
		
		int menu = 0;
		
		do {
		
		System.out.println("BEE GELATO");
		System.out.println("-----------");
		System.out.println("");
		System.out.println("1. Order");
		System.out.println("2. Order History");
		System.out.println("3. Exit");
		
		try {
			menu = scan.nextInt();
			}catch (Exception e) {

			}
			scan.nextLine();
			
			if (menu == 1) {
				Menuorder();
				
			}else if (menu == 2) {
				Menuorderhistory();	
			}
		
		}while(menu!= 3);
		System.out.println("Thank You");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main ();

	}

}
