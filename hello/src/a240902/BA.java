package a240902;

class BankAccount {

	int accountNunber = 0;
	int balance = 0;

	public void deposit(int x) {
		balance += x;
		System.out.println("저금 금액 : " + x + "원");
		System.out.println("현재 잔액 : " + balance + "원");
	}

	public void withdraw(int x) {
		if (balance < x) {
			System.out.println("잔액이 부족합니다.");
		} else {
			balance -= x;
			System.out.println("인출 금액 : " + x + "원");
			System.out.println("현재 잔액 : " + balance + "원");
		}

	}

}

public class BA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba = new BankAccount();

		ba.deposit(100000);

		ba.withdraw(30000);
	}

}
