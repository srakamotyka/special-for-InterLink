package project;

public class Unemployed extends Person{

	private boolean isWorking;

	public Unemployed(String name, int age, boolean isHappy, int bankAccount, boolean isWorking) {
		super();
		this.setName(name);
		this.setAge(age);
		this.setHappy(isHappy);
		this.setBankAccount(bankAccount);
		this.setWorking(isWorking);
	}

	public boolean isWorking() {
		return isWorking;
	}

	public void setWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}

	@Override
	void work() {
		if (getBankAccount() > 0) {
			System.out.println("Since I am unemployed, I don't have any work to do! Yay!");
			setHappy(true);
			setWorking(false);
		} else {
			System.out.println("Money over! I have to find some work...");
			System.out.println("[working...]");
			setHappy(false);
			setWorking(true);
			setBankAccount((int) Math.random() * 20 + 5);
		}
	}

	@Override
	void eat() {
		if (getBankAccount() <= 0) {
			System.out.println("I don't have money to buy food! I should find some work.");
			setHappy(false);
		} else {
			System.out.println("It's eating time!");
			System.out.println("[eating...]");
			setHappy(true);
			setBankAccount(getBankAccount() - ((int) (Math.random() * 20 + 5)));
		}
	}

	@Override
	void sleep() {
		System.out.println("I can do it all the time.");
		System.out.println("[sleeping...]");
		setHappy(true);
	}

	@Override
	public String toString() {
		return "Unemployed [Name = " + getName()
				+ ", age = " + getAge()
				+ ", bank account balance = " + getBankAccount()
				+ ", isHappy = " + isHappy()
				+ ", isWorking = " + isWorking() + "]";
	}

}
