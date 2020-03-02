import mypack.*;
class Register{
private int Reg=90;
 int add()
{
	return Reg;
}
}
class EncapsulationB extends EncapsulationA{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationB obj=new EncapsulationB();
		obj.msg();
		Register ob=new Register();
		System.out.println(ob.add());
	
	}
}

