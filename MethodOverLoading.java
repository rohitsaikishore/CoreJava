package coreJava;

class Add{
	//here we can see that there is a difference in the number of parameters or type of parameters or order of parameters, this is called as method overloading.
	int add(int a) {
		return a;
	}
	double add(double a,float b) {
		return a+b+10;
	}
	double add(int b,int a) {
		return b+a+15f;
	}
}

public class MethodOverLoading {
	public static void main(String[] args) {
		Add a=new Add();
		System.out.println(a.add(10,20));
		
	}

}


