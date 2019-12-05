import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Day1 {
	
	static List<String> mass;
	static int fuelSum = 0;
	
	public static void readMassFromFile() {
		try {
			mass = Files.readAllLines(new File("./src/input.txt").toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static int findFuelFromMass(int mass) {
		return (int) (mass / 3) - 2;
	}

	public static int totalFuel() {
		readMassFromFile();
		for(String i : mass) {
			
				fuelSum += findFuelFromMass(Integer.parseInt(i));
			
		}
		return fuelSum;
	}
	
	public static void main (String[] args) {
		System.out.println(totalFuel());
	}
	
}
