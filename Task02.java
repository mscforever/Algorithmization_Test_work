package edu.training.les18.testwork;

public class Task02 {

	// Составить программу вычисления значений функции f(x) из задачи 1 для n
	// значений аргумента x, равномерно распределенных на отрезке [a, b]. Для
	// проверки программы задать n = 10; a = 0.50; b = 1.00. Результаты выдать в
	// виде таблицы, в каждой строке порядковый номер, значение аргумента и значение
	// функции с шестью знаками после запятой

	public static void main(String[] args) {

		int n = 10;
		double a = 0.5;
		double b = 1.0;

		System.out.println("---------------------------");
		System.out.println("| № |    x     |   f(x)   |");
		System.out.println("---------------------------");

		double x = 0.5;
		for (int i = 1; i <= n; i++) {
			x = x + (b - a) / n;
			double result = Math.sqrt(Math.exp(2.2 * x)) - Math.abs(Math.sin((Math.PI * x) / (x + 2.0 / 3.0))) + 1.7;
			System.out.printf("|%2d | %.6f | %.6f |\n ", i, x, result);
			System.out.println("--------------------------");
		}
	}

}