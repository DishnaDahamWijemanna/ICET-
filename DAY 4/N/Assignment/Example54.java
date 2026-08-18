import java.util.*;
class Example54{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Website URL: ");
		String url = input.nextLine();
		
		if(url.endsWith(".com")){
			System.out.println("Commercial Website");
		}else if(url.endsWith(".org")){
			System.out.println("Organization Website");
		}else if(url.endsWith(".lk")){
			System.out.println("Sri Lankan Website");
		}else{
			System.out.println("Unknown Website Type");
		}
	}
}
