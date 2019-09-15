package net.mahtabalam.dp.tabulation;

public class RodCutting {
	int [] prices;
	int rodLength;
	int[][] dpTable;
	public RodCutting(int[] prices, int rodLength) {
		this.prices = prices;
		this.rodLength = rodLength;
		dpTable = new int[prices.length + 1][rodLength + 1];
	}

	public int solve() {
		 
		for (int i = 1; i <= prices.length; i++) {
			for (int j = 1; j <= rodLength; j++) {
				if (i > j) {
					dpTable[i][j] = dpTable[i - 1][j];
				} else {
					dpTable[i][j] = Math.max(dpTable[i - 1][j], prices[i - 1] + dpTable[i][j - i]);
				}
			}
		}
		return dpTable[prices.length][rodLength];
	}
	
	public void showCuts() {
		for(int i= prices.length, j=rodLength;  i > 0; ) {
			if(dpTable[i][j] != 0 && dpTable[i][j] != dpTable[i-1][j]) {
				System.out.println("Make a cut of " + i+"m");
				j = j -i;
			}else {
				i--;
			}
		}
	}
}
