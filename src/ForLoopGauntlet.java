
public class ForLoopGauntlet {
	public static void main(String[] args) {
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
		for (int i = 100; i > -1; i--) {
			System.out.println(i);
		}
		for (int i = 2; i < 101; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		for (int i = 0; i < 501; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is even");
			}
			if (i % 2 == 1) {
				System.out.println(i + " is odd");
			}
		}
		for (int i = 0; i < 778; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}
		int year = 2006;
		for (int i = 0; i < 13; i++) {
			System.out.println("In " + year + " I was " + i);
			year++;

		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.println(i + "" + j);
			}
		}
	}
}
