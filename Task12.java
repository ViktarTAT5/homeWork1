import java.util.Scanner;

public class Task12{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String line;
		String[] masLine;
		boolean stop = false;
		
		while(!stop){
		System.out.print("Enter = ");
		line = sc.nextLine();
		masLine = line.split(" ");
			if(selectionStop(masLine)){
				stop = true;
			}else{
				stop = false;
			}
		}
		System.out.print("FINISH!!!");
	}
	
	public static boolean selectionStop(String[] masLine){
		for(int i = 0; i < masLine.length; i++){
			if(masLine[i].toLowerCase().equals("stop")){
				return true;
			}
		}
		return false;
	}	
}	