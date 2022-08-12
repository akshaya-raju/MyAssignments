package week1.day2;

public class CalculatorMethods {

	public int addThreeNumbers(int a,int b,int c) {
		int sum=a+b+c;
		return sum;
	}
	
	public int subTwoNumbers(int a,int b) {
		int sub=a-b;
		return sub;
	}
	public int multiplyThreeNumbers(int a,int b,int c) {
		int mult=a*b*c;
		return mult;
	}
	public int divTwoNumbers(int a,int b ) {
		int div=a/b;
		return div;
	}
	
	public static void main(String[] args) {
		CalculatorMethods obj=new CalculatorMethods();
		
		
		int add=obj.addThreeNumbers(3, 5, 7);
		System.out.println(add);
		int sub=obj.subTwoNumbers(45, 5);
		System.out.println(sub);
		int div=obj.divTwoNumbers(25, 5);
		System.out.println(div);
		int mul=obj.multiplyThreeNumbers(3, 4, 5);
		System.out.println(mul);
	}
}
