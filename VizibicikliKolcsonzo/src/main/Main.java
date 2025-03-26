package main;

public class Main {

	public static void main(String[] args) {
		
		TaskSolution taskSolutionObj = new TaskSolution();
		taskSolutionObj.writeDataToList();
		taskSolutionObj.printAllData();
		System.out.println("\n5.Feladat");
		taskSolutionObj.printAllRent();
		
		System.out.println("\n6.Feladat");
		taskSolutionObj.searchTodayRentals();
		
		System.out.println("\n7.Feladat");
		taskSolutionObj.searchByTime();

	}

}
