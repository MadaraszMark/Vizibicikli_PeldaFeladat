package main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReadDataFromFile {
	
	public List<Kolcsonzes> getDataFromTxt() {
		List<Kolcsonzes> kolcsonzes = new ArrayList<Kolcsonzes>();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("adatok/kolcsonzesek.txt"), "UTF-8"));
			String header = br.readLine();
			while(br.ready()) {
				String row = br.readLine();
				kolcsonzes.add(getKolcsonzesFromRow(row));
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.err.println("A fájl nem található!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return kolcsonzes;
		
	}
	
	public Kolcsonzes getKolcsonzesFromRow(String row) {
		String[] rowData = row.split(";");
		Kolcsonzes kolcsonzes = new Kolcsonzes(
				rowData[0], 
				rowData[1], 
				Integer.parseInt(rowData[2]), 
				Integer.parseInt(rowData[3]),
				Integer.parseInt(rowData[4]),
				Integer.parseInt(rowData[5])
			);
		return kolcsonzes;
	}

}
