class Date{
	private int year;
	private int month;
	private int day;
	
	public void setDate(int year, int month, int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	
	
	public void setDate(Date d){
		this.year=d.year;
		this.month=d.month;
		this.day=d.day;
	}
	Date(){
		this.year = 1970;
		this.month= 1;
		this.day=1;	
	}
	Date(int y,int m,int d){
		this.year = y;
		this.month= m;
		this.day=d;
	}
	Date(Date date){
			this.year=date.year;
			this.month=date.month;
			this.day=date.day;
	}
	public void printDate(){
		System.out.println(year+"-"+month+"-"+day);
	}
	
}
class Example12{	
	public static void main(String args[]){
		Date d1=new Date(2026,9,5);
		d1.printDate(); //2026-9-5
		
		Date d2=new Date();
		d2.printDate(); //1970-1-1
		d2.setDate(d1);
		d2.printDate(); //2026-9-5
		
		Date d3=new Date(d2);
		d3.printDate(); //2026-9-5
	}	
}

