package week3.day1;

public class AxisBank extends BankInfo{
      public int deposit(int d) {
    	  System.out.println(d);
    	  return d;
      }
      
      
      public static void main(String[] args) {
    	  AxisBank ax=new AxisBank();
    	  ax.savings();
    	  ax.deposit(30000);
    	  ax.fixed(7000);
    	  ax.fixed(4000);
 
    	  
		
	}
}


