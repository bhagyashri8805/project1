package demo1;

public class maxnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=30,b=10,c=30;
	maxnum obj1=new maxnum();
	
	
	int result=obj1.maxnum1(a, b, c);
	System.out.println(result);
	}
	int	maxnum1(int a,int b,int c) 
	{
		
		if(a>b && a>c) {
		return a;
		}	
		else if(b>a && b>c) {
			return b;
			
		}
	
		else {
			return c;
		}
			
		}
	
		
	}
