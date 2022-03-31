package demo1;

public class Demo2 {

	public static void main(String[] args) {
		
		

	    // crprintmesg1e an object of the subclass
	    HDFC Demo2 = new HDFC();

	    // call the printmesg1() method
	    Demo2.printmesg1();
	    Demo2.printmsg2();
	  }
		// TODO Auto-generated method stub


			  // method in the superclass
			  public void printmesg1() {
			    System.out.println("homeloan");
			    System.out.println("personalloan");
			  }
			}

			
			class HDFC extends Demo2 {

		
			  void printmesg1() {
			    System.out.println("home loan intrest");
			  }


			  void printmsg2() {
			    System.out.println("personal loan intrest");
			  }
			}

