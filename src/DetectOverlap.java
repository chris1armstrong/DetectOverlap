import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class DetectOverlap {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner scan = new Scanner(file);
		HashMap<Integer,Claim> claims = new HashMap<Integer,Claim>();
		
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] inputs = line.replaceAll("[^0-9 ]", " ").trim().split(" +");
			Integer id = Integer.parseInt(inputs[0]);
			Integer left = Integer.parseInt(inputs[1]);
			Integer top = Integer.parseInt(inputs[2]);
			Integer width = Integer.parseInt(inputs[3]);
			Integer height = Integer.parseInt(inputs[4]);
			Claim claim = new Claim(id, left, top, width, height);
			claims.put(claim.getId(), claim);
		}
		scan.close();
		
		Grid grid = new Grid();
		
		for(Integer i = 1; i <= claims.size(); i++) {
			grid.markGrid(claims.get(i),claims);
		}
		Integer result = grid.getOverlap();
		System.out.println("result = " + result);
		for(Integer i = 1; i <= claims.size(); i++) {
			if (!claims.get(i).getOverlap()) {
				System.out.println("Non overlapping ID = " + i);
			}
		}
	}
}
