	package p1;

	 

	import java.util.Objects;

	 

	public class Account implements Comparable<Account> {

		private String accHol;

		private int accNum;

		private String branch;

		private String ifscCode;

		private int insurance;

		private float bankBal;

		public Account(String accHol, int accNum, String branch, String ifscCode, int insurance, float bankBal) {

			super();

			this.accHol = accHol;

			this.accNum = accNum;

			this.branch = branch;

			this.ifscCode = ifscCode;

			this.insurance = insurance;

			this.bankBal = bankBal;

		}

		public Account() {

			super();

			// TODO Auto-generated constructor stub

		}

		public String getAccHol() {

			return accHol;

		}

		public void setAccHol(String accHol) {

			this.accHol = accHol;

		}

		public int getAccNum() {

			return accNum;

		}

		public void setAccNum(int accNum) {

			this.accNum = accNum;

		}

		public String getBranch() {

			return branch;

		}

		public void setBranch(String branch) {

			this.branch = branch;

		}

		public String getIfscCode() {

			return ifscCode;

		}

		public void setIfscCode(String ifscCode) {

			this.ifscCode = ifscCode;

		}

		public int getInsurance() {

			return insurance;

		}

		public void setInsurance(int insurance) {

			this.insurance = insurance;

		}

		public float getBankBal() {

			return bankBal;

		}

		public void setBankBal(float bankBal) {

			this.bankBal = bankBal;

		}

		@Override

		public String toString() {

			return "Account [accHol=" + accHol + ", accNum=" + accNum + ", branch=" + branch + ", ifscCode=" + ifscCode

					+ ", insurance=" + insurance + ", bankBal=" + bankBal + "]";

		}

		@Override

		public int hashCode() {

			return Objects.hash(accHol, accNum, bankBal, branch, ifscCode, insurance);

		}

		@Override

		public boolean equals(Object obj) {

			if(obj instanceof Account)

			{

				Account account = (Account)obj;

				boolean a = account.accHol.equals(this.accHol);

				boolean b = account.accNum==this.accNum;

				boolean c = account.branch.equals(this.branch);

				boolean d = account.ifscCode.equals(this.ifscCode);

				boolean e = account.insurance==this.insurance;

				boolean f = account.bankBal==this.bankBal;

				

				return a && b && c && d && e && f;

			}

			else

			{

				return false;

			}

			

		}

		@Override

		public int compareTo(Account account) {

			return this.getIfscCode().compareTo(account.getIfscCode());

			

			

		}

	 

	 

		

	}


