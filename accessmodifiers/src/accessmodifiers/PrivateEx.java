package accessmodifiers;
//private members are accessible only within the class
public class PrivateEx {
	private int  a=12;
	private void display()
	{
		System.out.println("it is a private method");	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateEx p=new PrivateEx();
		p.display();
		System.out.println("the value of a is:"+p.a);

	}

}
