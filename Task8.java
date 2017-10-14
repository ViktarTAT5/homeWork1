import java.util.Scanner;

public class Task8{
	public static void main(String[] args){
		String text;
		String season = "Error!";
		Scanner sc = new Scanner(System.in);
		
		text = sc.next().toLowerCase().trim();
		switch(text){
			case "january":
			case "february":
			case "december":
				season = "Winter";
			case "mart":
			case "april":
			case "may":
				season = "Spring";
			case "june":
			case "jule":
			case "august":
				season = "Summer";
			case "september":
			case "october":
			case "november":
				season = "Autumn";
		}
		
		System.out.println(text + " " + season);
	}
}	