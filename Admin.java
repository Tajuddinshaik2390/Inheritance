package Inheritance;

public class Admin extends Developer{
	
	 public void manage() {
		 super.read();
		 write();
		 manage();
		 
		 System.out.println("Admin manages");
	 }
	 public void read() {
		 
		 
	 }
	}


