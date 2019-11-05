package org.pratap.concurrency;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

	public static void main(String[] args) {

//		Map<Character, LongAdder> occurances = new Hashtable<>();
		ConcurrentMap<Character, LongAdder> occurances = new ConcurrentHashMap();
		
		String str = "ABCD ABCD ABCD";
		
		for(Character ch :str.toCharArray()) {
			/*LongAdder longAdder = occurances.get(ch);
			if(longAdder == null) {
				longAdder = new LongAdder();
			}
			longAdder.increment();
			occurances.put(ch, longAdder);*/
			
			// java 8 way
			occurances.computeIfAbsent(ch, chr -> new LongAdder()).increment();
		}
		System.out.println(occurances);
	}

}
