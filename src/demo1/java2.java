package demo1;

public class java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int salary=1400000;

		if(salary<=500000) {

			System.out.println("no tax");
		}

		else if(salary>500000 && salary<=1000000) {


			System.out.println("5% tax");

		}
		else if(salary>1000000 && salary<=1500000) {


			System.out.println("10% tax");
		}
	
	else if(salary>1500000) {


		System.out.println("30% tax");
	}

}


}
