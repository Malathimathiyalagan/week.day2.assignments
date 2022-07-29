package week.day2.assignments;

public class AxisBank extends BankInfo {

		public void deposit() {
				System.out.println("Deposit with interest 7%");

			}
			public static void main(String[] args) {
				AxisBank obj= new AxisBank();
				obj.deposit();
				obj.fixed();
				obj.saving();
			
		
		}
}
