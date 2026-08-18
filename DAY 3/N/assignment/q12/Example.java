class Example {
	public static void main(String args[]) {
		int x;
		x = 7 % 10 / 2 * 2;// % --> / --> * (this is how its work)
		System.out.println(x);
		x = 7 % (10 / 2) * 2;// (10/2) --> % --> *  (this is how its work)
		System.out.println(x);
		x = 7 % 10 / (2 * 2);// (2*2) --> % --> / (this is how its work)
		System.out.println(x);
		x = 7 % (10 / (2 * 2));// (2*2) --> (10/4) --> % (this is how its work)
		System.out.println(x);
		x = 7 % ((10 / 2) * 2);// (10/2) --> (5*2) --> % (this is how its work)
		System.out.println(x);
    }
}
