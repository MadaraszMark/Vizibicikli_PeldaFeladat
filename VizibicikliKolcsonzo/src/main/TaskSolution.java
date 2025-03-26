package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskSolution {
	
	List<Kolcsonzes> kolcsonzes = new ArrayList<Kolcsonzes>();
	
	public void writeDataToList() {
		ReadDataFromFile readDataObj = new ReadDataFromFile();
		kolcsonzes = readDataObj.getDataFromTxt();
	}
	
	public void printAllData() {
		System.out.printf("%-10s %-15s %-20s %-20s %-25s %s%n", "Név", "Azonosító", "Elvitel órája", "Elvitel perce", "Visszahozatal órája", "Visszahozatal perce");
		for (Kolcsonzes kolcsonzes : kolcsonzes) {
			System.out.println(kolcsonzes.toStringDivider());
		}
	}
	
	public int printAllRent() {
		int all = 0;
		for (Kolcsonzes kolcsonzes : kolcsonzes) {
			all++;
		}
		System.out.println("Napi kölcsönzések száma: " +all);
		return all;
	}
	
	public void searchTodayRentals() {
		String searchedName;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Kérem adja meg a nevét: ");
			searchedName = br.readLine();
			boolean found = false;
			
			for (Kolcsonzes kolcsonzes : kolcsonzes) {
				if (kolcsonzes.getName().equals(searchedName)) {
					if (!found) {
	                    System.out.println(searchedName + " kölcsönzései:");
	                    found = true;
	                }
	                System.out.printf("%02d:%02d-%02d:%02d%n",
	                		kolcsonzes.getPickUpHour(), kolcsonzes.getPickUpminute(), kolcsonzes.getReturnHour(), kolcsonzes.getReturnMinute());
				}
			}
			if(!found) {
				System.out.print("Ilyen nevű kölcsönző nem található!");
			}
			
		} catch (Exception e) {
			System.err.println("Hiba történt az adatbevitel során: " + e.getMessage());
		}
	}
	
	public void searchByTime() {
		String timeInput;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Kérem adjon meg egy időpontot óra:perc alakban: ");
			timeInput = br.readLine();
			
			String[] timeParts = timeInput.split(":");
			int hourInput = Integer.parseInt(timeParts[0]);
			int minuteInput = Integer.parseInt(timeParts[1]);
			for (Kolcsonzes kolcsonzes : kolcsonzes) {
				if(kolcsonzes.getReturnHour() >= hourInput ) {
					System.out.printf("%02d:%02d-%02d:%02d%n",
	                		kolcsonzes.getPickUpHour(), kolcsonzes.getPickUpminute(), kolcsonzes.getReturnHour(), kolcsonzes.getReturnMinute());
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
