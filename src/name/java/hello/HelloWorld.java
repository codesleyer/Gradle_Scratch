/**
 * 
 */
package name.java.hello;

import org.joda.time.LocalTime;

/**
 * @author vishesh
 *
 */
public class HelloWorld {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LocalTime currentTime = new LocalTime();
		    System.out.println("The current local time is: " + currentTime);
		 Greeter greeter = new Greeter();
		    System.out.println(greeter.sayHello());
	}

}
