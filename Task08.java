package edu.training.les18.testwork;

public class Task08 {

	// Составить программу, вычисляющую значения функции до тех пор, пока не 
	// будет пройден нуль функции. Значения аргумента x должны составлять
	// возрастающую арифметическую програссию с заданным начальным членом
	// 0.1 и разностью 0.1. Для того, чтобы не произошло зацикливания, установить
	// предел изменения аргумента x = 10.

	public static void main(String[] args) {
		double x = 0.1;
		double dx = 0.1;

		while ((x <= 10) && (f(x) >= 0)) {
			System.out.printf("f(%.1f) = %.4f\n", x, f(x));
			x += dx;
		}
	}

	public static double f(double x) {
		return x * x - Math.exp(2 * x) + 4;
	}

}