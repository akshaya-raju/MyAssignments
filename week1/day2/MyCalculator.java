package week1.day2;

public class MyCalculator {

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
