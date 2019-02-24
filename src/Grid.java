import java.util.ArrayList;

public class Grid {
	private ArrayList<int[]> grid;
	private Integer overlap;
	
	public Grid() {
		this.grid = new ArrayList<>(1000);
		
		for (int i = 0; i < 1000; i++) {
			int[] row = new int[1000];
			this.grid.add(row);
		}
		
		this.overlap = 0;
	}
	
	public void markGrid(Claim claim) {
		Integer left = claim.getLeftSpace();
		Integer top = claim.getTopSpace();
		Integer width = claim.getWidth();
		Integer height = claim.getHeight();
		Integer i = left;
		Integer j = top;
		
		while (i < left + width) {
			j = top;
			while (j < top + height) {
				int[] row = this.grid.get(i);
				switch (row[j]) {
					case 0:
						row[j] = 1;
						break;
					case 1:
						row[j] = 2;
						this.overlap++;
						break;
					default:
						break;
				}
				j++;
			}
			i++;
		}
		
	}

	public Integer getOverlap() {
		return this.overlap;
	}
}
