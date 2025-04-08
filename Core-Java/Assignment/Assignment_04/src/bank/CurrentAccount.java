package bank;


	public class CurrentAccount extends Bank {

		public CurrentAccount(float de) {
			super(de);
			
		}

		public CurrentAccount(long accountNo, String name, float balance, String branch) {
			super(accountNo, name, balance, branch);
			
		}

		@Override
		public void display(Bank[] b) {
			
			for(int i=0;i<b.length;i++)
			{
				System.out.println("Current = [ Account No-"+b[i].accountNo+" Name-"+b[i].name+" Balance-"+b[i].balance+" Branch-"+b[i].branch);
			}
			
		}
		
		
		public void Deposite()
		{
			
		}
		
		public void withdrawal()
		{
			
		}
		
		
		public double dcal(Bank []b)
		{
			double d = 0;
			for(int i=0;i<b.length;i++)
			{
				 d=d+b[i].balance;
			}
			return d;
		}
		

	}


