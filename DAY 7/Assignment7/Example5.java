import java.util.*;
class Example5{
		public static void main(String args[]){
				int [] marks = {56, 81, 43, 69, 93, 54, 48, 47, 51, 79, 82, 96, 57, 61, 66};
				System.out.println(marks.length);
				System.out.println("------------2");
				for(int i=0;i<5;i++){
						System.out.println(marks[i]);
						
				}
				System.out.println("------------3");
				for(int i =0;i<marks.length;i++){
						System.out.println(marks[i]);
						
				}
				System.out.println("------------4");
				for(int i =9;i<marks.length;i++){
						System.out.println(marks[i]);
				}
		}
}
