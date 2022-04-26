package complexDataStrucs;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class App {

	public static String[] vehicles = { "ambulance", "helicopter", "lifeboat" };

	public static String[][] drivers = { { "Fred", "Sue", "Pete" }, { "Sue", "Richard", "Bob", "Fred" },
			{ "Pete", "Mary", "Bob" }, };

	public static void main(String[] args) {

		Map<String, Set<String>> personnel = new HashMap<>();

		for (int i = 0; i < vehicles.length; i++) {
			String vehicle = vehicles[i];
			String[] driversList = drivers[i];

			Set<String> driverSet = new LinkedHashSet<String>();

			for (String driver : driversList) {
				driverSet.add(driver);
			}
			personnel.put(vehicle, driverSet);
		}
		/*
		 * Example usage Set<String> driversList = personnel.get("helicopter");
		 * 
		 * for(String driver: driversList) { System.out.println(driver); }
		 */
		// Iterate through the whole thing
		for (String vehicle : personnel.keySet()) {
			Set<String> driversList = personnel.get(vehicle);
			System.out.print(vehicle + ": ");

			for (String driver : driversList) {
				System.out.print(driver + " ");

			}
			System.out.println("\n");
			System.err.println("This is in red");
		}

	}
}
