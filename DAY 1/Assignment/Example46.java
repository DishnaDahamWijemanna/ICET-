import java.util.*;
class Example46{
	public static void main(String args[]){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter Your age - ");
	int age=input.nextInt();
		if(age<18){
			System.out.println("age is not valid for vote");
		}else{
			System.out.println("welcome to vote");
		}
	}
}