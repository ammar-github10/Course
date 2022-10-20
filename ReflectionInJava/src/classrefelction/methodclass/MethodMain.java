package classrefelction.methodclass;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MethodMain {
	public static void main(String[] args) {
	    try {

	      // create an object of Dog
	      Dog d1 = new Dog();

	      // create an object of Class
	      // using getClass()
	      Class obj = d1.getClass();

	      // using object of Class to
	      // get all the declared methods of Dog
	      Method[] methods = obj.getDeclaredMethods();

	      // create an object of the Method class
	      for (Method m : methods) {

	        // get names of methods
	        System.out.println("Method Name: " + m.getName());

	        // get the access modifier of methods
	        int modifier = m.getModifiers();
	        System.out.println("Modifier: " + Modifier.toString(modifier));

	        // get the return types of method
	        System.out.println("Return Types: " + m.getReturnType());
	        System.out.println(" ");
	      }
	    }
	    catch (Exception e) {
	      e.printStackTrace();
	    }
	  }

}
