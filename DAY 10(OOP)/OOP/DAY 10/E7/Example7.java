class Date{
	private int year;
	private int month;
	private int day;
	
	public void printDate(){
			System.out.println(year+"-"+month+"-"+day);
	}
	
	public void setDate(int y,int m,int d){
			year = y;
			month = m;
			day = d;
			
	}
	public void setYear(int year){
			this.year =year;
	}
	public void setMonth(int month){
			this.month =month;
	}
	public void setDay(int day){
			this.day =day;
	}
	public int getYear(){
		return year;
	}
	public int getMonth(){
		return month;
	}
	public int getDay(){
		return day;
	}

	
	
		
}

class Example7{	
	public static void main(String args[]){
		Date d1=new Date();
		d1.setDate(2026,9,5);
		d1.printDate(); //2026-9-5
		
		d1.setYear(1999);
		d1.setMonth(12);
		d1.setDay(31); //day of month
		
		System.out.println("Year  : "+d1.getYear());
		System.out.println("Month : "+d1.getMonth());
		System.out.println("Day   : "+d1.getDay());
	}	
}


