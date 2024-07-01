package edu.training.les18.testwork;

public class Task03 {

	public static void main(String[] args) {

		// Составить программу для вычисления результат по формуле.
		// В качестве входных параметров задать x = 0.5; n = 20;

		double x = 0.5;
		int n = 20;
		double result = 0;

		for (int k = 1; k <= n; k++) {
			result += Math.sqrt(n * Math.PI) * e(k, x);
		}

		System.out.println("Result = " + result);

	}

	public static double e(int k, double x) {
		double result;
		result = (Math.sin(k * x / 2) + Math.sin((k * x - 1) / 2)) / Math.exp(x - 1.0 / k);
		return result;

	}

}
