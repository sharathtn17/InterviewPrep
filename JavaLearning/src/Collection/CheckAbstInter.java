package Collection;

public class CheckAbstInter extends AbstractEmp implements InterfaceExp{

	public CheckAbstInter(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

	@Override
	void aOne() {
		System.out.println("this is One Abstact emthod");
		
	}

//	@Override
	public void iThree() {
		System.out.println("this is third Interface emthod");
		
	}
	
	public static void main(String args[])
	{
		CheckAbstInter cia=new CheckAbstInter(1);
		CheckAbstInter.aTwo();
		InterfaceExp.iTwo();
		cia.aOne();
		cia.iOne();
		cia.aTwo();
		
	}

//	@Override
	public void iFour() {
		// TODO Auto-generated method stub
		
	}

	//@Override
	public void iFive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iFive(int a, int b) {
		// TODO Auto-generated method stub
		
	}

}