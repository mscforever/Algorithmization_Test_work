package edu.training.les18.testwork;

public class Task01 {
	public static void main(String[] args) {

		// Написать приведенную формулу по правилам языка программирования.

		double x = 0.5;
		double result;
		double temp;
		// sin(pi * x / (x + 2/3))
		// проверка не равен ли знаменатель нулю, чтобы зря дальше не считать
		temp = x + 2.0 / 3.0;
		if (temp != 0) {
			result = Math.sqrt(Math.exp(2.2 * x)) - Math.abs(Math.sin((Math.PI * x) / (x + 2.0 / 3.0))) + 1.7;
		} else {
			System.out.println("Знаменатель не может быть равен 0.");
			result = Double.NaN;
		}

		System.out.printf("Результат: %.5f", result);
	}
}