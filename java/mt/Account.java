class Account {
	private int balance = 0;
	public void deposit(int money) {
		int total = balance + money;
		balance = total;
	}
}