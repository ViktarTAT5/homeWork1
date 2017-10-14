import java.util.Scanner;

public class Scan{
	
	public static int scanInt(String text){
		Scanner sc = new Scanner(System.in);
		while(!sc.hasNextInt()){
			System.out.println("Error! " + text + " ");
			sc.next();
		}
		
		int a = sc.nextInt();
		return a;
	}
	
	public static char scanChar(){
		Scanner sc = new Scanner(System.in);
		char  x = sc.next().charAt(0);
		return x;
	}	
}	