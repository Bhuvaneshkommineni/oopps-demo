
class RBIBank{
	int balance;
	void deposit(int amt) {
		this.balance=this.balance+amt;
		System.out.println("from RBI sucessfully deposited amount"+amt);
	}
	void withdraw(int amt) {
		this.balance=this.balance-amt;
		System.out.println("from RBI sucessfully withdrawn amount"+amt);
	}
	void checkbalance() {
		System.out.println("from RBI avl balance" +this.balance);
	}
}
class SBIBank extends RBIBank{
	public SBIBank(int balance) {
		this.balance=balance;
	
	}
	void deposit(int amt) {
		if(amt<5000) {
	}
		this.balance=this.balance+amt;
		System.out.println("from SBI sucessfully deposited amount"+amt);
		
}
	else {
		System.out.println("from SBI limit exceeds");
		
	}
void withdraw(int amt) {
	if (amt<5000) {
		this.balance=this.balance-amt;
		System.out.println("from SBI sucessfully withdrawn amount"+amt);
	}
	{
		else
	}
}
class ICICIBank extends RBIBank{
	public ICICIank(int balance) {
		this.balance=balance;
	
	}
	void deposit(int amt) {
		if(amt<5000) {
	}
		this.balance=this.balance+amt;
		System.out.println("from ICICI sucessfully deposited amount"+amt);
		
}
	else {
		System.out.println("from ICICI limit exceeds");
		
	}
void withdraw(int amt) {
	if (amt<5000) {
		this.balance=this.balance-amt;
		System.out.println("from ICCI sucessfully withdrawn amount"+amt);
	}
	{
		else
	}
}
class HDFCBank extends RBIBank{
	public HDFCBank(int balance) {
		this.balance=balance;
	
	}
	void deposit(int amt) {
		if(amt<5000) {
	}
		this.balance=this.balance+amt;
		System.out.println("from HDFC sucessfully deposited amount"+amt);
		
}
	else {
		System.out.println("from HDFC limit exceeds");
		
	}
void withdraw(int amt) {
	if (amt<5000) {
		this.balance=this.balance-amt;
		System.out.println("from HDFC sucessfully withdrawn amount"+amt);
	}
	{
		else
	}
}

















package Demo28
class Demo28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBIBank sbi=new SBIBank(10000);
		ICICIBank icici=new ICICIBank(75000);
		HDFCBank hdfc=new HDFCBank(85000);
		System.out.println("for SBI bank starts");
		sbi.checkbalance();
		sbi.deposit(6000);
		sbi.checkbalance();
		sbi.deposit(67000);
		sbi.checkbalance();
		System.out.println("for SBI bank ends");
		System.out.println("for ICICI bank starts");
		icici.checkbalance();
		icici.deposit(6000);
		icici.checkbalance();
		icici.deposit(67000);
		icici.checkbalance();
		System.out.println("for ICICI bank ends");
		System.out.println("for HDFC bank starts");
		hdfc.checkbalance();
		hdfc.deposit(6000);
		hdfc.checkbalance();
		hdfc.deposit(67000);
		hdfc.checkbalance();
		System.out.println("for HDFC bank ends");

	}


