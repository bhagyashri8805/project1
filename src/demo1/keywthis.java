package demo1;

public class keywthis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//keywthis obj=new.keywthis();
		keywthis obj=new keywthis();
	}
	keywthis(){
		this(10);
		System.out.println("0 args");
	}
	
	keywthis(int a){
		this(10,20);
		System.out.println("1 args");
	}
	keywthis(int a,int b){
		this(30.3f,10);
		System.out.println("2 args");
	}
	keywthis(float a,int b){
		System.out.println("2 args");
	}
}
