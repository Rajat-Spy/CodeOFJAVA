package arrayListTutorial;

import java.util.ArrayList;
import java.util.List;

public class ArraylistLearn {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Mango");
		List<String> vegiee = new ArrayList<>();
		vegiee.add("Tomato");
		vegiee.add("Potato");
		vegiee.add("Corriander");
		fruits.addAll(vegiee);
		fruits.set(0, "Guava");
		fruits.removeAll(vegiee);
		System.out.println(fruits);

	}

}
