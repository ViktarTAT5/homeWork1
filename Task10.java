import java.util.Scanner;

public class Task10{
	public static void main(String[] args){
		int a = 1;
		int b = 4;
		int c = 9;
		int result = 0;
		
		if((a>b && a<c) || (a>c && a<b)){
			result = b + c;
		}
		
		if((b>a && b<c) || (b>c && b<a)){
			result = a + c;
		}
		
		if((c>a && c<b) || (c>b && c<a)){
			result = b + a;
		}
		
		System.out.println("result = " + result);
	}
}	