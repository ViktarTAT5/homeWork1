import java.util.Scanner;

public class Task11{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		char x;
		
		do{
		System.out.print("Enter symbol = ");	
		x = sc.next().charAt(0);
		}while(x != 'q');
		System.out.println("FINISH");
	}
}	