package main.java.hello;

import org.joda.time.LocalTime;

/**
 * <pre>
 * User: clean_brain
 * Date: 2023-11-11
 * Comments: 
 * </pre>
 */
public class HelloWorld {
	public static void main(String[] args) {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);

		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());
	}
}
