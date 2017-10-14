public class Task5{
	public static void main(String[] args){
		
		int a;
		
		do{
			print("Enter 0-9 = ");
			a = Scan.scanInt("Error! Enter 0-9 = ");
		}
		while(a < 0 || a > 9);
		
		switch(a){
			case 0:
			print("zero");
			break;
			case 1:
			print("one");
			break;
			case 2:
			print("two");
			break;
			case 3:
			print("three");
			break;
			case 4:
			print("four");
			break;
			case 5:
			print("five");
			break;
			case 6:
			print("six");
			break;
			case 7:
			print("seven");
			break;
			case 8:
			print("eigth");
			break;
			case 9:
			print("nine");
			break;
		}	
	}
	
	public static void print(String text){
		System.out.print(text);
	}	
}	
	
		