package project;

public class JavaDeveloper extends Person {

	private int salaryPerHour;

	public JavaDeveloper(String name, int age, boolean isHappy, int salaryPerHour, int bankAccount) {
		super();
		this.setName(name);
		this.setAge(age);
		this.setHappy(isHappy);
		this.salaryPerHour = salaryPerHour;
		this.setBankAccount(bankAccount);
	}


	public int getSalary() {
		return salaryPerHour;
	}

	public void setSalary(int salaryPerHour) {
		this.salaryPerHour = salaryPerHour;
	}
	@Override
	void work() {
		System.out.println("Damn, more work...");
		System.out.println("[working...]");
		setHappy(false);
		setBankAccount(getBankAccount() + getSalary());
	}

	@Override
	void eat() {
		System.out.println("Finally, a dinner!");
		System.out.println("[eating...]");
		setHappy(true);
		setBankAccount(getBankAccount() - ((int) Math.random()*100 + 1));
	}

	@Override
	void sleep() {
		System.out.println("Sleep? What is this?");
		System.out.println("[working...]");
		setHappy(false);
		setBankAccount(getBankAccount() + getSalary());
	}

	@Override
	public String toString() {
		return "JavaDeveloper [name = " + getName()
				+ ", age = " + getAge() + ", salary per hour = " + getSalary()
				+ ", bank account balance = " + getBankAccount()
				+ ", isHappy = " + isHappy() + "]";
	}

}
