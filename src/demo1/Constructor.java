package demo1;

public class Constructor {


	String name;
	int rollnumber;
	String adress;

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		Constructor obj1=new Constructor("Rajendra",1,"pune");
		obj1.displayfamilyinfo();
		Constructor obj2=new Constructor("Bhagyashri",2,"solapur");
		obj2.displayfamilyinfo();
		Constructor obj3=new Constructor("Harry",3,"Hadpsar");
		obj3.displayfamilyinfo();


	}
	Constructor(String name1,int rollnumber1,String adress1){
		name=name1;
		rollnumber=rollnumber1;
		adress=adress1;
	}

	void displayfamilyinfo() {

		System.out.println("name = " +name);
		System.out.println("rollnumber = " +rollnumber);
		System.out.println("adress = " +adress);


	}
}
