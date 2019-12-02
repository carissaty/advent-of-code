import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Day1 {
	
	static List<String> mass;
	
	public static void readMassFromFile() {
		try {
			mass = Files.readAllLines(new File("/Users/carissa/eclipse-workspace/AoC/Day1/src/text.txt").toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static int findFuelFromMass(int mass) {
		return (int) (Math.floor(mass / 3) - 2);
	}

	public static void main (String[] args) {
		readMassFromFile();
		for(String i : mass) {
			System.out.println(findFuelFromMass(Integer.parseInt(i)));
		}				
	}
	
}
