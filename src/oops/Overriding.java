package oops;

public class Overriding {
	public static void main(String[] args) {
		HumanBeing hb = new HumanBeing();
		System.out.println(Athlete.walk(10, 2));
	}
}

class HumanBeing {
    public static int walk (int distance, int time) {
            int speed = distance / time;
            return speed;
    }
}
class Athlete extends HumanBeing {
    public static int walk(int distance, int time) {
            int speed = distance / time;
            speed = speed * 2;
            return speed;
    }
}
