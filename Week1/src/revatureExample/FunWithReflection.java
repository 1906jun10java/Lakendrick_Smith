package revatureExample;

import java.text.DateFormat.Field;
import java.util.Arrays;

public class FunWithReflection {
	
	public static void main(String[] args) {
		
		// REflection API
		// allow us inspect objects and classes at runtime
		
		// get a Class by its fully qualified classname (package.classname)
		try {
					
		Class clazz = Class.forName("com.revature.beans.Car");
		System.out.println(clazz.getTypeName());
		
		//get the field of a Car
		java.lang.reflect.Field[] fields = clazz.getDeclaredFields();
		System.out.println(Arrays.toString(fields));
		for(java.lang.reflect.Field f : fields) {
			
			System.out.println(f.getName());
		}
	
		
		// remember yesterday? String.split?
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
