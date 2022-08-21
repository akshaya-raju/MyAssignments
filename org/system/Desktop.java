package org.system;

public class Desktop extends Computer{
   public void desktopSize() {
	   System.out.println("The Size of the desktop is 30 inches");
	   
   }
   public static void main(String[] args) {
	Desktop deskt=new Desktop();
	deskt.desktopSize();
	deskt.computerModel();
}
   
}
