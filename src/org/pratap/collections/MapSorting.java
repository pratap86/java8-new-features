package org.pratap.collections;

import java.util.HashMap;
import java.util.Map;

public class MapSorting {

	public static void main(String[] args) {

		// let's create a map with Java releases and their code names
        Map<String, String> codenames = new HashMap<String, String>();
        
        codenames.put("JDK 1.1.4", "Sparkler");
        codenames.put("J2SE 1.2", "Playground");
        codenames.put("J2SE 1.3", "Kestrel");
        codenames.put("J2SE 1.4", "Merlin");
        codenames.put("J2SE 5.0", "Tiger");
        codenames.put("Java SE 6", "Mustang");
        codenames.put("Java SE 7", "Dolphin");
	}

}
