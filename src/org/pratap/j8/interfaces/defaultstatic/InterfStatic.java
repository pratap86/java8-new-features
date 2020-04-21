package org.pratap.j8.interfaces.defaultstatic;
/**
 * 
 * @author Pratap Narayan
 * Interface static method, directly not available to its implementation
 * we can achieve it via InterfStatic.m1()
 *
 */
public interface InterfStatic {

	static void m1() {
		System.out.println("InterfStatic static m1() method");
	}
}
