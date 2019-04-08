package com.test.classloader;

public class ClassLoader {
	
	public static void main(String [] args) {
		/*Lets print the classloader name of current class
		System classloader will load this class*/
	
		Class c=ClassLoader.class;
		System.out.println(c.getClassLoader());
		
		/*If we print the classloader name String, it will print null because 
		 * it is an in built class which is found in rt.jar(runtime.jar),so it is loaded by Bootstrap classloader*/
		
		System.out.println(String.class.getClassLoader());
		 
	}

}
