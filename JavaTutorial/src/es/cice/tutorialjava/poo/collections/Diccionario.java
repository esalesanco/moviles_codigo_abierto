package es.cice.tutorialjava.poo.collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Diccionario {
	Map<Character, List<String>> buffer;
	
	public Diccionario(String file) throws FileNotFoundException {
		super();
		
		buffer = new HashMap<>();
		
		FileInputStream in = new FileInputStream(file);
		Scanner sc = new Scanner(in);
		
		load(sc);
	}

	private void load(Scanner sc) {
		while (sc.hasNext()) {
			String line = sc.nextLine();
			
			if (line.length() > 0) {
				char c = line.charAt(0);
				List<String> list = buffer.get(c);
				
				if (list == null) {
					list = new ArrayList<>();
					buffer.put(c, list);
				}
				
				list.add(line);
			}
		}
	}

	public void print() {
		Set<Character> keys = buffer.keySet();

		for (Character key : keys) {
			List<String> list = buffer.get(key);
			System.out.println("[" + key + "]:");

			for (String str : list) {
				System.out.println(str);
			}
		}
	}
}
