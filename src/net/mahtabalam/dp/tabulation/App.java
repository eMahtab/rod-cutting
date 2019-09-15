package net.mahtabalam.dp.tabulation;

public class App {
	public static void main(String[] args) {
		int[] prices = { 2, 5, 7, 3 };
		int rodLength = 5;
		RodCutting rodCutting = new RodCutting(prices, rodLength);
		int maximumProfit = rodCutting.solve();
		System.out.println("Maximum Profit : " + maximumProfit);
		rodCutting.showCuts();
	}
}
