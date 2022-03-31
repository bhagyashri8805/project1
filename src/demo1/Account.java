package demo1;

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Book s1= new Book();
		s1.printACC();
		s1.printname();

	}
}
class Book{
	String title="abc";
	String author="nam";
	void printACC()
	{

		System.out.println("title is:="+ title);
	}
	void printname()
	{
		System.out.println("author is:="+ author);

	}
}

