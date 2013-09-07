public class Epsilon {

	/**
	 * Вычисление machine_epsilon - минимального расстояния между единицей и
	 * следующим большим числом.
	 * @param args
	 */
	public static void main(String[] args) {
		float f = 1;
		while (1 + f > 1) {
			f /= 2;
		}
		f *= 2;
		System.out.println(f);
		double d = 1;
		while (1 + d > 1) {
			d /= 2;
		}
		d *= 2;
		System.out.println(d);
	}

}
