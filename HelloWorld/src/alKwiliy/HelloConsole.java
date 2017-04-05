package alKwiliy;

import hsa_new.Console;

public class HelloConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console c = new Console();
		int age = 0;
		c.println("Enter your age");
		age = c.readInt();
		c.println("You entered:" + age);
		age = age + 20;
		c.println("In 20 years, you will be " + age);

	}

}
