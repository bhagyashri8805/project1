package demo1;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalRow=5;
		for(int r=1;r<=totalRow;r++) {
			for(int i=1;i<=r-1;i++) {
				System.out.print(" ");
			}
			//for(int st=1;st<=2*r-1;st++)
			for(int st=1;st<=(totalRow*2)-(2*r)+1;st++) {
				System.out.print("*"); 
			}
			System.out.println();
		}
	}

}
