package org.pratap.java8.functional.consumer;

import java.util.function.Consumer;

public class ConsumerMain01 {

	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println(s);
		c.accept("Hello");
		c.accept("Pratap Narayan");
	}

}
