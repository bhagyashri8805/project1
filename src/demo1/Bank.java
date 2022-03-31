package demo1;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HDFCBank s1=new HDFCBank();
		s1.printHomeLoanRBI();
		s1.printPersonalLoanRBI();
		s1.printHomeLoanHDFC();
		s1.printPersonalLoanHDFC();
		
}
}

class RBIBank {

	float RBIhomeloan =5.5f;
	float RBIpersonalloan=7.5f;


	void printHomeLoanRBI() {

		System.out.println("RBIhomeloan="+RBIhomeloan);
	}

	void printPersonalLoanRBI() {
		System.out.println("RBIpersonalloan="+RBIpersonalloan);
	}
}
class HDFCBank extends RBIBank {

	float HDFChomeloan =5.5f;
	float HDFCpersonalloan=7.5f;


	void printHomeLoanHDFC() {

		System.out.println("HDFChomeloan="+HDFChomeloan);
	}
		
	void printPersonalLoanHDFC() {
		System.out.println("HDFCpersonalloan="+HDFCpersonalloan);

	}

class ICICI extends RBIBank{
	float ICICIhomeloan =5.5f;
	float ICICIpersonalloan=7.5f;


	void printHomeLoanICICI() {

		System.out.println("ICICIhomeloan="+ICICIhomeloan);
	}
		
	void printPersonalLoanICICI() {
		System.out.println("ICICIpersonalloan="+ICICIpersonalloan);

	}

}
}
