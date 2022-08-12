package week1.day2;

public class Car {
	public void carBrand() {
		System.out.println("Honda");
	}
	public String carColour() 
	{
		return "Black";}
	
	public long carNumber()
	{
		return 8652791;
	}
	public int subTwoNumber(int a,int b)
	{
		int s=a-b;
		return s;
		
	}
	public int multiplyTwoNumber(int a,int b) {
		int m=a*b;
		return m;
		}
	public int division(int a,int b) {
		int d=a/b;
		return d;
	}
		public static void main(String[] args) {
			Car objc=new Car();
			
			objc.carBrand();
			String colour=objc.carColour();
			System.out.println(colour);
			long number=objc.carNumber();
			System.out.println(number);
			int subtraction=objc.subTwoNumber(30, 3);
			System.out.println(subtraction);
			int multiply=objc.multiplyTwoNumber(4, 5);
			System.out.println(multiply);
			int divide=objc.division(40, 8);
			System.out.println(divide);
				
		
		}
	}


