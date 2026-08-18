class Example16{
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++){
			System.out.println(i);   //1
		}
		
		
		for (int i = 0; i < 10; i++){
			System.out.println(i++);   //2
		}
		
		
		for (int i = 0; i < 10; i++){
			System.out.println(++i);   //3
		}
		
		
		int j=0;
		while(j<10){
			System.out.println(j);  //4
			j++;
		}
		
		
		int k=0;
		while(k<10){
			System.out.println(k++);   //5
		}
		
		
		int m=0;
		while(m<10){
			System.out.println(++m); //6
		}
		
		
		int n=0;
		while(n++<10){
			System.out.println(n);  //7 
		}
		
		
		
		int p=0;
		while(++p<10){
			System.out.println(p);  //8
		}
		
		
		
		int q=0;
		do{
			System.out.println(q++);  //9
		}while(q<10);
		
		
		int s=0;
		do{
			System.out.println(++s);  //10
		}while(s<10);
		
		
		int t=0;
		do{
			System.out.println(t);   //11
		}while(t++<10);
		
		
		int u=0;
		do{
			System.out.println(u);  //12
		}while(++u<10);
	}
}
