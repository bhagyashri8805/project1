package demo1;

public class Studentinfo {
	
	
	int rollno;  
	String name;  
	float fee; 
	public static void main(String[] args) {
		
		Studentinfo s1=new Studentinfo(111,"Bhagyashri",5000f); 
		s1.display();
		Studentinfo s2=new Studentinfo(112,"Rajendra",6000f);  
		s2.display();
	}
	
	Studentinfo(int rollno,String name,float fee){  
	this.rollno=rollno;  
	this.name=name;  
	this.fee=fee;  
	}  
	void display(){
		System.out.println(rollno+" "+name+" "+fee);
		}  
	  
	   
  
	}


