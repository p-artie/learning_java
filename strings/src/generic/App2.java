package generic;

import java.util.ArrayList;

public class App2 {
	public static void main(String[] args) {
		ArrayList<Machine> list = new ArrayList<>();

		list.add(new Machine());
		list.add(new Machine());

		showList(list);

		ArrayList<Camera> list2 = new ArrayList<>();

		list2.add(new Camera());
		list2.add(new Camera());

		showList(list2);
	}

	public static void showList(ArrayList<? extends Machine> list1) {
		for (Machine value : list1) {
			System.out.println(value);
			value.start();
		}
	}

}
