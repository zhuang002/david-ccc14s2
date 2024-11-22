import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static HashMap<String, String> pairs = new HashMap<>();
	static String[] names;
	
	public static void main(String[] args) {
		buildPairs();
		
		/**
		 * for (int i=0;i<names.length;i++) {
		 * 	String name = names[i];
		 * }
		 */
		for (String name:names) {
			String partner = pairs.get(name);
			if (!pairs.get(partner).equals(name) || name.equals(partner)) {
				System.out.println("bad");
				return;
			}
		}
		System.out.println("good");
		

	}

	private static void buildPairs() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		names = new String[n];
		
		for (int i=0;i<n;i++) {
			names[i] = sc.next();
			
		}

		
		for (int i=0;i<n;i++) {
			String partner = sc.next();
			pairs.put(names[i], partner);
			
		}
		
	}

}
