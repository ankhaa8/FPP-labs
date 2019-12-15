package lab3_3;

public class Top {
	int t = 1;
	Middle mid;
	Middle.Bottom midbot;
	public Top(){
		mid = new Middle();
		//midbot = new Middle().new Bottom(); 
	}
	// returns the value in the instance vble of Bottom
	int readBottom() {
		// implement
		
		return t;
	}

	class Middle {
		int m = 2;

		// returns sum of instance vble in Top and
		// instance vble in Bottom
		int addTopAndBottom() {
			// implement
			return t+m;
		}

		class Bottom{
			int b = 3;

			// returns the product of the instance vbles
			// in all three classes
			int multiplyAllThree() {
				// implement
				return t+m+b;
			}
		}
	}

	public static void main(String[] args) {
		Top top = new Top();
		System.out.println(top.readBottom());
		System.out.println(top.mid.addTopAndBottom());
		System.out.println(top.midbot.multiplyAllThree());
	}
}