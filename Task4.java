import java.util.Scanner;

public class Task4{
	public static void main(String[] args){
		
	int a = 0;
	int b = 0;
	int result;
	char sign = '+';
	
	Scanner sc = new Scanner(System.in);
	
	print("Enter a = ");
	a = Scan.scanInt("Error! Enter a = ");
		
	print("Enter b = ");
	b = Scan.scanInt("Error! Enter b = ");
	
	print("Enter sign of operation = ");
	sign = scanSign();	
		
	result = selectionOperation(sign, a, b);
	
	print("result = " + result);	
	}
	
	public static char scanSign(){
		char sign;
		do{
			sign = Scan.scanChar();
		}while(!chekingSign(sign));
		return sign;
	}	
	
	public static boolean chekingSign(char sign){
		if(sign == '-' || sign == '+' || sign == '/' || sign == '*') {
			
			return true;
		}else{
			print("Error! Enter sign of operation = ");
			return false;
		}
	}

	public static int selectionOperation(char sign, int a, int b){
		int result = 0;
		switch(sign){
			case '+':
			result = a + b;
			break;
			case '-':
			result = a - b;
			break;
			case '*':
			result = a * b;
			break;
			case '/':
			result = a / b;
			break;
		}	
		return result;
	}	
	
	public static void print(int a){
		System.out.print(a);
	}
	
	public static void print(String text){
		System.out.print(text);
	}	
}	