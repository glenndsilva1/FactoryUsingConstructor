package mylambdaprac;

import java.util.HashMap;
import java.util.Map;

public class Palette {
	private final Map<Integer, Color> colors = new HashMap<>();

	Color take(int color) {
		return this.colors.computeIfAbsent(color, Color::new);
	}

	public static void main(String args[]){
		Palette p = new Palette();
		Color c1 = p.take(45);
		System.out.println(c1.intcolor());
		Color c2 = p.take(45);
		System.out.println(c2.intcolor());
		System.out.println(p.colors.size());
	}
}
