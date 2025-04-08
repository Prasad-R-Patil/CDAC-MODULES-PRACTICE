package bank;


	import java.util.Scanner;

	public class Customer {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int ch;
			Bank [] sev=new SavingAccount[0];
			Bank [] cur=new CurrentAccount[0];
			
			
			do {
				System.out.println("Chooes What do you  whant  Your Account Type....");
				System.out.println("1.Sevings Account:-");
				System.out.println("2.Current Account:-");
				System.out.println("3.Exit Process");
				
				System.out.println("==> Enter <==");
				ch=s.nextInt();
				
				
				
				switch(ch)
				{
					case 1:
					{
						System.out.println("How Many You Can Create Seavings Account:->");
						int size=s.nextInt();
						
						sev=new SavingAccount[size];
						
						for(int i=0;i<sev.length;i++)
						{
							
							System.out.println("Enter Account Number:->");
							long accountNo=s.nextLong();
							
							
							System.out.println("Enter Account Holder Name:->");
							String name=s.next();
							
							System.out.println("Enter Account Blance:->");
							float balance=s.nextFloat();
							
							System.out.println("Enter Branch Name:->");
							String branch=s.next();
							if(balance>=5000)
							{
								sev[i]=new SavingAccount(accountNo,name,balance,branch);
								System.out.println("Seavings Account was Created...!");
							}
							else
							{
								System.out.println("Account not Created(Minimum Balance less than 5000)");
							}
													
						}
						
						break;
					}
					
					case 2:
					{
						System.out.println("How Many You Can Create Current Account:->");
						
						int size1=s.nextInt();
						
						cur=new CurrentAccount[size1];
						
						for(int i=0;i<cur.length;i++)
						{
							
							System.out.println("Enter Account Number:->");
							long accountNo=s.nextLong();
							
							
							System.out.println("Enter Account Holder Name:->");
							String name=s.next();
							
							System.out.println("Enter Account Blance:->");
							float balance=s.nextFloat();
							
							System.out.println("Enter Branch Name:->");
							String branch=s.next();
							
							
							
							if(balance>=1000)
							{
								cur[i]=new CurrentAccount(accountNo,name,balance,branch);
								System.out.println("Current Account was Created...!");
							}
							else
							{
								System.out.println("Account not Created(Minimum Balance less than 1000)");
							}
							
							
							
						}
						
						
						break;
					}
					
					case 3:
					{
						System.out.println("Thank You For Visiting");
						break;
					}
					
					default:
					{
						System.out.println("Plese Enter Valid Choice...!");
						break;
					}
					
				}
				
			}while(ch!=3);	
			
			System.out.println("--------------------------------------------------");
			Bank sav=new SavingAccount(0.0f);
			
			sav.display(sev);
			double ds=sav.dcal(sev);
			
			Bank curr=new CurrentAccount(0.0f);
			
			
			curr.display(cur);
			
			double dc=curr.dcal(cur);
			
			System.out.println("--------------------------------------------------");
					
			
			System.out.println("--------------------------------------------------");
			System.out.println("Enter Account No You Want To Show Detail :-");
			int ac=s.nextInt();
			for(int i=0; i<sev.length;i++)
			{
				if(ac==sev[i].accountNo)
				{
					System.out.println("Sevings = [ Account No-"+sev[i].accountNo+" Name-"+sev[i].name+" Balance-"+sev[i].balance+" Branch-"+sev[i].branch);
					
					break;
				}
				
			}
			
			for(int i=0; i<cur.length;i++)
			{
				if(ac==cur[i].accountNo)
				{
					System.out.println("Current = [ Account No-"+cur[i].accountNo+" Name-"+cur[i].name+" Balance-"+cur[i].balance+" Branch-"+cur[i].branch);
					
					break;
				}
				
			}
			
			
			System.out.println("--------------------------------------------------");
			
			
			
			System.out.println("--------------------------------------------------");
			float amt1=0;
			
			
			System.out.println("Enter Saving Account No That You Wnat to Deposite :-");
			int dac1=s.nextInt();
			for(int i=0; i<sev.length;i++)
			{
				if(dac1==sev[i].accountNo)
				{
					System.out.println("Enter Account  That You Wnat to Deposite :-");
					 amt1=s.nextFloat();
					
					if(sev[i].balance>=5000)
					{
						float dep=sev[i].balance+amt1;
						sev[i] = new SavingAccount(dep);
						
					}
					
					System.out.println("Saving- Account No => "+dac1+" Balance => "+sev[i].balance);
					
					break;
					
				}
				
			}
			
			System.out.println("--------------------------------------------------");
			
			float amt2=0;
			
			System.out.println("Enter Current Account No That You Wnat to Deposite :-");
			int dac2=s.nextInt();
			for(int i=0; i<cur.length;i++)
			{
				if(dac2==cur[i].accountNo)
				{
					System.out.println("Enter Account  That You Wnat to Deposite :-");
					 amt2=s.nextFloat();
					
					if(cur[i].balance>=1000)
					{
						float dep=cur[i].balance+amt2;
						cur[i] = new CurrentAccount(dep);
					
					}
					
					System.out.println("Current- Account No => "+dac2+" Balance => "+cur[i].balance);
					
					break;
					
				}
				
			}
			
			System.out.println("--------------------------------------------------");
			
			
			
			System.out.println("--------------------------------------------------");
			
			System.out.println("In bank total diposit is -->"+(ds+dc+amt1+amt2));
			
			System.out.println("--------------------------------------------------");
			
			
			
			
			
		}

	

}
