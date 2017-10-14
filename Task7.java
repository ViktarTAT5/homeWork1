public class Task7{
	public static void main(String[] args){
		int a;
		String text;
		
		do{
			print("Enter -9 <-> 9 = ");
			a = Scan.scanInt("Error! Enter 0-9 = ");
		}
		while(a < -9 || a > 9);
		
		if(a%2 == 0 &&  a > 0){
			text = "true";
		}else{
			text = "false";
		}
		
		System.out.println(a + " " + text);
	}
	
	public static void print(String text){
		System.out.print(text);
	}
}	