public class Task6{
	public static void main(String[] args){
		int a;
		String text;
		
		do{
			print("Enter 0-9 = ");
			a = Scan.scanInt("Error! Enter 0-9 = ");
		}
		while(a < 0 || a > 9);
		
		if(a%2 == 0){
			text = "even";
		}else{
			text = "odd";
		}
		
		System.out.println(a + " " + text);
	}
	
	public static void print(String text){
		System.out.print(text);
	}
}	