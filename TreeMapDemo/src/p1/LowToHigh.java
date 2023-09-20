
	package p1;

	 

	import java.util.Comparator;

	 

	public class LowToHigh implements Comparator<Account> {

	 

		@Override

		public int compare(Account o1, Account o2) {

			

			return(int)(o1.getBankBal()-o2.getBankBal());

		}

		

	 

	}

