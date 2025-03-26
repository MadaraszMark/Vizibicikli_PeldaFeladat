package main;

public class Kolcsonzes {
	
	private String name;
	private String id;
	private int pickUpHour;
	private int pickUpminute;
	private int returnHour;
	private int returnMinute;
	
	public Kolcsonzes(String name, String id, int pickUpHour, int pickUpminute, int returnHour, int returnMinute) {
		super();
		this.name = name;
		this.id = id;
		this.pickUpHour = pickUpHour;
		this.pickUpminute = pickUpminute;
		this.returnHour = returnHour;
		this.returnMinute = returnMinute;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public int getPickUpHour() {
		return pickUpHour;
	}

	public int getPickUpminute() {
		return pickUpminute;
	}

	public int getReturnHour() {
		return returnHour;
	}

	public int getReturnMinute() {
		return returnMinute;
	}

	@Override
	public String toString() {
		return "Kolcsonzes [nev=" + name + ", id=" + id + ", pickUpHour=" + pickUpHour + ", pickUpminute=" + pickUpminute
				+ ", returnHour=" + returnHour + ", returnMinute=" + returnMinute + "]";
	}
	
	public String toStringDivider() {
		return String.format("%-10s %-15s %-20s %-20s %-25s %s", name, id, pickUpHour, pickUpminute, returnHour, returnMinute);
	}
	
	

}
