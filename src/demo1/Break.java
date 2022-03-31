package demo1;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int number=10;
		boolean flag=false;
		for(int i=2;i<=number/2;i++) {

			if(number%i==0) {
				flag=true;
				break;
			}
			if(flag) {
				System.out.println("not prime no");
			}
			else {
				System.out.println("prime no");
			}
		}

	}

}
